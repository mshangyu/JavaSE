/*���̣��ǲ���ϵͳ��Ӧ�ó�����Դ���䡢���̵��ȵ���С��λ[�������еĳ���]
 * �̣߳���ϵͳ��ִ�������[��С��λ] �������ִ�е���С��λ �����̵Ķ��ִ����
 *      �߳����Լ����е�����
 *      
 *           ����ִ��/ͬʱ
 *      ������
 *      ����̣�
 *      ���̣߳�
 *      ����ϵͳ�����̡��̷߳���ǳ�С��ʱ��Ƭ ��osȥ���ȡ�����л�==����Ͽ�ͬʱִ��
 *      
 *      jvm��������̣߳�
 *                 1��main�߳�
 *                 2����������վ��
 *       java:   Object ����+���գ�
 *      
 * */
class A{
	//�漰��ϵͳ����Դ��ʱ�� ��Ҫ����дһ�¸÷��� ����һЩ��Դ�رյĲ���
	@Override
	protected void finalize() throws Throwable {
		System.out.println("�ֶ���������");
		System.out.println(Thread.currentThread().getId());
		super.finalize();
	}
}
public class Demo {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getId()+Thread.currentThread().getName());
		A a=new A();
		new A();
		new A();
		System.gc();
		new A();
		
		System.out.println("main����");
	
	}

}

