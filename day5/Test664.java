class Student{
	public void love(){
		System.out.println("ѧϰ��java");
	}
}
class StudentTest{
	public void print(Student s){
		s.love();
	}
}

 class Test664{
	public static void main(String[] args){
		//�������󣺵��÷���
		//Student s=new Student();
		//s.love();
		//s.love();
		
		//���������ʹ��
		//new Student().love();
		//new Student().love();
		
		//StudentTest st=new StudentTest();
		//Student s=new Student();
		//st.print(s);
		
		//����������÷�
		new StudentTest().print(new Student());
		
	}
}