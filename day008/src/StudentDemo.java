
public class StudentDemo {
	public static void main(String[] args) {
		Student student=new Student();
		student.love();
		
		StudentTest ssStudentTest=new StudentTest();
		ssStudentTest.print(student);
		
		//��������  ������ʹ��һ��  ���߱�������������
		new StudentTest().print(new Student());
	}

}

class Student{
	public void love(){
		System.out.println("ѧ����java");
	}
}
class StudentTest{
	public void print(Student s){
		s.love();
	}
}