package gem.javase;

class Person{
	String name;
	int     age;
	
	public Person(){}
	public Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	public String toString(){
		//return "hello";
		return "name:"+name+"\t age:"+age;
	}
	//ͬһ����� �����Ƿ���ͬ 
	public boolean equals(Object obj){
		//�Ƿ���ָ��ͬһ�����
		if(this==obj){
			return true;
		}
		//�Ƿ���ͬһ�����
		//if(this.name.equals(t.name)&&this.age==t.age){
		if(obj instanceof Person){  //ͬһ���ʱ���ж�
			Person d=(Person)obj;  //����ת��
			if(this.name.equals(d.name)&&this.age==d.age){
				return true;
			}else{
				return false;
			}
		}else{
			return false;
		}
	}
}

public class Test{
	public static void main(String[] args){
		Test test=new Test();
		System.out.println(test.getClass());
		//ֱ�Ӵ�ӡ����ʱ ��Ĭ�ϵ���tostring����
		System.out.println(test);
		System.out.println(test.toString());
		
		Person p=new Person("lili",12);
		Person p1=new Person("jiji",23);
		Person p2=p1;
		
		System.out.println("equals:"+p.equals(p1)+"\t=="+(p==p1));
		System.out.println("equals:"+p2.equals(p1)+"\t=="+(p2==p1));
		System.out.println();
		
		//System.out.println(p2.equals(p1));
		
		//System.out.println(p);
		//System.out.println(p.toString());
		
		Demo d=new Demo();
		System.out.println(p1.equals(d));
	}
}
class Demo{}