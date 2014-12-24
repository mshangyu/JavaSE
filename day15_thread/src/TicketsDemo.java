//资源不共享
public class TicketsDemo extends Thread {
	 int ticket = 10;
	 int num = 0;
	
	@Override
	public void run() {
		for (int i = 0; i <=10; i++) {
			if (ticket>0) {
				ticket --;
				num ++;
				System.out.println(getName()+ "卖出了第" +
				num + "张车票，还剩" + ticket +"张车票");
			}
		}
	}
	
	public static void main(String[] args) {
		TicketsDemo t1 = new TicketsDemo();
		TicketsDemo t2 = new TicketsDemo();
		TicketsDemo t3 = new TicketsDemo();
		
		t1.setName("第一个售票窗口");
		t2.setName("第二个售票窗口");
		t3.setName("第三个售票窗口");
		
		t1.run();
		t2.run();
		t3.run();
	}

}