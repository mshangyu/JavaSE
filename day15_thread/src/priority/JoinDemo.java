package priority;

public class JoinDemo extends Thread {
	
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
		}
		super.run();
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread().getName()+"����");
		for (int i = 0; i < 100; i++) {
			System.out.println("main:"+i);
			//��i=38��ʱ�� �õ�ǰ�̸߳������߳��ò����Լ������̳߳�
			if (i==38) {
				JoinDemo jd=new JoinDemo();
				jd.start();
				//�����̵߳�����jd��join���� main�̵߳ȵ�jd�̵߳Ľ������ż���ִ��
				//���統ǰ�̵߳���������һ���̵߳�joinfangf�����̵߳ȴ���
				jd.join();
			}
		}
		
		
		
		System.out.println(Thread.currentThread().getName()+"����");

	}

}
