
/*如果想把动作改为依次出现的话 那么：
 * 			原理：如果我的学生属性没有值 我应该先赋值 然后才能使用
 * 				如果我的学生属性有值 应该使用后再赋值
 *   为了配合这个操作 java提供了一种机制：等待唤醒机制
 *   			notify();唤醒在此对象监视器上等待的单个线程（锁对象）
 *   			wait();
 * 		这两个方法的调用应该通过锁对象去调用
 * 
 * */

public class StudentDemo1 {
	public static void main(String[] args) {
		//创建一个学生对象
		Student1 s=new Student1();
		SetThread1 st=new SetThread1(s);
		GetThread1 gt=new GetThread1(s);
		
		Thread t1=new Thread(st);
		Thread t2=new Thread(gt);
		
		t1.start();
		t2.start();
	}

}
class Student1{
	String name;
	int age;
	boolean flag=false;//表示刚开始学生这个属性是没有值的  做标记用的
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}


}


class SetThread1 implements Runnable{
	private Student1 s;
	private int x=0;
	
	public SetThread1(Student1 s){
		this.s=s;
	}
	
	@Override
	public void run() {
		//Student s=new Student();
		while(true){//此处代码影响线程安全问题  所以要同步
			//而且得保证这里是同一把锁 就可以用上面new出来的对象  不需要用其他的了
			//synchronized (new Object()) {
			synchronized (s) {	
				//判断，如果有值 就等待
				if(s.flag){
					try {
						s.wait();
						
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				//设置值
				if(x%2==0){
					s.name="林青霞";
					s.age=27;
				}else {
					s.name="liuyi";
					s.age=30;
				}
				x++;
				
				//有值后就修改标记
				s.flag=true;
				s.notify();  //唤醒等待线程
			}
			
		}
	}
}
class GetThread1 implements Runnable{
	private Student1 s;
	public GetThread1(Student1 s){
		this.s=s;
	}
	@Override
	public void run() {
		//Student s=new Student();
		//保证是同一把锁 就直接用上面的new出来的s了 不要再重新new一个不一样的了
		//synchronized (new Object()) {
		while(true){
			synchronized (s) {
				//判断如果没有值得话 就等待
				if (!s.flag) {
					try {
						s.wait();
						//如果是t2先走那么在这里等待了 就会释放锁对象
						//将来，当它再次获取到执行权利的时候 是从哪里等待 哪里醒来
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				//有值得话就执行
				System.out.println(s.name+"---"+s.age);
				
				//当有值(flag就变成true)得时候就修改标记
				s.flag=false;
				s.notify();//唤醒等待的线程 唤醒其他的线程  不代表其他的线程就能够立即执行
			}
		}
	}
}
