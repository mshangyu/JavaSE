
public class Test {
	public static void main(String[] args) {
		Demo<String> demo=new Demo<String>();
		demo.print("hello");
		
		demo.method("haha");
		demo.method(10);
		demo.method(true);
	}

}
