class Outer{
	private String name="HelloWorld";
	//��Ա�ڲ���
	class Inner{
		public void show(){
			System.out.println(name);//1\�ڲ������ֱ�ӷ����ⲿ��ĳ�Ա ����˽��
			
		}
	}
	
	public void method(){  
		//show(); method��inner ��ƽ��� ����ֱ�ӵ���Inner�����show
		Inner i=new Inner();
		i.show();    //2���ⲿ��Ҫ�����ڲ���� ����Ҫ����һ���ڲ���Ķ���
	}
	
	
}


public class OuterDemo{
	public static void main(String[] args){
	
	}
}