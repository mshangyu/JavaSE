public class IntTest{
	public static void main(String args[]){
		//С���γ���Ĭ���Զ�ת����int����
		int num = 68;
		//�����γ��������Զ�ת����long����
		//long long1 = 8888;
		long long1=8888999999L;//�����Ǵ�дL
		long long2 = 88888888l;
		
		//�˽��Ʊ�ʾ���Σ���0��ͷ
		int var = 013;
		System.out.println("var:" + var);
		//ʮ�����Ʊ�ʾ���Σ���Ox��OX��ͷ
		int hexNum =  0xFF;
		int hexNum1 = 0X1F;
		System.out.println("hexNum:" + hexNum + "\n hexNum1" + hexNum1);
		//�����Ʊ�ʾ����0b��0B��ͷ
		byte byteNum = (byte )0b11111111;
		int intNum = 0b11111111;
		System.out.println("byteNum:" + byteNum + "\n byteNum"  +byteNum);	
	}


}