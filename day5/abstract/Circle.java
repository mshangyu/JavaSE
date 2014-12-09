
//抽象类的子类：使命实现父类的所有抽象方法

public class Circle extends Shape{
	private double radius;
	//没有任何构造函数的情况下，编译系统才会分配无参构造函数
	public Circle(){}
	public Circle(String color,double radius){
		super(color);//抽象类的构造函数
		this.radius=radius;
	
	}
	
	public void setRadius(double radius){
		this.radius=radius;
	}
	
	//子类义务：重写
	public double calPerimeter(){
		return 2 * Math.PI * radius;
	}
	public String getType(){
		return getColor()+"圆形";
	}
}