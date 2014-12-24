public class Ticket extends Thread {
	private static int tickets = 10;

	public Ticket() {
	}

	public Ticket(String name) {
		super(name);
	}

	@Override
	public void run() {
		int tickets = 10;

		if (tickets > 0) {
			System.out.println(getName() + "正在出售第" + tickets + "张票");
			tickets--;
		}
	}

}
