/*多线程：线程任务系统的
 * 线程任务不相同的多线程：
 * 1、怎么去获取共享数据------>用了一参构造函数
 * 
 * 3、产量是否等于销量
 * 
 * wait:释放cpu 进入线程池
 * notify：唤醒
 * notify
 * 使用同一个锁来调用方法==
 * 			任意
 *  共享数据---〉锁----〉锁的方法
 *  	线程同步：数据安全   线程间通信：协作
 * */
package ipc2;

public class Test {
	public static void main(String[] args) {
		// 创建资源 共享
		Resouce r = new Resouce();
		// 创建线程任务 run方法
		Input input = new Input(r);
		Output output = new Output(r);

		// 创建线程对象：
		Thread t1 = new Thread(input);
		Thread t2 = new Thread(output);

		// 开启
		t1.start();
		t2.start();
	}

}

// 共享资源
class Resouce {
	int id;
	String name;
	boolean flag = false;// 有没有产品？
}

/*
 * 产线 产品是否卖出去了？再去确实 是否公开继续生产？ 有：1、通知销售 2、不生产 无：1、被告知 2、生产
 */
class Input implements Runnable {
	Resouce r;

	public Input(Resouce r) {
		super();
		this.r = r;
	}

	int key = 0;

	@Override
	public void run() {

		while (true) {
			synchronized (r) {
				// 1、产品是否存在？
				if (r.flag) { // 如果有产品 工人们就停产休息吧 让线程释放cpu
					try {
						r.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				// 2、产品卖完了 继续生产
				switch (key++ % 3) {
				case 0:
					r.id = 6666;
					r.name = "iphone6";
					System.out.println("生产了iphone6");
					break;
				case 1:
					r.id = 7777;
					r.name = "iphone7";
					System.out.println("生产了iphone6");
					break;
				case 2:
					r.id = 8888;
					r.name = "iphone8";
					System.out.println("生产了iphone6");
					break;
				default:
					break;
				}

				// 3、有产品了 要通知销售 修改刚开始没有产品的标记
				r.flag = true;
				r.notify();
			}

		}
	}
}

/*
 * 销售 ：是否有产品可以卖 有：1、被产线告知 2、销售 无：1、通知产线 2、休息：停止销售
 */
class Output implements Runnable {
	Resouce r = new Resouce();

	public Output(Resouce r) {
		super();
		this.r = r;
	}

	@Override
	public void run() {

		while (true) {
			synchronized (r) {
				// 1、产品？
				if (!r.flag) { // 没产品
					try {
						r.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
				// 2、销售
				System.out.println("卖了" + r.name + "\t id:" + r.id);
				// 3、完了
				r.flag = false;
				r.notify(); // 通知产线 我卖完了
			}
		}

	}
}