//测试Person类
public class PersonTest{
	public static void main(String[] args){
	
		//实例化(构造方法)出一个对象  引用=变量=实例
		//Person geminno=new Person();//在定义类的时候[没有]自定义无参构造函数，编译系统自动插入无参构造器
		                            //在定义类的时候[有]自定义无参数构造函数，使用自定义参数构造器
		
		Person geminno=new Person();
		Person gem=new Person("高博");
		Person gemptc=new Person("高博集团",12);
		
		
		
		//对象使用：引用成员变量  引用成员方法
		
		geminno.info();
		gem.info();
		gemptc.info();
		
		
		
	}
}