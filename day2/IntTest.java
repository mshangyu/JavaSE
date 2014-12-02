public class IntTest{
	public static void main(String args[]){
		//小整形常量默认自动转化成int类型
		int num = 68;
		//大整形常量不会自动转化成long类型
		//long long1 = 8888;
		long long1=8888999999L;//建议是大写L
		long long2 = 88888888l;
		
		//八进制表示整形：以0开头
		int var = 013;
		System.out.println("var:" + var);
		//十六进制表示整形：以Ox，OX开头
		int hexNum =  0xFF;
		int hexNum1 = 0X1F;
		System.out.println("hexNum:" + hexNum + "\n hexNum1" + hexNum1);
		//二进制表示：以0b。0B开头
		byte byteNum = (byte )0b11111111;
		int intNum = 0b11111111;
		System.out.println("byteNum:" + byteNum + "\n byteNum"  +byteNum);	
	}


}