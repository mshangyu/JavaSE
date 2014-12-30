package serialize.obj;

import java.io.Serializable;

/*对象序列化：把内存中对象 ，保存在磁盘 、网络传输
 * [对象--〉转成与平台无关 的二进制--〉保存到磁盘]
 * 实现了： 对象与程序的分离/对象可以跨程序使用
 * 对象都可以序列化吗？---普通类怎么变成可序列化的类？
 * no 、 
 * Serizlizeble Externallizable
 * 序列化：内存对象--〉IO
 * 反序列化：就是IO---〉对象[内存]p.name  p.age
 * 
 * 
 * */
public class Person implements Serializable {
	private int age;
	private String name;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	

}
