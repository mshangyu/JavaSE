
public class PhoneDemo {
	public static void main(String[] args) {
		Phone22 bBPhone22=new Phone22();
		bBPhone22.setAge(25);
		bBPhone22.setBrand("apple");
		bBPhone22.show();
	}

}
class Phone22{
	private String brand;
	private int age;
	
	public void setBrand(String b){
		brand=b;
	}
	public String getBrand(){
		return brand;
	}
	
	public void setAge(int m){
		age=m;
	}
	public int getInt(){
		return age;
	}
	
	public void show(){
		System.out.println(brand+"==="+age);
	}
}