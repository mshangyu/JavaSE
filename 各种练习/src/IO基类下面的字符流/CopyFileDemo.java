package IO基类下面的字符流;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*需求：把项目路径下的IODemo.java这个文件的内容复制到d:\\Copy.java中
 *  只要做的是复制类型的擦欧洲哦，你就应该明白两个内容
 *  数据源：
 * 			读取数据的地方   IODemo.java----字符输入流----FileReader
 * 目的地：
 * 			写出数据的地方  d:\\Copy.java ---字符输入流---FileWriter
 * */
public class CopyFileDemo {
	public static void main(String[] args) throws IOException {
		//封装数据源
		FileReader fr=new FileReader("IODemo.java");
		//封装目的地
		FileWriter fw=new FileWriter("d:\\Copy.java");
		
		//读取数据并且写出数据
		int ch=0;
		while ((ch=fr.read())!=-1) {
			fw.write(ch);
		}
		
		
		//释放资源
		fw.close();
		fr.close();

	}

}
