
/*匿名内部类：是一个没有名字的内部类
格式： new 类名或者接口名（）{
			重写类中接口的方法；
			或者自己定义方法；
	    }；
	理解：本质是继承了类或者实现了接口的子类匿名对象
*/

abstract class Fu{
	public abstract void show();
}



class Outer{
	public void method(){  
		new Fu(){
			public void show(){
				System.out.println("show");
			}
		};
		//如何使用show方法呢？
		new Fu(){
			public void show(){
				System.out.println("show");
			}
		}.show();
	
	}	
}



public class OuterDemo6{
	public static void main(String[] args){
	
	
	}
}