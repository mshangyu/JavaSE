
 class Phone1 {
	String brand;
	String color;
	int price;
	
	public void call(String name){
		System.out.println("给"+name+"打电话");
	}
	public void senMessage(){
		System.out.println("群发短信");
	}
	public void shangWang(){
		System.out.println("上网");
	}
	

}
 public class Phone{
	 public static void main(String[] args) {
		Phone1 bbPhone1=new Phone1();
		bbPhone1.brand="苹果";
		bbPhone1.color="红色";
		bbPhone1.price=7888;
		System.out.println(bbPhone1.brand+bbPhone1.color);
		bbPhone1.call("倪昌杰");
		bbPhone1.senMessage();
		bbPhone1.shangWang();
	}
 }