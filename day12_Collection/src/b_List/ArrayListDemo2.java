package b_List;

import java.util.ArrayList;

import bean.Person;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		
		for(int i=0;i<5;i++){
			a1.add(new Person("it-"+i,i));
		}
		
		Person person=new Person("it-3",3);
		a1.add(person);
		System.out.println(a1);
		//System.out.println(a1.indexOf(o));
		System.out.println(a1.indexOf(person)+"==="+a1.lastIndexOf(person));
		System.out.println(a1.indexOf(new Person("it-3",3))+"==="+a1.lastIndexOf(person));
	}

}