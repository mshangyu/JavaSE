package b_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {
	public static void main(String[] args) {
		/*list���Դ洢�������ݣ�Ԫ�ؿ����ظ�������[����ʹ����������Ԫ��]
		 * ���collection�����з���;������index�ķ���*/
		
		List list=new ArrayList();
		
        //1\���Ӳ���
		list.add("Android-001");
		list.add("Android-002");
		list.add("Android-003");
		list.add("Android-004");
		list.add("Android-005");
		list.add("Android-006");
//		//System.out.println(list);
//		
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}//ʹ��forѭ�����Ԫ��
//		
//		
//		//2\��ָ��λ�ò���
//		list.add(3,"Google");  //���±�Ϊ���ĵط�����
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}//ʹ��forѭ�����Ԫ��
//		
//		System.out.println("======================");
//		
//		//3��ɾ������
//		list.remove(3);//�Ƴ�ĳ��λ�õ�
//		list.remove("Android-003");//ֱ���Ƴ�ĳ��Ԫ��
//		//list.remove(10);//�Ƴ�������λ�õ�Ԫ��  ���쳣 ʹ��try catch
//		try {
//			System.out.println(list.remove(10));
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}//ʹ��forѭ�����Ԫ��
//		
//		System.out.println("======================");
//		
//		//4���޸�
//		list.set(0, "GDG");
//		//list.set(10, "GDG");//Խ��  �׳��쳣
//		System.out.println(list.set(0, "GDG"));
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}//ʹ��forѭ�����Ԫ��
//		
//		System.out.println("======================");
//		
//		
//		//5������
//		for (Iterator it = list.iterator(); it.hasNext();) {
//			Object object = (Object) it.next();
//			System.out.println(object);
//		}
//		System.out.println("======================");
//		
//		Iterator it=list.iterator();
//		while (it.hasNext()) {
//			Object object = (Object) it.next();
//			//list.add("test");
//			System.out.println(object);
//		}
//		
		System.out.println("======================");
		
		//ListIterator:
		ListIterator iit=list.listIterator();
		while (iit.hasNext()) {
			Object object = (Object) iit.next();
			//iit.add("Alibaba");
			System.out.println(object);
		}
		
		while (iit.hasPrevious()) {
			System.out.println(iit.previous());
			
		}
		
		System.out.println(list);
		System.out.println("======================");
		 
		
		
		
		
		
		
		
		
	}

}