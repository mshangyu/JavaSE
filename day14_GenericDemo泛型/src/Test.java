
public class Test<T> {
	
	public Test(String name){
		System.out.println(name);
	}
	
	
	
	public static void main(String[] args) {
		Test<String> test =new Test<String>("hello");
		More<String,Integer> more=new More<String,Integer>("lili",20);
		

	}

}

class More<String,Integer>{
	String name;
	Integer age;
	
	public More(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String show(){
		return name;
	}
	
}