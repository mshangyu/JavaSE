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
package ipc3;

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
	private int id;
	private String name;
	boolean flag = false;// ��û�в�Ʒ��

	// ͬ������ ��--this ------������������ͬ������
	// ����һ��
	public synchronized void set(int id, String name) {

		// 1����Ʒ�Ƿ���ڣ�
		if (this.flag) { // ����в�Ʒ �����Ǿ�ͣ����Ϣ�� ���߳��ͷ�cpu
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		// 2����Ʒ������ ��������
		this.id = id;
		this.name = name;
		System.out.println("������һ��" + this.name);

		// 3��֪ͨ����
		this.flag = true;
		this.notify();
	}

	// ����һ��
	public synchronized void sales() {
		// 1����Ʒ��
		if (!this.flag) { // û��Ʒ
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		// 2������
		System.out.println("����" + this.name + "\t id:" + this.id);
		// 3������
		this.flag = false;
		this.notify(); // ֪ͨ���� ��������
	}
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

				// 2����Ʒ������ ��������
				switch (key++ % 3) {
				case 0:
					r.set(6666, "iphone6");
					System.out.println("������iphone6");
					break;
				case 1:
					r.set(7777, "iphone7");
					System.out.println("������iphone7");
					break;
				case 2:
					r.set(8888, "iphone8");
					System.out.println("������iphone8");
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
			r.sales();

		}

	}
}