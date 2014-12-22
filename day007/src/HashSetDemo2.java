import java.util.HashSet;


public class HashSetDemo2 {
	public static void main(String[] args) {
		HashSet<Person> hs=new HashSet<Person>();
		
		Person p1=new Person("房祖名",30,"香港");
		Person p2=new Person("柯振东",25,"台湾");
		Person p3=new Person("房祖名",30,"香港");
		Person p4=new Person("宁财神",50,"北京");
		Person p5=new Person("高虎",35,"北京");
		
		hs.add(p1);
		hs.add(p2);
		hs.add(p3);
		hs.add(p4);
		hs.add(p5);
		
		for(Person ss:hs){
			System.out.println(ss.getAddress()+"--"+ss.getAge()+"--"+ss.getName());
		}
	}

}
