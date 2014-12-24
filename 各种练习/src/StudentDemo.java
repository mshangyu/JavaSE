import javax.swing.text.TabableView;

/*我有一个学生 我可以对其属性设置值 我也可以获取其属性值 请用线程间通信的案例来体现
 * 资源：Student
 * 设置线程： setthread
 * 获取线程： getthread
 * 测试类： StudentDemo
 * 
 * 问题一：每个线程操作的是自己的那个学生对象
 * 怎么解决？ 让多个线程操作同一个学生对象
 * 
 * 问题2：一次赋值和获取值得操作 数据都出现了问题
 * 线程的随机性；
 * 
 * 问题三：线程操作的东西一般都是比较复杂的操作 所以我们加入了循环的操作
 * 但是这个时候 产生了更大的问题 
 * 同一个数据出现了多次     ：CPU的一点点时间足够我们执行很多次的操作
 * 					林青霞---27
 * 				  	 林青霞---27
 * 					 林青霞---27
 * 数据也出现了问题：     由于cpu的每一次的执行点应该是原子性操作
 * 				liuyi--27
 * 				林青霞--30
 * 
 * 解决线程安全问题：
 *      分析 真的是线程安全问题嘛？
 *      是多线程环境吗？是
 *      有共享数据吗？有 s对象
 *      对共享数据有多条语句操作吗？ s.name  s.age
 *      
 *      如何解决呢？
 *      把会出现的代码用同步代码给包起来
 *      
 * 问题四：  我们加入了线程同步后 依然会有问题
 * 		1、多种线程操作的时候，要保证同步，必须保证每一种类型的线程必须加同步不可以只set 不同步get
 * 		2、即使是给多种类型的线程枷锁 也必须要求是同一把锁
 * */
public class StudentDemo {
	public static void main(String[] args) {
		//创建一个学生对象
		Student s=new Student();
		SetThread st=new SetThread(s);
		GetThread gt=new GetThread(s);
		
		Thread t1=new Thread(st);
		Thread t2=new Thread(gt);
		
		t1.start();
		t2.start();
	}

}
class Student{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
}


class SetThread implements Runnable{
	private Student s;
	private int x=0;
	
	public SetThread(Student s){
		this.s=s;
	}
	
	@Override
	public void run() {
		//Student s=new Student();
		while(true){//此处代码影响线程安全问题  所以要同步
			//而且得保证这里是同一把锁 就可以用上面new出来的对象  不需要用其他的了
			//synchronized (new Object()) {
			synchronized (s) {	
				if(x%2==0){
					s.setName("林青霞");
					s.setAge(27);
				}else {
					s.setName("liuyi");
					s.setAge(30);
				}
				x++;
			}
			
		}
	}
}
class GetThread implements Runnable{
	private Student s;
	public GetThread(Student s){
		this.s=s;
	}
	@Override
	public void run() {
		//Student s=new Student();
		//保证是同一把锁 就直接用上面的new出来的s了 不要再重新new一个不一样的了
		//synchronized (new Object()) {
		while(true){
			synchronized (s) {
				System.out.println(s.getName()+"---"+s.getAge());
			}
		}
	}
}