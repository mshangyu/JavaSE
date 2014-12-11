public class Test{
	public static void main(String[] args){
			//Miwifi a=new Miwifi();
			USB_WIFI a=new Miwifi();//向上转型
			//Miwifi mi=(Miwifi)a;//向下转型
			System.out.println(((Miwifi)a).brand);//强转
			System.out.println(a.brand);
			a.open();
			a.close();
			a.read();
			a.write();
			a.usb2wifi();
	}
}