import java.util.HashSet;


public class HashSetDemo2 {
	public static void main(String[] args) {
		HashSet<Person> hs=new HashSet<Person>();
		
		Person p1=new Person("������",30,"���");
		Person p2=new Person("����",25,"̨��");
		Person p3=new Person("������",30,"���");
		Person p4=new Person("������",50,"����");
		Person p5=new Person("�߻�",35,"����");
		
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