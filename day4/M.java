public class M{
	public static void main(String[] args){
		Person A=new Person();
		A.name="����";
		//A.country="�й�";	
		Person B=new Person();
		B.name="Ҧ��";
		//System.out.println(B.country);
		//Person A=new Person();
		A.print();
		B.print();
		//Person.print();
	}

}



class Person{
	String name;
	static String country;
	void print(){
		System.out.println(name+"���");
	}

}
