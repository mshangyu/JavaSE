
 class Phone1 {
	String brand;
	String color;
	int price;
	
	public void call(String name){
		System.out.println("��"+name+"��绰");
	}
	public void senMessage(){
		System.out.println("Ⱥ������");
	}
	public void shangWang(){
		System.out.println("����");
	}
	

}
 public class Phone{
	 public static void main(String[] args) {
		Phone1 bbPhone1=new Phone1();
		bbPhone1.brand="ƻ��";
		bbPhone1.color="��ɫ";
		bbPhone1.price=7888;
		System.out.println(bbPhone1.brand+bbPhone1.color);
		bbPhone1.call("�߲���");
		bbPhone1.senMessage();
		bbPhone1.shangWang();
	}
 }