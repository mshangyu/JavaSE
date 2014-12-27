/*
 * 1��writer����������write����
 * 
 * 
 * */

package IO����������ַ���;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteDemo1 {
	public static void main(String[] args) throws IOException {
		// ��������
		// ����ļ������ڣ��ʹ����ļ�
		// ����ļ����ڣ�д���ݵ�ʱ�򡣾������ݵĸ���
		FileWriter fw = new FileWriter("fw3.txt");

		// 1\write(String str)
		fw.write("hello");
		// 2\write(int c)
		fw.write(4);
		// 3\write(char[] cbuf)
		char[] chs = { 'a', 'b', 'c', 'd', 'e', 'f', 'g' };
		fw.write(chs);
		// 4\write(char[] cbuf,int off,int len)
		fw.write(chs, 0, 3); // ��0��ʼ3��
		// 5\write(String str,int off.int len)
		fw.write("java", 0, 2);

		// �ͷ���Դ
		fw.close();
	}

}
