
//定义实现类==实现接口
public class Mobile implements USB,Wifi{
	private int num;//要写上setget方法
	private String  brand;
	
	//设置一个构造函数
	public Mobile(){}
	public Mobile(int num,String brand){
		this.num=num;
		this.brand=brand;
	}
	//set() get()获取信息
	public void info(){
		System.out.println("品牌："+brand);
		System.out.println("号码："+brand);
	}
	
	
	public void call(){
		System.out.println("打电话");
	}
	public void sms(){
		System.out.println("发短信");
	}
	
	//实现类义务：实现接口[所有]的抽象方法
	//usb
	public void read(){
		System.out.println("read USB");
	}
	public void write(){
		System.out.println("write USB");
	}
	//wifi
	public void open(){
		System.out.println("Open Wifi");
	}
	public void close(){
		System.out.println("Close Wifi");
	}
}