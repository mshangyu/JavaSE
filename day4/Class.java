public class Class{
	//�����
	static String  str=getStaticVar();
	//�෽��
	private static String getStaticVar(){
		System.out.println("�෽��");
		return"static ����";
	}
	
	
	//ʵ������
	int var;
	//ʵ������
	private int getIntVar(){
		System.out.println("ʵ������");
		return 123;
	}
	
	
	//��̬�����
	static{
		System.out.println("��̬�������");
	}
	
	
	//���췽��
	public Class(){
		System.out.println("���췽��");
	}
	
	

	
	public static void main(String[] args){
		System.out.println("����main");
		Class ci=new Class();
		System.out.println("�˳�main");
		
	}
	
	
	/*��ĳ�ʼ��˳��
	�������ʼ��
	ִ�����߳�
	ʵ��������ʼ��
	���캯����ʼ��
	�˳����߳�
	*/
	
	
}