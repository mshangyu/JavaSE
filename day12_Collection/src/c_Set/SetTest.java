package c_Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {
	public static void main(String[] args) {
		//set 无序 元素不能重复  接口不能直接实例化对象
		Set set=new HashSet();
		
		set.add("abc");
		set.add("cba");
		set.add("bac");
		set.add("a");
		set.add("b");
	//	System.out.println(set.add("cba"));//不能重复添加
	//	System.out.println(set);

		Iterator iterator=set.iterator();
		while(iterator.hasNext()){
			String object=(String)iterator.next();
			System.out.println(object);
		}
		
		
		
		System.out.println(set);

		
	}

}
