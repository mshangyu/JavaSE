public class Test{
	public static void main(String[] args){
		Mobile t2=new Mobile(1234,"����2.0");
		t2.info();
		t2.call();
		t2.sms();
		
		//wifi
		t2.open();
		t2.close();
		//�ӿ��� ֱ�ӷ��� ����
		System.out.println("wifi:"+Wifi.ssid+"����"+Wifi.pass);
		//System.out.println("wifi:"+t2.ssid+"����"+t2.pass);
		
		//usb
		t2.read();
		t2.write();
		System.out.println("usb�ӿ�"+USB.version);//����ֱ��ͨ���ӿ��������ʳ���
		//System.out.println("usb�ӿ�"+t2.version);
		
		
		//System.out.println(t2.read());
	}
}