
public class TicketDemo2 {
	private static final ThreadGroup t = null;

	public static void main(String[] args) {
		Ticket2 t=new Ticket2();
		
		Thread t1=new Thread(t,"����1");
		Thread t2=new Thread(t,"����2");
		Thread t3=new Thread(t,"����3");
		Thread t4=new Thread(t,"����4");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
