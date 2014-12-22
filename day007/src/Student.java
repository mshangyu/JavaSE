import org.omg.CORBA.PRIVATE_MEMBER;


public class Student implements Comparable<Student>{

	
		private String name;
		private int age;
		
		public Student(String name, int age) {
			super();
			this.name = name;
			this.age = age;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		@Override
		public String toString() {
			return "Student [name=" + name + ", age=" + age + "]";
		}
		@Override
		public int compareTo(Student ss) {
			int res=ss.age-this.age;
			return res==0?this.name.compareTo(ss.name):res;
		}
		
		
	

}
