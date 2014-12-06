public class M{
	public static void main(String[] args){
		Person A=new Person();
		A.name="刘翔";
		//A.country="中国";	
		Person B=new Person();
		B.name="姚明";
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
		System.out.println(name+"你好");
	}

}
