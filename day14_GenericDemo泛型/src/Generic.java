
public class Generic {
	public static void test(Base<?>base) {//��ʱ���в��е�object��ͨ�÷���?��ʾ  ����Ա������
		System.out.println("this is test");
		

	}
	public static void main(String[] args) {
		Base<String> base=new Base<>();
		test(base);//����ȷ���������ͺ�ʵ�η���������ȫƥ�䣬���򱨴�
		Base1<Integer> in =new Base1<>();
		test(in);
		
	}
	private static void test(Base1<Integer> in) {
		System.out.println(122);
		
	}

}


class Base<String>{}
class Base1<Integer>{}
