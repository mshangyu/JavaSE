/*���̣߳��߳�����ϵͳ��
 * �߳�������ͬ�Ķ��̣߳�
 * 1����ôȥ��ȡ��������------>����һ�ι��캯��
 * 
 * 3�������Ƿ��������
 * 
 * wait:�ͷ�cpu �����̳߳�
 * notify������
 * notify
 * ʹ��ͬһ���������÷���==
 * 			����
 *  ��������---����----�����ķ���
 *  	�߳�ͬ�������ݰ�ȫ   �̼߳�ͨ�ţ�Э��
 * */
package ipc2;

public class Test {
	public static void main(String[] args) {
		// ������Դ ����
		Resouce r = new Resouce();
		// �����߳����� run����
		Input input = new Input(r);
		Output output = new Output(r);

		// �����̶߳���
		Thread t1 = new Thread(input);
		Thread t2 = new Thread(output);

		// ����
		t1.start();
		t2.start();
	}

}

// ������Դ
class Resouce {
	int id;
	String name;
	boolean flag = false;// ��û�в�Ʒ��
}

/*
 * ���� ��Ʒ�Ƿ�����ȥ�ˣ���ȥȷʵ �Ƿ񹫿����������� �У�1��֪ͨ���� 2�������� �ޣ�1������֪ 2������
 */
class Input implements Runnable {
	Resouce r;

	public Input(Resouce r) {
		super();
		this.r = r;
	}

	int key = 0;

	@Override
	public void run() {

		while (true) {
			synchronized (r) {
				// 1����Ʒ�Ƿ���ڣ�
				if (r.flag) { // ����в�Ʒ �����Ǿ�ͣ����Ϣ�� ���߳��ͷ�cpu
					try {
						r.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				// 2����Ʒ������ ��������
				switch (key++ % 3) {
				case 0:
					r.id = 6666;
					r.name = "iphone6";
					System.out.println("������iphone6");
					break;
				case 1:
					r.id = 7777;
					r.name = "iphone7";
					System.out.println("������iphone6");
					break;
				case 2:
					r.id = 8888;
					r.name = "iphone8";
					System.out.println("������iphone6");
					break;
				default:
					break;
				}

				// 3���в�Ʒ�� Ҫ֪ͨ���� �޸ĸտ�ʼû�в�Ʒ�ı��
				r.flag = true;
				r.notify();
			}

		}
	}
}

/*
 * ���� ���Ƿ��в�Ʒ������ �У�1�������߸�֪ 2������ �ޣ�1��֪ͨ���� 2����Ϣ��ֹͣ����
 */
class Output implements Runnable {
	Resouce r = new Resouce();

	public Output(Resouce r) {
		super();
		this.r = r;
	}

	@Override
	public void run() {

		while (true) {
			synchronized (r) {
				// 1����Ʒ��
				if (!r.flag) { // û��Ʒ
					try {
						r.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
				// 2������
				System.out.println("����" + r.name + "\t id:" + r.id);
				// 3������
				r.flag = false;
				r.notify(); // ֪ͨ���� ��������
			}
		}

	}
}