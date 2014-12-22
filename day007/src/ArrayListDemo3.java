import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListDemo3 {
	public static void main(String[] args) {
		ArrayList<Person> array=new ArrayList<Person>();
		
		Person p1=new Person("������",18,"����");
		Person p2=new Person("������",20,"�Ϻ�");
		Person p3=new Person("������",60,"���");
		Person p4=new Person("�ֱ���",20,"����");
		Person p5=new Person("Ѧ����",19,"̨��");
		
		array.add(p1);
		array.add(p2);
		array.add(p3);
		array.add(p4);
		array.add(p5);
		
		for(int x=0;x<array.size();x++){
			Person person=array.get(x);
			System.out.println(person.getAddress()+person.getAge()+person.getName());
		}
		
		Iterator<Person> iterator=array.iterator();
		while (iterator.hasNext()) {
			Person person =iterator.next();
			System.out.println(person);
		}
		
	}

}
