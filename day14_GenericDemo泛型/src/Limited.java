
public class Limited {
	
	//? super number-->number类或其父类
	public static void test(Father<?super Number>father){
		System.out.println("this is test");
	}
	//?extends number--->number类或其子类
	public static void show(Father<?extends Number> father){
		System.out.println("this is show");
	}
	public static void main(String[] args) {
		Father<Integer> f1=new Father<>();  //number子类
		Father<Object> f2=new Father<>();
		//test(f1) 报错 实参只能是number类或其子类
		test(f2);
		show(f1);
		//show（f2） 报错 实参只能是number类或其子类

	}

}
class Father<T>{}