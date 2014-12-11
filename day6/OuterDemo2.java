/*
需求：在main方法中能不能去调用show方法吗

外部类名.内部类名 变量==外部类对象.内部类对象
*/

class Outer{
	private String name="HelloWorld";
	
	//成员内部类
	class Inner{
		public void show(){
			System.out.println(name);
			
		}
	}
	
}


public class OuterDemo2{
	public static void main(String[] args){
		//Inner i=new Inner();
		//i.show();编译出错 不能直接创建内部类的对象
		
		//可以间接的创建内部类对象
		//外部类名.内部类名 变量==外部类对象.内部类对象
		Outer.Inner oi=new Outer().new Inner();//匿名对象
		oi.show();
	}
}