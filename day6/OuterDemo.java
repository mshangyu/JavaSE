class Outer{
	private String name="HelloWorld";
	//成员内部类
	class Inner{
		public void show(){
			System.out.println(name);//1\内部类可以直接访问外部类的成员 包括私有
			
		}
	}
	
	public void method(){  
		//show(); method和inner 是平起的 不能直接调用Inner里面的show
		Inner i=new Inner();
		i.show();    //2、外部类要访问内部类的 必须要创建一个内部类的对象
	}
	
	
}


public class OuterDemo{
	public static void main(String[] args){
	
	}
}