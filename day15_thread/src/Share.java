/*产生线程安全问题的原因：
 * 		1、多个线程在操作共享数据的情况下其他线程会对当前的线程造成干扰
 * 
 * */

public class Share implements Runnable {
	private static int ticket = 100;
	private static int num = 0;
	Object obj = new Object();

	// @Override
	// public void run() {
	// for (int i = 1; i <=10; i++) {
	//
	// synchronized (obj) {
	// if (ticket>0) {
	// try {
	// Thread.sleep(100);
	// } catch (InterruptedException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// ticket--;
	// num++;
	// System.out.println(Thread.currentThread().getName()+"卖出了第"+num+"张火车票，还剩下"+ticket+"张车票");
	// }
	// }
	//
	//
	// }

	// }

	@Override
	public void run() {
		for (int i = 0; i <= 100; i++) {
			test();
		}
	}

	public synchronized void test() {

		if (ticket > 0) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			ticket--;
			num++;
			System.out.println(Thread.currentThread().getName() + "卖出了第" + num
					+ "张火车票，还剩下" + ticket + "张车票");
		}

	}

	public static void main(String[] args) {
		Share t = new Share();
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);
		t1.setName("第一个售票窗口");
		t2.setName("第二个售票窗口");
		t3.setName("第三个售票窗口");

		t1.start();
		t2.start();
		t3.start();
	}

}
