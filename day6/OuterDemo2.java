/*
������main�������ܲ���ȥ����show������

�ⲿ����.�ڲ����� ����==�ⲿ�����.�ڲ������
*/

class Outer{
	private String name="HelloWorld";
	
	//��Ա�ڲ���
	class Inner{
		public void show(){
			System.out.println(name);
			
		}
	}
	
}


public class OuterDemo2{
	public static void main(String[] args){
		//Inner i=new Inner();
		//i.show();������� ����ֱ�Ӵ����ڲ���Ķ���
		
		//���Լ�ӵĴ����ڲ������
		//�ⲿ����.�ڲ����� ����==�ⲿ�����.�ڲ������
		Outer.Inner oi=new Outer().new Inner();//��������
		oi.show();
	}
}