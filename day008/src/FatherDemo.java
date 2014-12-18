
public class FatherDemo {
	public static void main(String[] args) {
		Son son=new Son();
		son.show();
		son.method();
	}

}
class Son extends Father{
	public int num2=12;
	public void show(){
		System.out.println(num);
		System.out.println(num2);
	}
	
	public void method(){
		int num=1000;   //如果本类中有 就在本类中找 如果没有就去其他地方找
		System.out.println(num);   //
		System.out.println(this.num);
		System.out.println(super.num);
	}
}

class Father{
	public int num=20;
}