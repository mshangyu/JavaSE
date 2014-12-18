package c_Set;

import java.util.HashSet;

public class HashSetTest {
	public static void main(String[] args) {
		HashSet books=new HashSet();
	//	books.add(new A());
	//	books.add(new A());
		/*复写equals方法，返回itrue的情况下，由于hashCode不一样
		 * 因此：hashset依然当作两个对象
		 * */
		System.out.println(books.add(new A()));
		System.out.println(""+books.add(new A())+books.size());
	
		
		
		/*两对象的hashcode相同，但是，equals方法返回false
		 * 因此：hashset添加添加两个不同的元素
		 * */
		System.out.println(books.add(new B()));
		System.out.println(""+books.add(new B())+books.size());
	
	
		/*当equals返回true hashcode返回相同的值：
		 * hashset集合 认为是同一元素。所以返回false
		 * */
		System.out.println(books.add(new C()));
		System.out.println(""+books.add(new C())+books.size());
	
		//books.add(null);  最多只能添加一个null
		System.out.println(books.add(null));
		
		// 结论：如果复写了类的equals方法 也应该 复写类的hashcode方法  
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