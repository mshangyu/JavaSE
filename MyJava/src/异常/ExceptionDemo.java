package �쳣;
/*jvm��Ĭ�ϴ���ʽ��
 *   ���쳣������ �쳣�Ĵ���ԭ���Լ��쳣���ֵ�λ�õ���Ϣ�ڿ���̨������� �Ա����ǿ���ͨ��������������
 *   ֻҪ���������� ���򵽴�Ϊֹ  ��������ִ��
 * jvm��Ĭ�ϴ������� �������쳣 ����ͣ����
 * ����Ӧ���ֶ��Ĵ��������쳣
 * ��ô�����أ� ��׼�������� try{
 * 							���ܳ�����Ĵ��룻
 * 						}catch(�쳣���� ������){ //���ڲ���һ���쳣����
 * 
 * 						}finally{
 * 							�ͷ���Դ��io�������ݿ�Ĳ����У�
 * 						}
 * ����ı��εĸ�ʽ��
 * 				 try{
 * 						���ܳ�����Ĵ��룻
 * 				  }catch(�쳣���� ������){ //���ڲ���һ���쳣����
 * 
 * 				  }
 * 
 * */
public class ExceptionDemo {
	public static void main(String[] args) {
		int a=10;
		//int b=2;
		int b=0;
		
		//ArithmeticException ��ѧ�����쳣 ���鲻��Ϊ0
		//b=0;
		try{
			System.out.println(a/b);
		}catch(ArithmeticException e){
			System.out.println("�����Ǿ����쳣�����");
		}
		System.out.println("over");
	}
}
