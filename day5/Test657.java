//final class Person{//此处报错 不可以被继承
/*class Person{
	//final void show(){   // 当被final修饰时不可以重写
	void show(){
		System.out.println("你好");
	}
	void show1(){
		System.out.println("猫猫");
	}
	
}*/
class Student{
	final static String STUDENT_NAME="小李";//全局常量
	final String STUDENT_NAME="小李";//常量
}
/*
class Student extends Person{
	void show(){
		System.out.println("你好世界");
	}
	void show1(){
		System.out.println("猫猫好");
	}
}*/

public class Test657{
	public static void main(String[] args){
		Student s=new Student();
		//final int a=34;
		//a=23;报错  因为final修饰后 不可以被改变 
		
		Student s=new Student();//s s1都是不可以白改变的 因为这个已经为常量了
		Student s1=new Student();
		
		//int a=34;//常量
		//s.name="时间";
		//s.show1();
	}
}