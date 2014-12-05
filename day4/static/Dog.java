//Dog 抽象的狗

//Dog 某种品牌的狗


public class Dog{
	//属性
	//类变量
	static String type;  //品种   //类属性==类变量 ：不依赖于对象 [类名.类变量]
	
	//实例变量
	int age;
	String color; //实例变量 :依赖于对象 [对象引用.实例变量]
	
	//静态代码块
	static (//使命： 初始化类变量
		type="xxx";
		//age=32;    不能直接访问实例变量
		//color="eee";
		System.out.println("我是在static代码块中");
		
	)
	
	
	
	
	
	//方法
	Dog(){
	}
	Dog(int age,String color){
	
		this.type="哈士奇";
		this.age=age;
		this.color=color;
	}
	//实例方法:this 代表调用者的引用
	void bark(){
		this.type="泰迪";
		System.out.println("barking ...."+age+color);
	}
	
	
	
	//类方法：不能访问实例变量  ===不依赖于对象   整个作用区间和对象无关
	//类方法中 没有对象 所以不能访问实例变量实例方法
	//类方法中只能访问类变量、局部变量
	//abstract和static不能同时存在 
	static void bark1(){
		type="京巴";
		//this.age=11;
		//this.color="green";
		System.out.println("类方法");
	} 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}