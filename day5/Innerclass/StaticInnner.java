
class Outer{
	//��Ա����
	static int a=123;
	static private String str="�ⲿ��ı���";
	
	
	//��̬��Ա�ڲ���:   ��̬�ڲ��಻�ܷ����ⲿ��ķǾ�̬��Ա
	static class Inner{
		String str="gem";
		void run(){
			System.out.println(a);
			System.out.println(str);			
		}
		
		static String static_str="��̬����";
		static void static_run(){
			System.out.println("�ڲ��ྲ̬����");
		}
	}
	void run(){
		//���ڲ������������෽������
		System.out.println(Inner.static_str);
		Inner.static_run();
		
		//���ڲ����ʵ��������ʵ����������
		Inner in=new Inner();
		System.out.println(in.str);
		in.run();
	}

            

public  class StaticInnner{//��������
		public static void main(String[] args){
		//Outer.Inner in=new Outer.Inner();
		System.out.println(in.str);//ʵ������
		//in.run();
		//in.static_run();
		//������������� �����ö������Ҳ�ǿ��Ե�
		System.out.println(Inner.static_str);
		Outer.Inner.static_run();
		
		}
}
		
		
		
		
	}