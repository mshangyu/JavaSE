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
		//文件输入流:文件必须存在 否则 ：异常
		FileReader fr=new FileReader("google.txt");
		FileWriter fw=new FileWriter("wode.txt");
		//单个字符输出到终端
		int ch=0;
		while ((ch=fr.read())!=-1) {
			fw.write(ch);//这里是写入到文件中去
			fw.flush();
			System.out.print((char)ch);  //显示在终端
		}
		//输出整个字符数组
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
