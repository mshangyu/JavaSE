public class StringDemo2{
	public static void main(String[] args){
		String s1=new String("hello");//ͨ��new�����ľ��ǲ�ͬ�ĵ�ֵַ�� ��ͬһ�����е��ǲ���ͬһ��λ��
		String s2=new String("hello");
		System.out.println(s1==s2);  //false
		System.out.println(s1.equals(s2));//true
		
		String s3=new String("hello");
		String s4="hello";
		System.out.println(s3==s4);//false
		System.out.println(s3.equals(s4));//true
		
		String s5="hello";
		String s6="hello";
		System.out.println(s5==s6);//true
		System.out.println(s5.equals(s6));//true
		
		String s7="hello";
		String s8="world";
		System.out.println(s7==s8); //false
		System.out.println(s7.equals(s8));//false
	
		//�ڶ���
		String s9="hello";
		String s10="world";
		String s11="helloworld";
		//������ַ���������ӣ��ȿ��ռ� ����Ӵ洢
		System.out.println(s11==s9+s10);//false
		System.out.println(s11.equals(s9+s10));//true
		//������ַ���������ӣ��ȼӣ��ڳ����������� ������оͷ��س���������ĵ�ַ�����ھʹ����µĴ洢�ռ�
		System.out.println(s11=="hello"+"world");//true
	}
}