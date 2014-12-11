
class Outer{
	//成员变量
	static int a=123;
	static private String str="外部类的变量";
	
	
	//静态成员内部类:   静态内部类不能访问外部类的非静态成员
	static class Inner{
		String str="gem";
		void run(){
			System.out.println(a);
			System.out.println(str);			
		}
		
		static String static_str="静态变量";
		static void static_run(){
			System.out.println("内部类静态方法");
		}
	}
	void run(){
		//对内部类的类变量、类方法访问
		System.out.println(Inner.static_str);
		Inner.static_run();
		
		//对内部类的实例变量、实例方法访问
		Inner in=new Inner();
		System.out.println(in.str);
		in.run();
	}

            

public  class StaticInnner{//第三方类
		public static void main(String[] args){
		//Outer.Inner in=new Outer.Inner();
		System.out.println(in.str);//实例变量
		//in.run();
		//in.static_run();
		//不依赖对象存在 但是用对象访问也是可以的
		System.out.println(Inner.static_str);
		Outer.Inner.static_run();
		
		}
}
		
		
		
		
	}