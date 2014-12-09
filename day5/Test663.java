class Person{
	String name;
	int age;
}
interface Smoket{
	public abstract void smoket();
}
class Student extends Person{

}

class Worker extends Person implements Smoket{
	public void smoket(){
		System.out.println("ÎüÑÌ");
	}
}
public class Test663{
	public static void main(String[] args){
		Worker w=new Worker();
		w.smoket();
	}
}