//��Դ������
public class TicketsDemo extends Thread {
	 int ticket = 10;
	 int num = 0;
	
	@Override
	public void run() {
		for (int i = 0; i <=10; i++) {
			if (ticket>0) {
				ticket --;
				num ++;
				System.out.println(getName()+ "�����˵�" +
				num + "�ų�Ʊ����ʣ" + ticket +"�ų�Ʊ");
			}
		}
	}
	
	public static void main(String[] args) {
		TicketsDemo t1 = new TicketsDemo();
		TicketsDemo t2 = new TicketsDemo();
		TicketsDemo t3 = new TicketsDemo();
		
		t1.setName("��һ����Ʊ����");
		t2.setName("�ڶ�����Ʊ����");
		t3.setName("��������Ʊ����");
		
		t1.run();
		t2.run();
		t3.run();
	}

}