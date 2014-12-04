public class Dog{
	//定义一个jump方法
	public void jump (){
		System.out.println("正在执行jump方法");
	}

	
	//定义一个run方法,run方法需要借助jump方法
	public void run{
	/*
	可以这样调用也可以采用下面的方法
		//Dog d=new Dog();
		//d.jump();
	*/
		
		
		//使用this引用调用run方法的对象
		this.jump();
		System.out.println("正在执行run方法");
		
	
	}
}