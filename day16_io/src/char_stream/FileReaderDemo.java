package char_stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//�ļ�������:�ļ�������� ���� ���쳣
		FileReader fr=new FileReader("google.txt");
		FileWriter fw=new FileWriter("wode.txt");
		//�����ַ�������ն�
		int ch=0;
		while ((ch=fr.read())!=-1) {
			fw.write(ch);//������д�뵽�ļ���ȥ
			fw.flush();
			System.out.print((char)ch);  //��ʾ���ն�
		}
		//��������ַ�����
		char[] chs=new char[1024];
		int len=0;
		while ((len=fr.read(chs))!=-1) {
			fw.write(chs);
			fw.flush();
			System.out.print(String.valueOf(chs, 0, len));
		}
		
//		//
//		int ch2=fr.read();
//		System.out.print((char)ch2);}
		
		fw.close();
		fr.close();
	}
}