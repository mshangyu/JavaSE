public class Class{
	//类变量
	static String  str=getStaticVar();
	//类方法
	private static String getStaticVar(){
		System.out.println("类方法");
		return"static 变量";
	}
	
	
	//实例变量
	int var;
	//实例方法
	private int getIntVar(){
		System.out.println("实例方法");
		return 123;
	}
	
	
	//静态代码块
	static{
		System.out.println("静态代码块中");
	}
	
	
	//构造方法
	public Class(){
		System.out.println("构造方法");
	}
	
	

	
	public static void main(String[] args){
		System.out.println("进入main");
		Class ci=new Class();
		System.out.println("退出main");
		
	}
	
	
	/*类的初始化顺序
	类变量初始化
	执行主线程
	实例变量初始化
	构造函数初始化
	退出主线程
	*/
	
	
}