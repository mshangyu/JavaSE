/*线程优先级：
 * 默认优先级是： 5
 * public final int getPriority()：获取线程优先级
 * public final void setPriority(int newPriority) ：设置线程优先级
 * 
 * 范围是1-10  这个只有在次数特别多的情况下  效果才可能比较明显
*/
public class PriorityDemo {
	public static void main(String[] args) {
		Priority p=new Priority();
		
		Thread t1=new Thread(p,"东方不败");
		Thread t2=new Thread(p,"岳不群");
		Thread t3=new Thread(p,"林平之");
		
		//获取默认线程优先级
//		System.out.println(t1.getPriority());
//		System.out.println(t2.getPriority());
//		System.out.println(t3.getPriority());
		//设置优先级
		//t1.setPriority(10000);  有问题  要注意优先级的范围
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.getPriority();
		t3.setPriority(Thread.MIN_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
class Priority implements Runnable{
	@Override
	public void run() {
		for (int x = 0; x <100; x++) {
			System.out.println(Thread.currentThread().getName()+"------"+x);
		}
		
	}
}