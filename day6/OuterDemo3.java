/*成员内部类的常见修饰符
private 为了保证数据安全性 
*/

class Outer{

	private class Inner{
		public void show(){
			System.out.println("inner");
		}
	}
	
	public void method(){
		Inner i=new Inner();
		i.show();
	}
	

}







public class OuterDemo3{
	public static void main(String[] aegs){
		Outer o=new Outer();
		o.method();
		
	}
}