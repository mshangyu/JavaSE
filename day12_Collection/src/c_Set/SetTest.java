package c_Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {
	public static void main(String[] args) {
		//set ���� Ԫ�ز����ظ�  �ӿڲ���ֱ��ʵ��������
		Set set=new HashSet();
		
		set.add("abc");
		set.add("cba");
		set.add("bac");
		set.add("a");
		set.add("b");
	//	System.out.println(set.add("cba"));//�����ظ����
	//	System.out.println(set);

		Iterator iterator=set.iterator();
		while(iterator.hasNext()){
			String object=(String)iterator.next();
			System.out.println(object);
		}
		
		
		
		System.out.println(set);

		
	}

}
