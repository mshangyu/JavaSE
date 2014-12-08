class Cat{
	int num;
	public boolean equals(Object fff){//Object ff=new Dog();
		//return true;//this相当于当前对象的引用
		
		if(fff instanceof Cat){
			Cat ee=(Cat)fff;
			return this.num==ee.num;
		
		}else{
			return false;
		}
		//Cat ee=(Cat)fff;//此处强制转换成父类里 则可以访问了
		
	}

}
class Dog{

}
class Person{

}


public class Test656{
	public static  void main(String[] args){
		Cat c=new Cat();
		//c.ff(c);//c相当于上面的this 而括号里的相当于上面的fff 这个括号里的参数就是指哪个对象调用了这个方法 就传进去了哪个参数
		//Dog c2=new Dog();
		//System.out.println(c.ff(new Person()));
		Dog c2=new Dog();
		System.out.println(c.equals(c2));
		System.out.println("ff".equals("ff"));//字符串就是匿名对象 所以也成立
		/*c.num=23;
		Cat c2=new Cat();
		c2.num=23;
		System.out.println(c==c2);*/
		
		
	}
}