
public class YieldDemo {
	public static void main(String[] args) {
		Yield y =new Yield();
		
		Thread t1=new Thread(y,"Àî°×");
		Thread t2=new Thread(y,"¶Å¸¦");
		
		t1.start();
		t2.start();

	}

}
class Yield implements Runnable{

	@Override
	public void run() {
		for(int x=0;x<100;x++){
			System.out.println(Thread.currentThread().getName()+"----"+x);
			Thread.yield();
		}
		
	}
	
}