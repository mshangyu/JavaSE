//final class Person{//�˴����� �����Ա��̳�
/*class Person{
	//final void show(){   // ����final����ʱ��������д
	void show(){
		System.out.println("���");
	}
	void show1(){
		System.out.println("èè");
	}
	
}*/
class Student{
	final static String STUDENT_NAME="С��";//ȫ�ֳ���
	final String STUDENT_NAME="С��";//����
}
/*
class Student extends Person{
	void show(){
		System.out.println("�������");
	}
	void show1(){
		System.out.println("èè��");
	}
}*/

public class Test657{
	public static void main(String[] args){
		Student s=new Student();
		//final int a=34;
		//a=23;����  ��Ϊfinal���κ� �����Ա��ı� 
		
		Student s=new Student();//s s1���ǲ����԰׸ı�� ��Ϊ����Ѿ�Ϊ������
		Student s1=new Student();
		
		//int a=34;//����
		//s.name="ʱ��";
		//s.show1();
	}
}