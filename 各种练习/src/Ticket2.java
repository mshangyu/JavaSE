/*��ͬ��Ʊ���˶�� ��
 * cpu��ÿһ��ִ�� ������һ��ԭ���ԵĲ��� �������ʱ���ָܷ��
 * int i=10;��ʵ������ԭ���ԵĲ���
 * �����Ļ� ��tickets-- Ҳ����һ��ԭ���ԵĲ���  
 * �����ڲ�����ͬʱ ���������̸߳�ִ���ˣ������Ļ���ͬ��Ʊ��ִ���˶��
 * */

/*�����˸�Ʊ�����
 * 			��Ϊ�̵߳������
 * 
 * */
public class Ticket2 implements Runnable {
	private int tickets=100;
	private Object obj =new Object();
	@Override
	public void run() {
		while(true){
			//����һ�δ��������� �������� ��Ҫͬ��
			
			synchronized (obj){if(tickets>0){
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+"���ڳ��۵�"+(tickets--)+"��Ʊ");
				}
			}
			
		}
	}
}
