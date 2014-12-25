import org.omg.CORBA.PRIVATE_MEMBER;

/*假设main线程代表的是刘备
 * public final void setDaemo(boolean on):将线程设置为守护线程
 * 如果在执行的线程都是守护线程 那么程序就会推出
 * public final void join() 让其他线程处于等待状态 直到该线程终止
 * */

public class JoinDemo {
	public static void main(String[] args) {
		daemon();
		Join j = new Join();
		Thread t1 = new Thread(j, "李世民");
		Thread t2 = new Thread(j, "李建成");
		Thread t3 = new Thread(j, "李渊");
		t3.start();
		try {
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		t1.start();
		t2.start();
		

	}

	private static void daemon() {
		Join j = new Join();

		Thread t1 = new Thread(j, "关羽");
		Thread t2 = new Thread(j, "张飞");

		t1.setDaemon(true);
		t2.setDaemon(true);

		t1.start();
		t2.start();

		for (int x = 0; x < 10; x++) {
			// Thread.currentThread()这里指的是main方法里的 其实有个main线程
			System.out.println(Thread.currentThread().getName() + "---" + x);
		}

	}

}

class Join implements Runnable {

	@Override
	public void run() {
		for (int x = 0; x < 100; x++) {
			System.out.println(Thread.currentThread().getName() + "---" + x);
		}

	}

}