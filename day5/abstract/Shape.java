
//抽象类只能被继承       通过子类 实现所有的抽象方法   实例化出对象
//不完整类                完整类

public abstract class Shape{
	//抽象类的组成：
	{
		System.out.println("执行Shape的初始化快");
	}
	private String color;//下面通setget调用
	
	
	//周长的 抽象方法:没有{}
	public abstract double  calPerimeter();
	//形状的 抽象方法：
	public abstract String getType();
	
	
	//
	public Shape(){}//构造方法的作用 被子类调用的
	public Shape(String color){
		//this()；  代表的就是上面的无参构造函数
		System.out.println("shape构造器");
		this.color=color;
	}
	
	public void setColor(String color){
		this.color=color;
	}
	public String getColor(){
		return this.color;
	}
}