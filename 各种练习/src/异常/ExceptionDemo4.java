/*ע�⣺1�� �ڴ����쳣��ʱ�� catch���治�ܿ��� ���� ����ǰ��쳣�����ص���
 * 2��catchʱ�� �����֪���쳣������ ��д����ȷ��ֵ
 * 
 * ��������������  public String getMessage():������Ϣ�ַ���
 * 			  public String toString(): ���ص��쳣������
 * 			           ������getLocalizedMessage�������
 * 				 Ĭ������£����������û����дgetLocalizedMessage��������ô���ͻ᷵�غ�getMessageһ��������
 * 			  public voidprintStackTrace���������쳣����Ϣ���������̨
 * */
package �쳣;

import org.omg.CORBA.PUBLIC_MEMBER;

public class ExceptionDemo4 {
	public static void main(String[] args) {
		
		int a=10;
		int b=0;
		
		
		try{
			System.out.println(a/b);//һ��������� ���� �ͻ��Զ�����һ���쳣����
									//ArithmeticException(/ by zero)
		}catch(ArithmeticException e){
			//  public String getMessage():������Ϣ�ַ���
			//System.out.println(e.getMessage());
			//System.out.println("�����Ǿ����쳣�����");
			
			// public String toString(): ���ص��쳣������
			//System.out.println(e.toString());//java.lang.ArithmeticException: / by zero
			
			//public voidprintStackTrace���������쳣����Ϣ���������̨
			e.printStackTrace();
		}
		System.out.println("over");

	}

}
