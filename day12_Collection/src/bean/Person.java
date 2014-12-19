package bean;

public class Person implements Comparable{
	private String name;
	private int age;
	
	public Person(){
		super();
	}
	
	public Person(String name, int age) {
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
//
	
	
	
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + " age=" + age + "\n";
	}

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Person other = (Person) obj;
//		if (name == null) {
//			if (other.name != null)
//				return false;
//		} else if (!name.equals(other.name))
//			return false;
//		return true;
//	}
//
//	
	
	
	
	@Override
	public int compareTo(Object o) {
		
		Person p=(Person)o;
		//1\年龄比较
		//return this.age-p.age;
		
		//2\先比较年龄 在比较名字
		int res=this.age-p.age;
//		if(res==0){
//			return this.name.compareTo(p.name);
//		}else{
//			return res;
//		}
		//简写
		return res==0?this.name.compareTo(p.name):res;
		
		//只比较名字
//		return this.name.compareTo(p.name);
//		return -(this.name.compareTo(p.name));
//		return p.name.compareTo(this.name);
		
		//3、先比较名字再比较年龄
//		int bb=this.name.compareTo(p.name);  //字符串 要用compareto
//		if(bb==0){
//			return this.age-(p.age);
//		}else{
//			return bb;
//		}
		//简写
//		return bb==0?this.age-p.age:bb;
		
	}

	public int getLength() {
		return 0;
	}

	
	
	
	
	
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + age;
//		return result;
//	}
	

//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Person other = (Person) obj;
//		if (age != other.age)
//			return false;
//		return true;
//	}
	

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + age;
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Person other = (Person) obj;
//		if (age != other.age)
//			return false;
//		if (name == null) {
//			if (other.name != null)
//				return false;
//		} else if (!name.equals(other.name))
//			return false;
//		return true;
//	}
//
//	
	
	
	

}
