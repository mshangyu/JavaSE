abstract class USB{
	public abstract void read();
	public abstract void write();
}
//�ӿ�
interface Wifi{
	void open();
	void close();
}

/*
class USB_KEY extends USB{
	//�ص�
	
	
	//����
	
	//��д
}*/



public class Niming{
	public static void main(String[] args){
		//�����ڲ�����һ������ľֲ��ڲ���==����Ķ��� ���� ʵ����Ķ��� [�����ھֲ�������ʵ�ֵ�]
		USB udisk=new USB(){
			//
			int a;
			//static int b;  �����о�̬����
			final static int b=2;    //��������
			public void read(){
				System.out.println("��ȡu��");
			}                                        //�����ڲ��� ��д ʵ���� һ�������
			public void write(){
				System.out.println("дu��");
			}
		};
		udisk.read();
		udisk.write();
		
		Wifi a=new Wifi(){  
			public void open(){  //���� ����Ϊ �ڽӿ���ָ����public��
				System.out.println("��wifi");
			}                                            //�����ڲ���
			public void close(){
				System.out.println("�ر�wifi");
			}
		};
		a.open();
		a.close();
		
	}
}
