public class StringDemo3{
	public static void main(String[] args){
		String s="helloworld";
		System.out.println("length:"+s.length());
		
		//��ȡ�ַ���ָ�����ĳ���
		System.out.println("charAt:"+s.charAt(2));
	
		//��ȡĳ���ַ���һ���ڸ��ַ����г��ֵ�λ��
		System.out.println("indexof:"+s.indexOf('d'));
		
		//��ȡĳ���ַ��ڸ��ַ����д�ָ����������ʼ�ĵ�һ�γ��ֵ�˳��
		System.out.println("indexof"+s.indexOf('w',3));
		
		//��ȡ�Ӵ���start��ĩβ
		System.out.println("substring:"+s.substring(6));
		
		//��ȡ�Ӵ� ��start��end
		System.out.println("substring:"+s.substring(3,9));
	}
}