class Student{
	public void love(){
		System.out.println("学习爱java");
	}
}
class StudentTest{
	public void print(Student s){
		s.love();
	}
}

 class Test664{
	public static void main(String[] args){
		//创建对象：调用方法
		//Student s=new Student();
		//s.love();
		//s.love();
		
		//匿名对象的使用
		//new Student().love();
		//new Student().love();
		
		//StudentTest st=new StudentTest();
		//Student s=new Student();
		//st.print(s);
		
		//匿名对象的用法
		new StudentTest().print(new Student());
		
	}
}