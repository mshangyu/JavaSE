package char_stream;

import java.io.FileWriter;
import java.io.IOException;

/*File 对象
 * 流对象：  操作文件内容
 * 
 * */
public class FileWriterDemo {
	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("new.txt");
		//写入缓冲区
		fw.write("hello\r\n");
		//假如文件已经存在 ：write追加操作 再一次运行的时候 才是追加
		//fw.write("world\r\n");
		fw.write("java\r\n");//如果文件已经存在会覆盖
		fw.flush();
		//释放资源
		fw.close();
		
		FileWriter fw2=new FileWriter("file_append.txt",true);
		fw2.write("google\r\n");
		fw2.write("gmail\r\n");
		fw2.close();

	}

}
