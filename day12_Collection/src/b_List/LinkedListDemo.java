package b_List;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		//1\����
		list.add("hello");
		list.add("world");
		list.add("java");
		list.add("shujuku");
		
		list.add(2,"hellokimi");
		
		
		LinkedList a1=new LinkedList();
		a1.add("kk");
		a1.add("bb");
		a1.add("ll");
		
		list.addFirst("hehe");
		list.addLast("zaijian");
		
	//	list.clear();
		
	//	list.contains("haha");
	//	System.out.println(list.contains("haha"));
	
	//	list.get(2);
	//	System.out.println(list.get(2));
		
	//	list.element();  //��ȡ�����Ƴ����б��ĵ�һ��Ԫ��
	//	System.out.println(list.element());
		
	//	list.removeFirst();  //�Ƴ������ش��б��ĵ�һ��Ԫ��
	//	System.out.println(list.removeFirst());
		
	//	list.removeLast(); //�Ƴ������ش��б������һ��Ԫ��
	//	System.out.println(list.removeLast());
		
	//	list.size();
	//	System.out.println(list.size());
		
	//	list.addAll(a1);
	//	System.out.println(list);
		
	//	list.set(2, "baobao");  //�����б���ָ��λ���滻Ϊָ����Ԫ��
	//	System.out.println(list);
		
	//	list.add(4,"xiongmao");  //�ڴ��б���ָ��λ�ò���ָ����Ԫ�أ��ƶ���ǰ�ڸ�λ�õ�Ԫ�أ�����У������к���Ԫ�ض�������
	//	System.out.println(list);
		
	//	list.remove("java"); //�Ƴ�ָ��λ�õ�ָ��Ԫ��
	//	System.out.println(list);
		
	//	list.indexOf("baobao");//���ش��б���ָ��Ԫ���״γ��ֵ�λ�ã����û�� �ͷ���i-1��
	//	System.out.println(list.indexOf("baobao"));
		
	//	list.lastIndexOf("hello");//���ش��б������һ�γ������Ԫ�ص�λ�� û�оͷ���-1
	//	System.out.println(list.lastIndexOf("hello"));
		
	//	list.peek();//��ȡ�����Ƴ����б��ĵ�һ��Ԫ��
	//	System.out.println(list.peek());
		
	//	list.poll();//��ȡ���Ƴ����б��ĵ�һ��Ԫ��
	//	System.out.println(list.poll());
		
	//	list.offer("nihao");  ��ָ��Ԫ�����ӵ����б���ĩβ
	//	System.out.println(list);
		
	//	list.offerFirst("HAHHA");//�ڴ��б��Ŀ�ͷ����ָ����Ԫ��
		
	//	list.offerLast("popo");//�ڴ��б���ĩβ����ָ����Ԫ��
		
	//	list.push("keke");//����Ԫ�������б�����ʾ�Ķ�ջ
		
		
		//�Ӵ��б���ָ��λ�÷������е�
	//	System.out.println(list.listIterator(2));
		
		
		System.out.println(list);
		Iterator it = list.descendingIterator();
		while (it.hasNext()) {
			String object = (String) it.next();
			System.out.println(object);
		}
		
		
		
//		
//		LinkedList baba;
//		baba=(LinkedList)list.clone();
//		System.out.println(baba);
		
//		Object baba;
//		baba=list.clone();
//		System.out.println(list);
	}

	@Override
	public String toString() {
		return "LinkedListDemo [getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	

}