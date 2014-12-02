//日期  作者   时间
public class CharTest{
	public  static  void main(String args[]){
		char eChar ='J';
		char cChar = '中';
		char hexChar = '\u0061';//十六进制
		char hexChar1 ='\u9999';
		char c = '\n';
		
		
		System.out.println("" + eChar + cChar + hexChar + hexChar1);
		System.out.println("" + eChar + cChar + c + hexChar + hexChar1);
	
	}

}