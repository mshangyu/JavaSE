class Outer{
	int a=123;
	private String str="geminno";
	
	void run(){    //方法当中两个局部变量
		String local_var="局部变量";
		final int num=1111;
		//局部内部类
		//private class Inner{ 与局部变量一样 不能有访问说明符
		//static class Inner{  类不能使用static
		class Inner{                                  //当前代码块 是指run方法里的
			int aaa=888;
			String str="inner class";//与外部类中的成员变量同名
			//static String var="static var";      //不能定义静态变量    
			static final String s="java";  //在局部内部类中不能使用static变量
			
			void inner_run(){
				//System.out.println("内部类：成员方法"+local_var);//不能访问局部变量local-var 局部常量
				System.out.println("内部类：成员方法");
				System.out.println(a+"\t"+str);//能够访问外部成员
				System.out.println(Outer.this.str);//访问的是外部类
			}
		}
		Inner in=new Inner();
		in.inner_run();
	}//局部内部类的作用范围是run方法当中
}
public class LocalInner{   //第三方类
	public static void main(String[] args){
		Outer out=new Outer();
		out.run();
	}
}