 class Cow{
	private double weight;
	//外部类的两个重载的构造方法
	public Cow(){}
	public Cow(double weight){
		this.weight=weight;
	}
	//定义一个非静态内部类
	private class Cowleg{
		//非静态内部类的两个成员变量
		private double length;
		private String color;
		//非静态内部类的两个重载构造器
		public Cowleg(){}
		public Cowleg(double length,String color){
			this.length=length;
			this.color=color;
		}
		
		public double setLength(double length){
			this.length=length;
		}
		public double getLength(){
			return this.length;
		}
		public String setColor(String color){
			this.color=color;
		}
		public String  getColor(){
			return this.color;
		}
		
		//非静态内部类的实例方法
		public void info(){
			System.out.println("当前牛腿颜色是："+color+".高是："+weight);
		}
		
	}
	
}	
public class CowTest{
	public static void main(String[] args){
		Cowleg c1=new Cowleg(1.12,"黑白相间");
		Cow cow=new Cow(378.9);
		cow.info();
		c1.info();
	}	
}