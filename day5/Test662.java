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
		System.out.println("����");
	}
	public void computerGame(){
		System.out.println("��Ϸ");
	}
 }
 
 
public class Test662{
	public static void main(String[] args){
		Student s=new Student();
		s.smoket();
		s.computerGame();
	}
 }