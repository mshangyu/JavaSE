/*finally���쳣�����һ���� ������Ĵ�����Զ�ᱻִ��
 *һ�������ͷ���Դ
 * 
 * */
package �쳣;

public class FinallyDemo {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		try {
			b=0;
			System.out.println(a/b);
			//IO���ݿ�
			//���ļ�
			//��д�ļ�
			//�ر��ļ�
			
			
			
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.exit(0);
		}finally{
			System.out.println("haha");
		}

	}

}
