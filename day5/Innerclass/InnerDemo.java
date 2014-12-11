class Outer{
	//成员变量
	int a=123;
	private String str="外部类的变量";
	
	
	//成员方法
	void run(){
		System.out.println("外部类run（）");
		Inner in=new Inner();
		in.run();
	}
	static void static_run(){
		System.out.println("外部类static_run()");
		Outer out=new Outer().new Inner();
		out.run();
	}
	
	//成员内部类:可以直接使用外部类当中特有的成员变量
	class Inner{
		final static int a=2;//不能直接使用静态变量定义
		String  str ="内部类的变量";  //在内部类还有外部类中可以共存相同的成员变量
		void run(){
			String str="局部变量";
			System.out.println("内部类run（）");
			System.out.println(a);
			System.out.println(str);
			System.out.println(this.str);//访问内部类的变量
			System.out.println(Outer.this.str);//内部类中访问同名的外部类的方法
		}
	}
}
	public  class InnerDemo{
		public static void main(String[] args){
		//外部类的使用
		//Outer outer=new Outer();
		//outer.run();
		
		//成员内部类使用的第三种位置
		//Outer.Inner inner=(new Outer()).new Inner();
		//Outer.Inner inner=new Outer().new Inner();//匿名对象
		//inner.run();
		
		Outer outer=new Outer();
		Outer.Inner in=out.new Inner();
		in.run();
		}
	}
