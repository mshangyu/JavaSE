//����Person��
public class PersonTest{
	public static void main(String[] args){
	
		//ʵ����(���췽��)��һ������  ����=����=ʵ��
		//Person geminno=new Person();//�ڶ������ʱ��[û��]�Զ����޲ι��캯��������ϵͳ�Զ������޲ι�����
		                            //�ڶ������ʱ��[��]�Զ����޲������캯����ʹ���Զ������������
		
		Person geminno=new Person();
		Person gem=new Person("�߲�");
		Person gemptc=new Person("�߲�����",12);
		
		
		
		//����ʹ�ã����ó�Ա����  ���ó�Ա����
		
		geminno.info();
		gem.info();
		gemptc.info();
		
		
		
	}
}