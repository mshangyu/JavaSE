//�����ַ��������λ�ȡ�ַ����е�ÿһ���ַ�
public class StringTest1{
	public static void main(String[] args){
		//����һ���ַ���
		String s="helloworld";
		
		//charAt(int index)
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(1));
		System.out.println(s.charAt(2));
		System.out.println(s.charAt(3));
		System.out.println(s.charAt(4));
		
		//ͨ��length������charAt��� ���Ա����ַ���
		for(int x=0;x<s.length();x++){
			System.out.println(s.charAt(x));
		}
	}
}