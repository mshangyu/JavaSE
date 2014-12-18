package c_Set;

import java.util.HashSet;
import java.util.Iterator;

import bean.Person;

/*把自定义对象添加到hashset
 * 
 * */
public class HashSetTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet  hs=new HashSet();
		
		Person person=new Person("ibm",67);
		
		hs.add(person);
		//hs.add(person);
		hs.add(new Person("google",12));
		hs.add(new Person("apple",23));
		hs.add(new Person("gooogle",12));//在person类中只年龄复写了
		System.out.println(""+hs+"size="+hs.size());
		//当复写了名字的时候 就变成 四个了
		
		Iterator it=hs.iterator();
		while(it.hasNext()){
			Person object=(Person)it.next();
			System.out.println(object.getName()+"=="+object);
		}
		
		
	}

}
