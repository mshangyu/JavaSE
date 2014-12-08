class Animal{ 
 	//void sing(){ 
 	//	System.out.println("唱歌"); 
 	//} 
 } 
 class Dog extends Animal{ 
 	void sing(){ 
 		System.out.println("汪汪"); 
 	} 
 } 
class Cat extends Animal{ 
 	void sing(){ 
 		System.out.println("喵喵"); 
 	} 
 	void catchMouse(){ 
 		System.out.println("捕鼠");	 
 	} 
 } 
 class Pig extends Animal{ 
	void sing(){ 
 		System.out.println("猪之歌"); 
	} 
 } 
 
  
public class Test650{ 
 	public  static void main(String[] args){ 
 		Cat c=new Cat(); 
 		function(c); 
 		//Cat c=new Cat(); 
 		/*c.sing(); 
 		Cat d=new Cat(); 
 		d.sing(); 
 		Cat e=new Cat(); 
		e.sing();*/ 
 		//function(c); 
 		//function(d); 
 		//Dog f=new Dog(); 
 		//function(f); 
 		//Pig g=new Pig(); 
 		//function(g); 
 	} 

	public static void function(Animal c){//Animal c=new Animal(); 
 		//c.sing(); //c是父类的引用
		//c.ss();
		Cat c1=(Cat)c;
		c1.catchMouse();
	} 
 	/*public static void function(Cat c){  //Cat c=new Cat(); 
 		c.sing(); 
 	} 
 	public static void function(Dog f){  //Dog f=new Dog(); 
 		f.sing(); 
 	} 
	public static void function(Pig g){  //Pig g=new Pig(); 
		g.sing(); 
 	}*/ 
}