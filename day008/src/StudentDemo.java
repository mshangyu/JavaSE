
public class StudentDemo {
	public static void main(String[] args) {
		Student student=new Student();
		student.love();
		
		StudentTest ssStudentTest=new StudentTest();
		ssStudentTest.print(student);
		
		//匿名对象  仅仅被使用一次  或者被当作参数传递
		new StudentTest().print(new Student());
	}

}

class Student{
	public void love(){
		System.out.println("学生爱java");
	}
}
class StudentTest{
	public void print(Student s){
		s.love();
	}
}