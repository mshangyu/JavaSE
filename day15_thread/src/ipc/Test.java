/*多线程：线程任务系统的
 * 线程任务不相同的多线程：
 * 1、怎么去获取共享数据------>用了一参构造函数
 * 2、怎么保证输入和输出  线程同步？
 * 3、产量是否等于销量
 * 
 * 
 * */
package ipc;

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
}

/* 产线 产品是否卖出去了？再去确实 是否公开继续生产？
				有：1、通知销售 2、不生产
				无：1、被告知  2、生产
*
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
			}

		}
	}
}

/* 销售  ：是否有产品可以卖
有：1、被产线告知  2、销售
无：1、通知产线  2、休息：停止销售
*
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
				System.out.println("卖了" + r.name + "\t id:" + r.id);
			}
			
		}
	}
}