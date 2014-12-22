import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList oldarrayList=new ArrayList();
		oldarrayList.add("hello");
		oldarrayList.add("world");
		oldarrayList.add("java");
		oldarrayList.add("java");
		oldarrayList.add("world");
		oldarrayList.add("nihao");
		oldarrayList.add("hello");
		oldarrayList.add("hello");

		ArrayList newArrayList=new ArrayList();
		for(int x=0; x < oldarrayList.size();x++){
			String s=(String)oldarrayList.get(x);
			
			if(!newArrayList.contains(s)){
				newArrayList.add(s);
			}
		}
		
		Iterator it=newArrayList.iterator();
		while (it.hasNext()) {
			String type = (String) it.next();
			System.out.println(type);
		}
	}

}
