
class Student{
	{
		System.out.println("我是构造函数");
	}
	static{
		System.out.println("我是静态代码块");
	}
	
	void print(){
		System.out.println("我是普通方法");
	}
	
	public String name;//显示初始化
	
	
	private  String country;
	public void setCountry(String country){
		this.country=country;
	}
	public String getCountry(){
		return this.country;
	}
	
}

public class  Z{
	public static void main(String[] args){
		Student s=new Student();
		s.print();
		
		s.name="kk";
		System.out.println(s.name);
		
		s.setCountry("美国");
		System.out.println(s.getCountry());
	}
}