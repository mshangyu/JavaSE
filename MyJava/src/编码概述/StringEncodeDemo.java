package �������;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class StringEncodeDemo {

	/*String���еı�������
	 * ���룺���ܹ������ı�ɿ�������
	 * String---byte[]
	 * ���룺�ѿ������ı���ܿ��ö���
	 * byte[]---String
	 * 
	 * ������
	 */
	public static void main(String[] args) throws UnsupportedEncodingException {
		String s="���";
		//����
		//byte[] bys=s.getBytes();//Ĭ�ϱ���GBK
		//byte[] bys=s.getBytes("GBK");//ָ������GBK
		byte[] bys=s.getBytes("UTF-8");//ָ������UTF-8
		System.out.println(Arrays.toString(bys));
		
		//����
		//String ss=new String(bys);//Ĭ��GBK
		String ss=new String(bys,"UTF-8");//ָ������UTF-8
		System.out.println(ss);

	}

}
