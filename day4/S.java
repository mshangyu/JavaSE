public class S{
	public static void main(String[] args){
	/*	System.out.println("����������");
	}
	static{
		System.out.println("���Ǿ�̬�����");
	}
	*/
	//new Person();//��������
	new Person();
	Person n=new Person();//����ʹ��newһ������ Ҳ����ʹ����������������ǰ��ķ���
	//Person.show();
	}

}

class Person{
	static {
		System.out.println("���Ǿ�̬�����");
	}
	{
		System.out.println("���ǹ�������");
	}
	
	//public static void show(){
		//System.out.println("���");
	//}
}