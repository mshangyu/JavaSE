package priority;

public class JoinDemo extends Thread {
	
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
		}
		super.run();
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread().getName()+"开启");
		for (int i = 0; i < 100; i++) {
			System.out.println("main:"+i);
			//当i=38的时候 让当前线程给其它线程让步，自己步入线程池
			if (i==38) {
				JoinDemo jd=new JoinDemo();
				jd.start();
				//在主线程调用了jd的join方法 main线程等到jd线程的结束，才继续执行
				//假如当前线程调用了另外一个线程的joinfangf，该线程等待。
				jd.join();
			}
		}
		
		
		
		System.out.println(Thread.currentThread().getName()+"结束");

	}

}
