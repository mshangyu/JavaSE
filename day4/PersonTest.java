//����Person��
public class PersonTest{
	public static void main(String[] args){
	
		//ʵ����(new+���췽��)��һ������  ����=����=ʵ��
		//Person geminno=new Person();//�ڶ������ʱ��[û��]�Զ����޲ι��캯��������ϵͳ�Զ������޲ι�����
		                            //�ڶ������ʱ��[��]�Զ����޲������캯����ʹ���Զ������������
		
		Person geminno=new Person();    //��ʵ�����ˣ��ٵ���person��ģ�
		Person gem=new Person("�߲�");
		Person gemptc=new Person("�߲�����",12);
		
		
		
		//����ʹ�ã����ó�Ա����  ���ó�Ա����
		
		geminno.info();//�������Ϣ��
		gem.info();
		gemptc.info();
		
		
		
	}
}