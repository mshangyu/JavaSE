package c_Set;

import java.util.HashSet;
import java.util.Iterator;

import bean.Person;

/*���Զ���������ӵ�hashset
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
		hs.add(new Person("gooogle",12));//��person����ֻ���临д��
		System.out.println(""+hs+"size="+hs.size());
		//����д�����ֵ�ʱ�� �ͱ�� �ĸ���
		
		Iterator it=hs.iterator();
		while(it.hasNext()){
			Person object=(Person)it.next();
			System.out.println(object.getName()+"=="+object);
		}
		
		
	}

}