
public class Share implements Runnable {
	private static int ticket =10;
	private static int num=0;
	
	@Override
	public void run() {
		for (int i = 1; i <=10; i++) {
			if (ticket>0) {
				ticket--;
				num++;
				System.out.println(Thread.currentThread().getName()+"卖出了第"+num+"张火车票，还剩下"+ticket+"张车票");
			}
		}

	}

	

	
	public static void main(String[] args) {
		Share t=new Share();
		Thread t1=new Thread(t);
		Thread t2=new Thread(t);
		Thread t3=new Thread(t);
		t1.setName("第一个售票窗口");
		t2.setName("第二个售票窗口");
		t3.setName("第三个售票窗口");
		
		t1.start();
		t2.start();
		t3.start();
	}

}
