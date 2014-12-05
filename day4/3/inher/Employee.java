public class Employee{
	int id;
	String name;
	double salary;
	//隐藏的无参构造函数
	
	//构造函数：不能被继承
	public Employee(){
		System.out.println("父类的无参构造函数");
	}
	//一参构造函数
	public Employee(int id){
		System.out.println("父类的一参构造函数");
		//this.id=id;
		super(id);
	}
	
	public String getName(){
		return name;
	}
	public double getsalary(){
		return salary;
	}
	
	public void info(){   //父类的info代表的是共有的
		System.out.println("id:"+id+"name:"+name+"salary:"+salary);
		System.out.println("父类的info()");
	}
	
	
}