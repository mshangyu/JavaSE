public class D{
	public static void main(String[] args){
		/*Student A=new Student();
		A.country="�й�";
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
	int age;//ʵ������
	static String country; //��̬����
	 static void print(){
		//static String Aa="�������";
		System.out.println(Aa);
		//System.out.println(name);��Ϊ���name���Ǿ�̬��
	}
	void p(){
		System.out.println(country);
	}
}