package �������;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class IOEncodeDemo {
	/*
	 * IO���еı������⣺ ��Ҫ��io���ж�д���ݵ�ʱ��ȥ�ƶ����룬����ô���أ� 
	 *	OutputStreamWriter(OutputStream out) Ĭ�ϱ���
	 * OutputStreamWriter(OutputStream out,String charsetName)ָ������
	 * OutputStreamWriter=out+charsetName �ַ���=�ֽ���+�����
	 * 
	 * �������⣺ͳһ���롣
	 */
	public static void main(String[] args) throws IOException {
		//�����ַ�������
		//OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("osw.txt"));//Ĭ�ϱ���GBK
		//OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("osw.txt"),"GBK");//ָ��gbk����
//		OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("osw.txt"),"UTF-8");//ָ������utf-8
//		osw.write("�й�");
//		osw.close();
		
		//�����ַ�������
		//InputStreamReader isr=new InputStreamReader(new FileInputStream("osw.txt"));//Ĭ�ϱ���
		//InputStreamReader isr=new InputStreamReader(new FileInputStream("osw.txt"),"GBK";//ָ������
		InputStreamReader isr=new InputStreamReader(new FileInputStream("osw.txt"),"UTF-8");//ָ������
		char[] chs=new char[20];
		int len=isr.read(chs);
		String s=String.valueOf(chs,0,len);
		System.out.println(s);
		
			
		
		
	}
}
