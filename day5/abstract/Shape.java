
//������ֻ�ܱ��̳�       ͨ������ ʵ�����еĳ��󷽷�   ʵ����������
//��������                ������

public abstract class Shape{
	//���������ɣ�
	{
		System.out.println("ִ��Shape�ĳ�ʼ����");
	}
	private String color;//����ͨsetget����
	
	
	//�ܳ��� ���󷽷�:û��{}
	public abstract double  calPerimeter();
	//��״�� ���󷽷���
	public abstract String getType();
	
	
	//
	public Shape(){}//���췽�������� ��������õ�
	public Shape(String color){
		//this()��  ����ľ���������޲ι��캯��
		System.out.println("shape������");
		this.color=color;
	}
	
	public void setColor(String color){
		this.color=color;
	}
	public String getColor(){
		return this.color;
	}
}