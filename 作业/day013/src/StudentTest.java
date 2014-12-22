import java.util.Iterator;

import java.util.Set;
import java.util.TreeSet;


public class StudentTest {
	public static void main(String[] args) {
		TreeSet list=new TreeSet();
		list.add(new Student(1211,"李一",'女',18,90));
		list.add(new Student(1212,"李二",'男',19,85));
		list.add(new Student(1213,"李三",'女',17,92));
		list.add(new Student(1214,"李四",'女',16,75));
		list.add(new Student(1215,"李五",'男',15,94));
	
	//System.out.println(list);
		

		
		int sum1=0;
		Iterator it2 = list.iterator();
		while (it2.hasNext()) {
			Student object = (Student) it2.next();
			int chengji=object.getsJava();
			sum1=sum1+chengji;
		}
		int avg1=sum1/5;
		System.out.println(avg1);
		
		System.out.println(((Student) list.first()).getsJava());
		System.out.println(((Student) list.last()).getsJava());
	}
	
	
	
}
class Student implements Comparable{
	private int sNO;
	private String name;
	private char sSex;
	private int sAge;
	private int sJava;
	
	public Student(){}
	public Student(int sNO, String name,char sSex,int sAge,int sJava){
		this.sNO=sNO;
		this.name=name;
		this.sSex=sSex;
		this.sAge=sAge;
		this.sJava=sJava;
	}
	
	public int getsNO() {
		return sNO;
	}
	public void setsNO(int sNO) {
		this.sNO = sNO;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getsSex() {
		return sSex;
	}
	public void setsSex(char sSex) {
		this.sSex = sSex;
	}
	public int getsAge() {
		return sAge;
	}
	public void setsAge(int sAge) {
		this.sAge = sAge;
	}
	public int getsJava() {
		return sJava;
	}
	public void setsJava(int sJava) {
		this.sJava = sJava;
	}
	@Override
	public String toString() {
		return "Student [sNO=" + sNO + ", name=" + name + ", sSex=" + sSex
				+ ", sAge=" + sAge + ", sJava=" + sJava + "]";
	}
	@Override
	public int compareTo(Object o) {
		Student ss=(Student)o;
		int res=this.sJava-ss.sJava;
		return res==0?this.name.compareTo(ss.name):res;
	}
	
}