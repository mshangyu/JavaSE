
 class Base{
	int a=123;
	
	void show(){
		System.out.println("base");
	}
	
	void base_show(){
		System.out.println("�������еķ���");
	}
}


public class Sub extends Base{
	String str="sub class";//�������е�����

	void sub_show(){
		System.out.println("sub�����еķ���");
	}
	
	void show(){
		System.out.println("���ิд�˸���ķ���sub class");
	}
	
	
	public static void main(String[] args){
		//����ת�� Ĭ�ϻ������� ָ�� �������
		//Base base=new Sub();//Ĭ������ת��
		
		//System.out.println(base.a);//���ʸ��������
		
		//base.base_show();
		//base.sub_show();
		//base.show();
		
		//����ת�� ���������ָ����Ķ���
		//Sub sub=(Sub)new Base();
		//Sub sub=new Sub();
		Base base=new Sub();
		Sub a=(Sub)base;
		a.show();
		a.sub_show();
	}
	
}
		 
