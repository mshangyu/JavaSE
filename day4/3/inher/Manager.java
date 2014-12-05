public class Manager extends Employee{
	//特有属性
	String car;
	String office;
	
	//构造方法：子类的构造方法当中必须调用父类构造方法
	public Manager(){//子类无参构造方法+没有显示调用父类的构造函数 结果会自动调用父类无参构造方法  如果父类也没有无参构造函数 系统会默认给一个
		System.out.println("子类无参构造函数");
	}
	
	//子类的一参构造方法
	public Manager (int id){
		
		//super(id);//父类的构造函数
		System.out.println("子类一参构造函数");
		//this.id =id;
	}
	//子类的 两参构造函数
	 public Manager(int id,String name){//this在构造函数中 必须放在第一位
	 
		this(id);//this指代一参构造函数 this可以是某个引用也可以是代表某个构造函数
		System.out.println("子类两参构造函数");
		
		//this.id =id;
		this.name=name;
	}
	
	//特有方法
	public void drive(){
		// System.out.println("name:"+name+"开"+car+"上班");
		System.out.println("super.name:"+super.name+"开"+this.car+"上班");		//name 是父类属性
		System.out.println("this.name:"+super.name+"开"+this.car+"上班");
	
	}
	//super:父类的引用 
	public void info(){
		// System.out.println("id:"+id+"name:"+name+"salary:"+salary);
		System.out.println("子类的info()");
		super.info();
		System.out.println("car:"+car+"\noffice"+office);
	}
	
}