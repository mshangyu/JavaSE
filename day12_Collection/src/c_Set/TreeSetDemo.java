package c_Set;

import java.util.Iterator;
import java.util.TreeSet;

import bean.ComparatorByLength;

class Errs{
	
}

/*TreeSet:
 * 1��Ҫ������Ԫ�ر�����пɱ���[�������ʵ��comparable]
 * Ԫ�رȽϱ�׼��compareTo����==0 
 * */

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet ts=new TreeSet(new ComparatorByLength());
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
		ts.add("xas");
		ts.add("apple");
		ts.add("hello");
		
		//��treeset���ӵ�Ԫ��Ӧ����ͬһ�����͵ģ�
		//ts.add(123);
		
		
		for (Iterator iterator = ts.iterator(); iterator.hasNext();) {
			String object = (String) iterator.next();
			System.out.println(object);
		}
		
//		System.out.println(ts);
//		System.out.println(ts.first());
//		System.out.println(ts.last());
//		
//		TreeSet ts2=new TreeSet();
//		ts2.add(new Errs());
//		ts2.add(new Errs());
//		ts2.add(new Errs());
	}

}