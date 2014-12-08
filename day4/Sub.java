
 class Base{
	int a=123;
	
	void show(){
		System.out.println("base");
	}
	
	void base_show(){
		System.out.println("父类特有的方法");
	}
}


public class Sub extends Base{
	String str="sub class";//子类特有的属性

	void sub_show(){
		System.out.println("sub类特有的方法");
	}
	
	void show(){
		System.out.println("子类复写了父类的方法sub class");
	}
	
	
	public static void main(String[] args){
		//向上转型 默认积累引用 指向 子类对象
		//Base base=new Sub();//默认向上转型
		
		//System.out.println(base.a);//访问父类的属性
		
		//base.base_show();
		//base.sub_show();
		//base.show();
		
		//向下转型 子类的引用指向父类的对象
		//Sub sub=(Sub)new Base();
		//Sub sub=new Sub();
		Base base=new Sub();
		Sub a=(Sub)base;
		a.show();
		a.sub_show();
	}
	
}
		 
