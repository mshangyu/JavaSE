package a_Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {
	public static void main(String[] args) {
		Collection coll=new ArrayList();
		Collection co=new ArrayList();
		//Collection com=new ArrayList();
		//���һ��Ԫ��
		coll.add("Google");
		coll.add("Appale");
		coll.add("Oracle");
		
		co.add("Baidu");
		co.add("Alibaba");
		co.add("Tencent");
		co.add("Appale");
		
//		//���һ�����������е�
//		coll.addAll(co);
//		
//		System.out.println("����"+co);
//		System.out.println("����"+coll);
//		
//		
//		//2\ɾ��
//		System.out.println(coll.remove("xiaomi"));
//		System.out.println(coll.remove("Appale"));
		
		//ɾ������ ���е�Ԫ��
		//coll.removeAll(co);
		//System.out.println(coll.removeAll(co));
		//coll.clear();
		//System.out.println("����"+coll);
		
		//ȡ��������  ��ͬȥ��
		//coll.retainAll(co);
		//System.out.println("����"+coll);
		
		//3���жϲ���  �ж��Ƿ�Ϊ��
		//System.out.println(coll.isEmpty());
		//System.out.println(co.isEmpty());
		//�Ӽ��жϣ��ж��Ƿ������
		//System.out.println(coll.containsAll(co));
		//System.out.println(co.containsAll(coll));
		//��ȡ����
		//System.out.println(""+co.containsAll(coll)+co.size());
		
		//ʹ�õ�����
//		Iterator it=co.iterator();
//		System.out.println(it.next());
//		System.out.println(""+it.next()+co.size());
//		it.remove();//ɾ������һ�β����Ķ���
//		System.out.println(""+co+co.size());
//		
		//����������
		Iterator it=co.iterator();
		while (it.hasNext()) {
			Object object = (Object) it.next();
			//co.add("geminno");
			//co.remove("Baidu");
			System.out.println("object");
		}
		
		System.out.println("======================");
		for (Iterator iterator = coll.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			System.out.println(object);
		}
		System.out.println("======================");
		for(Object object:coll){
			coll.add("tes");
			coll.remove("Baidu");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("=====================");
		for(Object object:coll){
			System.out.println("coll:"+object);
		}//for eachѭ��
	
	}

}
