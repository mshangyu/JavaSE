import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListDemo2 {
	public static void main(String[] args) {
		ArrayList<String> array=new ArrayList<String>();
		array.add("hello");
		array.add("world");
		array.add("java");
		//array.add(10);
		
		Iterator<String> it=array.iterator();
		while (it.hasNext()) {
			//String object = (String) it.next();
			String object=it.next();
			System.out.println(object);
		}

//		String[] strings=new String[3];
//		strings[0]="hello";
//		strings[1]="world";
//		strings[2]=0;
		
		
	}

}
