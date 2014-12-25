
/*面试题：
 * 
 * */
public class DieLockDemo {
	public static void main(String[] args) {
		DieLock d1=new DieLock(true);
		DieLock d2=new DieLock(false);
		d1.start();
		d2.start();

	}

}
class MyLock{
	//两把锁  两个对象
	public static final Object objA=new Object();
	public static final Object objB=new Object();
}

class DieLock extends Thread{
	private boolean flag;
	public DieLock(boolean flag) {
		this.flag=flag;
	}
	
	@Override
	public void run() {
		if (flag) {
			//while true 表示有很多种情况
			while (true) {
				synchronized (MyLock.objA) {
					System.out.println("if objA ");
					synchronized (MyLock.objB) {
						System.out.println("if objB");
					}
				}
			}
			
		}else{
			while (true) {
				synchronized (MyLock.objB) {
					System.out.println("else objB ");
					synchronized (MyLock.objA) {
						System.out.println("else objA");
					}
				}
			}
		}
		
	}
	
}