package b_List;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector v=new Vector();
		for(int i=0;i<5;i++){
			v.addElement("it-"+i);
		}
		System.out.println(v);
		
		
		for(Enumeration enumeration=v.elements();enumeration.hasMoreElements();){
			System.out.println(enumeration.nextElement());
		}
		
		
		Enumeration enumeration=v.elements();
		while (enumeration.hasMoreElements()) {
			String object=(String) enumeration.nextElement();
			System.out.println(object);
		}
	}
}
