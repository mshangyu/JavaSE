//? ��Ա������ʼ��������==�ڹ��캯���н���
//�� ������ܲ��ظ��ڹ��캯���г�ʼ��


public  class DogTest{
	public static void main(String[] args){
		//��������������ڶ��� �����ڶ��������  ����û�������κ����ʵ��ʱ�ͷ��ʣ���ĳ��������������ȫ�ֱ���  ����ֱ��ʹ������������
		System.out.println("type="+Dog.type);
		Dog.type="����";
		System.out.println("type="+Dog.type);
		
		//�෽����
		Dog.bark();
		
		Dog.age=123;
		Dog.bark1();
	
/*
	
		Dog dog2=new Dog(15,"Black");
		Dog dog=new Dog(12,"Red");//ʵ��������һ������dog  ʵ������
		
		//�����
		System.out.println("dog.type="+dog.type);
		System.out.println("Dog.type="+Dog.type);
		System.out.println("dog2.type="+dog2.type);
			
		//ʵ�������������ڶ��� 
		System.out.println("dog2.age="+dog2.age);
		System.out.println("dog2.age="+dog2.age);
*/

		Dog dog2=new Dog(15,"Black");
		Dog dog=new Dog(12,"Red");
	
		dog.bark();//this==dog
		dog2.bark(); //this==dog2 
		
		//ʹ�ö�������  �����෽��
		dog.bark();
		dog2.bark();

	}


}