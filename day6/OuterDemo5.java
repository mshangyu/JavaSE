

class Outer{
	public void method(){  //在方法内部 创建一个内部类 此时是局部内部类
		final int num=100;  //局部变量
		
		class Inner{
			public void show(){
				System.out.println("show"+num);
			}
		}
		
		Inner i=new Inner();
		i.show();
	}

}










public class OuterDemo5{
	public static void main(String[] args){
		Outer o=new Outer();
		o.method();
	}
}