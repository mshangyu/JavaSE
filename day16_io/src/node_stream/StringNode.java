package node_stream;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

/*�ڵ�������ײ��豸�������ͼ���
 * �����������ڽڵ������߼���
 *
 * */
public class StringNode {
	public static void main(String[] args) {
		//ʹ���ڴ��е��ַ�������Ϊ����Դ
		String src="aaaaaaaaaaaaaa"+"bbbbbbbbbbb"+"ccccccccccccccc"+"dddddddddddddddddddddd";
		
		char[] buffer=new char[32];
		int hasRead=0;
		StringReader sr=new StringReader(src);
		try {
			while ((hasRead=sr.read(buffer))>0) {
				System.out.println(new String(buffer,0,hasRead));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//�ڵ����������
		StringWriter sw=new StringWriter();
		sw.write("eeeeeeeeeeeeeeee");
		sw.write("ffffffffffffffff");
		sw.write("ggggggggggggggggg");
		sw.write("zzzzzzzzzzzzzzzzzzzzzzz");
		System.out.println(sw.toString());
		
		
		
		
		
		
		
		
		
	}

}
