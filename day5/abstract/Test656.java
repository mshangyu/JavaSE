class Cat{
	int num;
	public boolean equals(Object fff){//Object ff=new Dog();
		//return true;//this�൱�ڵ�ǰ���������
		
		if(fff instanceof Cat){
			Cat ee=(Cat)fff;
			return this.num==ee.num;
		
		}else{
			return false;
		}
		//Cat ee=(Cat)fff;//�˴�ǿ��ת���ɸ����� ����Է�����
		
	}

}
class Dog{

}
class Person{

}


public class Test656{
	public static  void main(String[] args){
		Cat c=new Cat();
		//c.ff(c);//c�൱�������this ����������൱�������fff ���������Ĳ�������ָ�ĸ����������������� �ʹ���ȥ���ĸ�����
		//Dog c2=new Dog();
		//System.out.println(c.ff(new Person()));
		Dog c2=new Dog();
		System.out.println(c.equals(c2));
		System.out.println("ff".equals("ff"));//�ַ��������������� ����Ҳ����
		/*c.num=23;
		Cat c2=new Cat();
		c2.num=23;
		System.out.println(c==c2);*/
		
		
	}
}