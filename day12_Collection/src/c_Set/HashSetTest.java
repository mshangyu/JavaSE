package c_Set;

import java.util.HashSet;

public class HashSetTest {
	public static void main(String[] args) {
		HashSet books=new HashSet();
	//	books.add(new A());
	//	books.add(new A());
		/*��дequals����������itrue������£�����hashCode��һ��
		 * ��ˣ�hashset��Ȼ������������
		 * */
		System.out.println(books.add(new A()));
		System.out.println(""+books.add(new A())+books.size());
	
		
		
		/*�������hashcode��ͬ�����ǣ�equals��������false
		 * ��ˣ�hashset��������������ͬ��Ԫ��
		 * */
		System.out.println(books.add(new B()));
		System.out.println(""+books.add(new B())+books.size());
	
	
		/*��equals����true hashcode������ͬ��ֵ��
		 * hashset���� ��Ϊ��ͬһԪ�ء����Է���false
		 * */
		System.out.println(books.add(new C()));
		System.out.println(""+books.add(new C())+books.size());
	
		//books.add(null);  ���ֻ������һ��null
		System.out.println(books.add(null));
		
		// ���ۣ������д�����equals���� ҲӦ�� ��д���hashcode����  
	}

}
class A{
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return true;
	}
}

class B{
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 1;
	}
}

class C{
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 2;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return true;
	}
	
	
}