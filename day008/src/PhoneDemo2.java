
public class PhoneDemo2 {
	public static void main(String[] args) {
		Phone33 bbPhone=new Phone33();
		bbPhone.setBrand("华为");
		bbPhone.setColor("红色");
		System.out.println(bbPhone.getBrand()+bbPhone.getColor());
		
		Phone33 bbPhone1=new Phone33("华为","白色");
		System.out.println(bbPhone1.getBrand()+bbPhone1.getColor());
	}

}
class Phone33{
	private String brand;
	private String  color;
	
	public void setBrand(String brand){
		this.brand=brand;
	}
	public String getBrand(){
		return brand;
	}
	public void setColor(String color){
		this.color=color;
	}
	public String getColor(){
		return color;
	}
	
	
	
	public Phone33(){}
	
	public Phone33(String brand,String color){
		this.brand=brand;
		this.color=color;
		
	}
	
}