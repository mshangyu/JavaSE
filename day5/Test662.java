 interface Smoket{
	public abstract void smoket();
 }
 //interface Game{
	//public abstract void computerGame();
 //}
 
 interface Game extends Smoket{
	public abstract void computerGame();
 }
 
 
 class Student implements Game{
	public void smoket(){
		System.out.println("ÎüÑÌ");
	}
	public void computerGame(){
		System.out.println("ÓÎÏ·");
	}
 }
 
 
public class Test662{
	public static void main(String[] args){
		Student s=new Student();
		s.smoket();
		s.computerGame();
	}
 }