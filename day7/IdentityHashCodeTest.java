public class IdentityHashCodeTest{
	public static void main(String[] args){
		//���������s1��s2��������ͬ����
		String s1=new String("hello");
		String s2=new String("hello");
		//String ��д��hashCode��������--��Ϊ�����ַ����м���hashCodeֵ
		//��Ϊs1��s2���ַ�������ͬ���������ǵ�hashCode������������ֵ��ͬ
		System.out.println(s1.hashCode()+"---"+s2.hashCode());
		String s3="Java";
		String s4="Java";
		//s3��s4����ͬ���ַ��������������ǵ�identityHashCodeֵ��ͬ
		System.out.println(System.identityHashCode(s3)+"--"+System.identityHashCode(s4));
		
	}
}