public class Test{
	public static void main(String[] args){
			//Miwifi a=new Miwifi();
			USB_WIFI a=new Miwifi();//����ת��
			//Miwifi mi=(Miwifi)a;//����ת��
			System.out.println(((Miwifi)a).brand);//ǿת
			System.out.println(a.brand);
			a.open();
			a.close();
			a.read();
			a.write();
			a.usb2wifi();
	}
}