package char_stream;

import java.io.FileWriter;
import java.io.IOException;

/*File ����
 * ������  �����ļ�����
 * 
 * */
public class FileWriterDemo {
	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("new.txt");
		//д�뻺����
		fw.write("hello\r\n");
		//�����ļ��Ѿ����� ��write׷�Ӳ��� ��һ�����е�ʱ�� ����׷��
		//fw.write("world\r\n");
		fw.write("java\r\n");//����ļ��Ѿ����ڻḲ��
		fw.flush();
		//�ͷ���Դ
		fw.close();
		
		FileWriter fw2=new FileWriter("file_append.txt",true);
		fw2.write("google\r\n");
		fw2.write("gmail\r\n");
		fw2.close();

	}

}
