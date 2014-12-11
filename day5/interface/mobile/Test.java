public class Test{
	public static void main(String[] args){
		Mobile t2=new Mobile(1234,"锤子2.0");
		t2.info();
		t2.call();
		t2.sms();
		
		//wifi
		t2.open();
		t2.close();
		//接口名 直接访问 常量
		System.out.println("wifi:"+Wifi.ssid+"密码"+Wifi.pass);
		//System.out.println("wifi:"+t2.ssid+"密码"+t2.pass);
		
		//usb
		t2.read();
		t2.write();
		System.out.println("usb接口"+USB.version);//可以直接通过接口名来访问常量
		//System.out.println("usb接口"+t2.version);
		
		
		//System.out.println(t2.read());
	}
}