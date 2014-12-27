/*���̣߳��߳�����ϵͳ��
 * �߳�������ͬ�Ķ��̣߳�
 * 1����ôȥ��ȡ��������------>����һ�ι��캯��
 * 2����ô��֤��������  �߳�ͬ����
 * 3�������Ƿ��������
 * 
 * 
 * */
package ipc;

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
}

/* ���� ��Ʒ�Ƿ�����ȥ�ˣ���ȥȷʵ �Ƿ񹫿�����������
				�У�1��֪ͨ���� 2��������
				�ޣ�1������֪  2������
*
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
			}

		}
	}
}

/* ����  ���Ƿ��в�Ʒ������
�У�1�������߸�֪  2������
�ޣ�1��֪ͨ����  2����Ϣ��ֹͣ����
*
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
				System.out.println("����" + r.name + "\t id:" + r.id);
			}
			
		}
	}
}