
//����������ࣺʹ��ʵ�ָ�������г��󷽷�

public class Circle extends Shape{
	private double radius;
	//û���κι��캯��������£�����ϵͳ�Ż�����޲ι��캯��
	public Circle(){}
	public Circle(String color,double radius){
		super(color);//������Ĺ��캯��
		this.radius=radius;
	
	}
	
	public void setRadius(double radius){
		this.radius=radius;
	}
	
	//����������д
	public double calPerimeter(){
		return 2 * Math.PI * radius;
	}
	public String getType(){
		return getColor()+"Բ��";
	}
}