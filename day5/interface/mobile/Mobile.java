
//����ʵ����==ʵ�ֽӿ�
public class Mobile implements USB,Wifi{
	private int num;//Ҫд��setget����
	private String  brand;
	
	//����һ�����캯��
	public Mobile(){}
	public Mobile(int num,String brand){
		this.num=num;
		this.brand=brand;
	}
	//set() get()��ȡ��Ϣ
	public void info(){
		System.out.println("Ʒ�ƣ�"+brand);
		System.out.println("���룺"+brand);
	}
	
	
	public void call(){
		System.out.println("��绰");
	}
	public void sms(){
		System.out.println("������");
	}
	
	//ʵ��������ʵ�ֽӿ�[����]�ĳ��󷽷�
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