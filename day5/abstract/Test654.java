class Car{ 
 	String color; 
 	void start(){ 
 		System.out.println("汽车被开动"); 
 	} 
 } 
  
 public class Test654{ 
 	public static void main(String[] args){ 
 		//Car c=new Car(); 
 		//c.start(); 
 		 
 		//new Car().color="蓝色";//此处这样子做是没有意思的 因为没有使用它 
 		//new Car().start();//匿名对象的使用 调用start这个方法 
 		 
 		//Car c=new Car(); 
 		//print(c); 
 		 
 		print(new Car()); 
 	} 
 	 
 	static void print(Car c){//Car c=new Car(); 
 		c.start(); 
	} 
 } 
