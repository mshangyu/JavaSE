public  class Student{
	String name;
	public Student(String name){   //���췽��
		//name=name;         //this ���Դ��������������������
		this.name=name;
	}	
	
	
	//��Ա����
	Student get(){
		return this;   //this ���ǹ̶��Ķ���ȡ���ڵ�ǰ��������������������
	}
	
	
	
	public static void main(String[] args){
		Student s1=new Student("geminno");
		Student s2=new Student("gemptc");
		
		System.out.println(s1);
		//System.out.println(s1.get().);
		System.out.println(s1.get().name); //this ��������������������� ������name
		
		
		System.out.println(s2);
		//System.out.println(s2.get());
		System.out.println(s2.get().name);
	}
}