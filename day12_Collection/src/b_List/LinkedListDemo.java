package b_List;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		//1\增加
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
		
	//	list.element();  //获取但不移除此列表的第一个元素
	//	System.out.println(list.element());
		
	//	list.removeFirst();  //移除并返回此列表的第一个元素
	//	System.out.println(list.removeFirst());
		
	//	list.removeLast(); //移除并返回此列表的最后一个元素
	//	System.out.println(list.removeLast());
		
	//	list.size();
	//	System.out.println(list.size());
		
	//	list.addAll(a1);
	//	System.out.println(list);
		
	//	list.set(2, "baobao");  //将此列表中指定位置替换为指定的元素
	//	System.out.println(list);
		
	//	list.add(4,"xiongmao");  //在此列表的指定位置插入指定的元素，移动当前在该位置的元素（如果有），所有后续元素都向又移
	//	System.out.println(list);
		
	//	list.remove("java"); //移除指定位置的指定元素
	//	System.out.println(list);
		
	//	list.indexOf("baobao");//返回此列表中指定元素首次出现的位置，如果没有 就返回i-1；
	//	System.out.println(list.indexOf("baobao"));
		
	//	list.lastIndexOf("hello");//返回此列表中足后一次出现这个元素的位置 没有就返回-1
	//	System.out.println(list.lastIndexOf("hello"));
		
	//	list.peek();//获取但不移除此列表的第一个元素
	//	System.out.println(list.peek());
		
	//	list.poll();//获取并移除此列表的第一个元素
	//	System.out.println(list.poll());
		
	//	list.offer("nihao");  将指定元素添加到此列表的末尾
	//	System.out.println(list);
		
	//	list.offerFirst("HAHHA");//在此列表的开头插入指定的元素
		
	//	list.offerLast("popo");//在此列表的末尾插入指定的元素
		
	//	list.push("keke");//将此元素推入列表所表示的堆栈
		
		
		//从此列表的指定位置返回所有的
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
