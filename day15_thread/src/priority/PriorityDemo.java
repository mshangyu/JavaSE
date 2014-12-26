package priority;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class PriorityDemo {
	private static final int MaximizeAction = 0;

	public static void main(String[] args) {
		Demo demo1=new Demo("线程1");
		Demo demo2=new Demo("线程2");
		Demo demo3=new Demo("线程3");
		
		demo1.start();
		demo2.start();
		demo3.start();
		demo1.setPriority(Thread.MAX_PRIORITY);
		demo3.setPriority(Demo.MIN_PRIORITY);
	}

}
class Demo extends Thread{
	String name;
	public Demo(String name){
		super();
		this.name=name;
		this.setName(name);
		
	}
	@Override
	public void run() {
		super.run();
		System.out.println(getName()+"priority"+getPriority());
		
	}
}