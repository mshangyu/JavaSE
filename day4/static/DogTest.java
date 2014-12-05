//? 成员变量初始化工作？==在构造函数中进行
//？ 类变量能不呢个在构造函数中初始化


public  class DogTest{
	public static void main(String[] args){
		//类变量：不依赖于对象 优先于对象而存在  能在没有生成任何类的实例时就访问，在某种意义上类似于全局变量  可以直接使用类名来访问
		System.out.println("type="+Dog.type);
		Dog.type="藏獒";
		System.out.println("type="+Dog.type);
		
		//类方法：
		Dog.bark();
		
		Dog.age=123;
		Dog.bark1();
	
/*
	
		Dog dog2=new Dog(15,"Black");
		Dog dog=new Dog(12,"Red");//实例化出了一个对象dog  实例变量
		
		//类变量
		System.out.println("dog.type="+dog.type);
		System.out.println("Dog.type="+Dog.type);
		System.out.println("dog2.type="+dog2.type);
			
		//实例变量：依赖于对象 
		System.out.println("dog2.age="+dog2.age);
		System.out.println("dog2.age="+dog2.age);
*/

		Dog dog2=new Dog(15,"Black");
		Dog dog=new Dog(12,"Red");
	
		dog.bark();//this==dog
		dog2.bark(); //this==dog2 
		
		//使用对象引用  访问类方法
		dog.bark();
		dog2.bark();

	}


}