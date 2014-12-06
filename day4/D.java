public class D{
	public static void main(String[] args){
		/*Student A=new Student();
		A.country="中国";
		Student B=new Student();
		System.out.println(B.country);
		System.out.println(Student.country);
		*/
		//Student A=new Student();
		//A.print();
		//A.p();
		Student.print();
	}

}



class Student{
	String name ;
	int age;//实例变量
	static String country; //静态变量
	 static void print(){
		//static String Aa="你好世界";
		System.out.println(Aa);
		//System.out.println(name);因为这个name不是静态的
	}
	void p(){
		System.out.println(country);
	}
}