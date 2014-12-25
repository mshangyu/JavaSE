import java.util.Iterator;
import java.util.LinkedList;


public class LinkedListTest {
	public static void main(String[] args) {
		LinkedList link=new LinkedList();
		link.addFirst("a");
		link.addFirst("b");
		link.addFirst("c");
		Iterator it=link.iterator();
		while(it.hasNext()){
			String s=(String)it.next();
			System.out.println(s);
		}
	}

}
