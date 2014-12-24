//同步方法的锁对象是？     
public class TicketTest implements Runnable {
	private static  int tickets=100;
	
	private Object obj=new Object();
	private int x=0;
	
	@Override
	public void run() {
		while(true){
			if (x%2==0) {
				//同步代码块
				//synchronized (obj) {  这里的这个对象 。。要注意
				synchronized (Ticket.class) {
					if (tickets>0) {
						try {
							Thread.sleep(10);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						System.out.println(Thread.currentThread().getName()+"正在出售第"+(tickets--)+"张票");
					}
				}
			}else {
				show();
			}
			x++;
		}

	}

	//同步方法
	//同步的代码 必须保证锁对象一致 上面的那个对象用this
	//private synchronized void show(){
	
	
	//这里使用静态同步方法 那么上面的对象就要用Ticket.class
	private static  synchronized void show(){
		if (tickets>0) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"正在出售第"+(tickets--)+"张票");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
