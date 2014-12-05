public  class Student{
	String name;
	public Student(String name){   //构造方法
		//name=name;         //this 可以处理参数或变量重名的情况
		this.name=name;
	}	
	
	
	//成员方法
	Student get(){
		return this;   //this 不是固定的东西取决于当前调用这个方法对象的引用
	}
	
	
	
	public static void main(String[] args){
		Student s1=new Student("geminno");
		Student s2=new Student("gemptc");
		
		System.out.println(s1);
		//System.out.println(s1.get().);
		System.out.println(s1.get().name); //this 调用这个函数方法的引用 所以有name
		
		
		System.out.println(s2);
		//System.out.println(s2.get());
		System.out.println(s2.get().name);
	}
}