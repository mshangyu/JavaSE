
public class Generic {
	public static void test(Base<?>base) {//此时把行参中的object用通用泛型?表示  则可以避免错误
		System.out.println("this is test");
		

	}
	public static void main(String[] args) {
		Base<String> base=new Base<>();
		test(base);//必须确保泛型类型和实参泛型类型完全匹配，否则报错
		Base1<Integer> in =new Base1<>();
		test(in);
		
	}
	private static void test(Base1<Integer> in) {
		System.out.println(122);
		
	}

}


class Base<String>{}
class Base1<Integer>{}
