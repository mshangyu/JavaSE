//Dog ����Ĺ�

//Dog ĳ��Ʒ�ƵĹ�


public class Dog{
	//����
	//�����
	static String type;  //Ʒ��   //������==����� ���������ڶ��� [����.�����]
	
	//ʵ������
	int age;
	String color; //ʵ������ :�����ڶ��� [��������.ʵ������]
	
	//��̬�����
	static (//ʹ���� ��ʼ�������
		type="xxx";
		//age=32;    ����ֱ�ӷ���ʵ������
		//color="eee";
		System.out.println("������static�������");
		
	)
	
	
	
	
	
	//����
	Dog(){
	}
	Dog(int age,String color){
	
		this.type="��ʿ��";
		this.age=age;
		this.color=color;
	}
	//ʵ������:this ��������ߵ�����
	void bark(){
		this.type="̩��";
		System.out.println("barking ...."+age+color);
	}
	
	
	
	//�෽�������ܷ���ʵ������  ===�������ڶ���   ������������Ͷ����޹�
	//�෽���� û�ж��� ���Բ��ܷ���ʵ������ʵ������
	//�෽����ֻ�ܷ�����������ֲ�����
	//abstract��static����ͬʱ���� 
	static void bark1(){
		type="����";
		//this.age=11;
		//this.color="green";
		System.out.println("�෽��");
	} 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}