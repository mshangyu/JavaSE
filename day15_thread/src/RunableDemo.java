
public class RunableDemo implements Runnable {
	
	private int i;
	
	
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println(Thread.currentThread().getName()+"==="+i);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RunableDemo rd=new RunableDemo();
		RunableDemo rd1=new RunableDemo();
		
		Thread th =new Thread(rd);
		Thread th1=new Thread(rd1);
		
		for (int i = 0; i < 55; i++) {
			if (i==30) {
				new Thread().start();
				th.start();
				th1.start();
			}
		}
		
		
		
//		rd.run();
//		rd1.run();

	}

}