package priority;

public class SleepDemo extends Thread {
	@Override
	public void run() {
		super.run();
		System.out.println("����5��");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(getName());
		System.out.println("����5�뿪ʼ");
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("main��ʼ");
		SleepDemo sd=new SleepDemo();
		sd.start();
		
		System.out.println(Thread.currentThread().getName());
		System.out.println("main����");

	}

}