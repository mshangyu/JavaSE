 class Student{
	String name;
	public Student(String name){
		name=myName;
	}
	Student get(){
		return this;
	}
}


public class Lizi{
	public static void main(String[] args){
		Student s1=new Student("����");
		Student s2=new Student("����");
		System.out.println(s1);
		System.out.println(s1.get());
		System.out.println(s2.get());
		//System.out.println(s1.get().name+);
	}
}