import java.util.ArrayList;
import java.util.Vector;


public class TicketTest1Demo {
	public static void main(String[] args) {
		TicketTest1 t=new TicketTest1();
		
		Thread t1=new Thread(t,"����1");
		Thread t2=new Thread(t,"����2");
		Thread t3=new Thread(t,"����3");
		Thread t4=new Thread(t,"����4");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
//		Vector
//		ArrayList;
		
//		HashMap;
//		java.util.Hashtable;

	}

}
