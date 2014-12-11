//本质 子类的匿名对象

interface Inner{
	public abstract void show();
	public abstract void show2();
	//public abstract void show3();
	
}

class Outer{
	public void method(){
		//一个方法的调用
		/*new Inter(){
			public void show(){
				System.out.println("show");
			}
		}.show();                //匿名对象 */
		
		//多个方法的调用 但是比较麻烦
		/*new Inter(){
			public void show(){
				System.out.println("show");
			}
			public void show2(){
				System.out.println("show2");
			}
		}.show();
		new Inter(){
			public void show(){
				System.out.println("show");
			}
			public void show2(){
				System.out.println("show2");
			}
		}.show2();  */
		
		//整体是Inter的实现类的匿名对象
		//多态
		//一般来说 这种用法基本上都是一个接口 而且接口中一般只有一个方法
		Inter i=new Inter(){
			public void show(){
				System.out.println("show");
			}
			public void show2(){
				System.out.println("show2");
			}
		};
		i.show();
		i.show2();
		
	}

}


public class OuterDemo7{
	public static void main(String[] args){
		Outer o=new Outer();
		o.method();
	
	}
}