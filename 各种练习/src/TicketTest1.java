import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class TicketTest1 implements Runnable {
	private int tickets=100;
	
	//private final ReentrantLock lock =new ReentrantLock();
	private Lock lock=new ReentrantLock();
	
	@Override
	public void run() {
		while(true){
			//加锁
			lock.lock();
			
			if (tickets>0) {
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+"正在出售第"+(tickets--)+"张票");
			}
			
			//释放锁
			lock.unlock();
		}
	}

	

}
