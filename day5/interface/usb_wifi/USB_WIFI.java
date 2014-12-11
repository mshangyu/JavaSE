
//接口的多继承：继承接口+新增特有的常量、抽象方法
//接口+继承接口+完成实现类+实例化
public interface USB_WIFI extends USB,Wifi{
	String brand ="mi";
	
	//
	void usb2wifi();
	

}