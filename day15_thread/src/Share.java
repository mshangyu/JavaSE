/*�����̰߳�ȫ�����ԭ��
 * 		1������߳��ڲ����������ݵ�����������̻߳�Ե�ǰ���߳���ɸ���
 * 
 * */

public class Share implements Runnable {
	private static int ticket = 100;
	private static int num = 0;
	Object obj = new Object();

	// @Override
	// public void run() {
	// for (int i = 1; i <=10; i++) {
	//
	// synchronized (obj) {
	// if (ticket>0) {
	// try {
	// Thread.sleep(100);
	// } catch (InterruptedException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// ticket--;
	// num++;
	// System.out.println(Thread.currentThread().getName()+"�����˵�"+num+"�Ż�Ʊ����ʣ��"+ticket+"�ų�Ʊ");
	// }
	// }
	//
	//
	// }

	// }

	@Override
	public void run() {
		for (int i = 0; i <= 100; i++) {
			test();
		}
	}

	public synchronized void test() {

		if (ticket > 0) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			ticket--;
			num++;
			System.out.println(Thread.currentThread().getName() + "�����˵�" + num
					+ "�Ż�Ʊ����ʣ��" + ticket + "�ų�Ʊ");
		}

	}

	public static void main(String[] args) {
		Share t = new Share();
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);
		t1.setName("��һ����Ʊ����");
		t2.setName("�ڶ�����Ʊ����");
		t3.setName("��������Ʊ����");

		t1.start();
		t2.start();
		t3.start();
	}

}