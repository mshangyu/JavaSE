
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
		int num=1000;   //����������� ���ڱ������� ���û�о�ȥ�����ط���
		System.out.println(num);   //
		System.out.println(this.num);
		System.out.println(super.num);
	}
}

class Father{
	public int num=20;
}