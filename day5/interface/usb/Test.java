public class Test{
	public static void main(String[] args){
		//USB a=new USB_KEY();
		//USB_KEY d=(USB_KEY)a;
		//d.read();
		//d.write();
		
		//System.out.println(new USB_KEY().read());
		new USB_KEY().read();
		
		//USB b=new Udisk();
		//Udisk h=(Udisk)b;
		//h.read();
		//h.write();
		
		//�̳е�����ת�� vs�ӿڡ�ʵ���������ת��
		USB b=new Udisk();
		b.read();
		b.write();
	
	}
}