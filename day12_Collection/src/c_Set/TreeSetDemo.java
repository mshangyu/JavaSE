package c_Set;

import java.util.Iterator;
import java.util.TreeSet;

class Errs{
	
}

/*TreeSet:要求添加元素必须具有可比性[该类必须实现comparable]
 * 元素比较标准：compareTo（）==0 
 * */

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
		//
//		ts.add(3);
//		ts.add(23);
//		ts.add(-12);
//		ts.add(0);
//		ts.add(35);
//		ts.add(10);
		
		ts.add("abc");
		ts.add("nba");
		ts.add("cba");
		ts.add("cuba");
		ts.add("apple");
		ts.add("hello");
		
		//向treeset添加的元素应该是同一种类型的：
		//ts.add(123);
		
		
		for (Iterator iterator = ts.iterator(); iterator.hasNext();) {
			String object = (String) iterator.next();
			System.out.println(object);
		}
		
		System.out.println(ts);
		System.out.println(ts.first());
		System.out.println(ts.last());
		
//		TreeSet ts2=new TreeSet();
//		ts2.add(new Errs());
//		ts2.add(new Errs());
//		ts2.add(new Errs());
	}

}
