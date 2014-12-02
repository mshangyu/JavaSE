public class FloatTest{
	public static void main(String args[]){
		//
		float floatNum = 123;
		System.out.println("floatNum="+floatNum);
		//浮点类型常量默认为：double类型
		//float floatNum1 = 3.14;//error
		float floatNum2 = 3.14e2f;//f或F
		float floatNum1 = 3.14f;
	    
		
		float sum = (float)(floatNum + floatNum1+321+3.14);
		System.out.println('a');
		System.out.println('a'+1);
		System.out.println('a'+(byte)1);
		
		
		byte b = 3;
		// b = (byte )(b+4);
		
		
		byte b1=3,b2=4,b3;
		//b3 = b1+b2;//b1b2先会提升成int型 而b3仍然是byte类型  所以报错
		b3=(byte)(b1+b2);
	
		b3=3+4;//当3+4相加超过127时候就会报错
	}
	
}	