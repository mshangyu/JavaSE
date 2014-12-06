public class S{
	public static void main(String[] args){
	/*	System.out.println("我是主函数");
	}
	static{
		System.out.println("我是静态代码块");
	}
	*/
	//new Person();//匿名对象
	new Person();
	Person n=new Person();//可以使用new一个对象 也可以使用匿名对象来引用前面的方法
	//Person.show();
	}

}

class Person{
	static {
		System.out.println("我是静态代码块");
	}
	{
		System.out.println("我是构造代码块");
	}
	
	//public static void show(){
		//System.out.println("你好");
	//}
}