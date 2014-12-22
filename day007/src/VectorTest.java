import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;


public class VectorTest {
	public static void main(String[] args) {
		
		Vector v=new Vector();
		v.addElement("hello");
		v.addElement("world");
		v.addElement("nihao");
		
		for(int x=0;x<v.size();x++){
			String s=(String)v.elementAt(x);
			System.out.println(s);
		}
		System.out.println("---------");
		
		
		Enumeration en=v.elements();
		while(en.hasMoreElements()){
			String s =(String)en.nextElement();
			System.out.println(s);
		}
	}

}
