class Teacher{
	private String name;
	private int age;

	public Teacher(){
		super();
	}
	public Teacher(String name,int age){
		super();
		this.name=name;
		this.age=age;
	}

	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setAge(int age){
		this.age=age;
	}
	public int getAge(){
		return age;
	}
	//需求：比较两个成员变量值是否相同
	/*public boolean compare(Teacher t1,Teacher t2 ){  这是第一种方法
		//t1.getName()==t2.getName()
		//字符串是引用类型所以用          //基本数据类型用==
		if(t1.getName().equals(t2.getName())&&t1.getAge()==t2.getAge()){        
			return true;
		}else{
			return false;
		}
	}
	*/
	/*public boolean compare(Teacher t1,Teacher t2 ){
			if(t1.name.equals(t2.name)&&t1.age==t2.age){
				return true;
			}else{
				return false;
			}
	} 这是第二种方法
	*/
	
	/*//用this替代调用的对象
	public boolean compare(Teacher t ){
		//t1-->this当前对象   t2-->t传的参数
		if(this.name.equals(t.name)&&this.age==t.age){
			return true;
		}else{
			return false;
		}第三种方法
	}*/
	
	//第四种方法
	//如果一个类中有两个相同功能的方法，一般会考虑留一个，
	//而equals是你留与不留都会存在的，所以这里留equals
	//这里重写了equals方法
	/*public boolean equals(Object obj){//t1-->this当前对象   t2-->t传的参数
		//Object obj=t2;这里将t2传给obj 默认的是向上转型
		//所以在这里类时teacher时需要向下转型
		Teacher t=(Teacher)obj;
		if(this.name.equals(t.name)&&this.age==t.age){
			return true;
		}else{
			return false;
		}
	}*/
	
	//最终版
	public boolean equals(Object obj){
	
		//提高效率
		if(this==obj){  //如果你传的参数的地址值和当前对象的地址值相同
			return true;
		}
		//类型不匹配？怎么解决需要判断类型
		if(obj instanceof Teacher){
			
		
			System.out.println("aaaaaaaa");
			Teacher t=(Teacher)obj;
			System.out.println("bbbbbbb");
			if(this.name.equals(t.name)&&this.age==t.age){
				return true;
			}else{
				return false;
			}
		}
		return false;
	}
	
	
}
public class TeacherDemo{
	public static void main(String[] args){
		Teacher t=new Teacher();
		t.setName("林青霞");
		t.setAge(27);
		System.out.println(t);
	

		//我要比较两个对象的值是否相等
		Teacher t1=new Teacher("林青霞",27);
		Teacher t2=new Teacher("林青霞",27);
		System.out.println(t1==t2);  //false  因为用了两个对象 地址不同

		//明明两个对象的姓名和年龄都相同 应该是一个对象 所以说比较一下成员变量的值吧
		//方法写完了 怎么调用呢？
		//System.out.println(t1.compare(t1,t2));//true

		//虽然实现了效果但是t1调用方法 还要传递一个t1 这个有点冗余
		//某个对象调用方法在内部其实有一个东西就可以表示该对象 就是this方法
		//System.out.println(t1.compare(t2));  //true
		
		
		System.out.println(t1.equals(t2));  //false
		System.out.println(t1.equals(t1));
		
		
		//==的作用：
		//比较基本类型：比较的是基本类型的值是否相等
		//比较引用类型：比较的是引用类型的地址值是否相等
		
		Demo d=new Demo();
		System.out.println(t1.equals(d)); //false 因为类型不匹配 报错
	}
}
class Demo{
} 