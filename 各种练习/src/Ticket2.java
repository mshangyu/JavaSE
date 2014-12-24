/*相同的票卖了多次 ：
 * cpu的每一次执行 必须是一个原子性的操作 这个操作时不能分割的
 * int i=10;其实是两个原子性的操作
 * 这样的话 ，tickets-- 也不是一个原子性的操作  
 * 可能在操作的同时 被其他的线程给执行了，这样的话相同的票就执行了多次
 * */

/*出现了负票的情况
 * 			因为线程的随机性
 * 
 * */
public class Ticket2 implements Runnable {
	private int tickets=100;
	private Object obj =new Object();
	@Override
	public void run() {
		while(true){
			//下面一段代码有问题 被共享了 需要同步
			
			synchronized (obj){if(tickets>0){
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+"正在出售第"+(tickets--)+"张票");
				}
			}
			
		}
	}
}
