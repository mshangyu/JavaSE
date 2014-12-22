import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import com.sun.org.apache.bcel.internal.generic.NEW;


public class StudentDemo {
	public static void main(String[] args) {
		Set set=new TreeSet();
		
		set.add(new Student("张三",112));
		set.add(new Student("李四",23));
		set.add(new Student("王五",44));
		set.add(new Student("张六",89));
		set.add(new Student("王二麻子",67));

		for (Iterator iterator = set.iterator(); iterator.hasNext();) {
			Student object = (Student) iterator.next();
			System.out.println(object);
		}
	}

}
class Student implements Comparable{
	private String name;
	private int score;
	
	public Student(){}
	public Student(String name,int score){
		this.name=name;
		this.score=score;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	@Override
	public int compareTo(Object o) {
		Student ss=(Student)o;
		int res=ss.score-this.score;
		return res==0?this.name.compareTo(ss.name):res;
		
		
		
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + "]";
	}
	
	
}