/*如果一个内部类是静态的，测试类要想直接访问，
这个时候，创建对象的格式和开始的格式不一样
外部类名.内部类名 变量=new 外部类名.内部类名（）;
*/


class Outer{
	static class Inner{
		public void show(){
			System.out.println("show");
		}
		public static void show2(){
			System.out.println("show2");
		}
	}
	
	public void method(){
		Inner i=new Inner();
		i.show();
		i.show2();
	}

}




public class OuterDemo3{
	public static void main(String[] aegs){
	//如何调用show方法呢
	//Outer o=new Outer(); 可以但是 同private一样了
	//o.method();
	
	//创建对象
	//错误做法
	//Outer.Inner oi=new Outer().new Inner();
	
	//外部类名.内部类名 变量=new 外部类名.内部类名（）;
	Outer.Inner oi=new Outer.Inner();
	oi.show();
	oi.show2();
	
	//需求：调用show2有没有更简单的方式 因为show2方法是静态的
	//对于静态的可以直接用类名.方法名
	Outer.Inner.show2();
	
	//静态的 是为了方便调用
	}
}