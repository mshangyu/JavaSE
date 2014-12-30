package process_stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.sql.PseudoColumnUsage;

/*处理。流：隐藏了底层物理设备上节点流得差异 并提供了更加方便的输入输出方法
 * 步骤：  1、提供一个节点流
 * 2、封装成处理流
 * 3、直接使用处理流得io操作 ：间接地操作底层的设备文件
 * 4、关闭
 * 
 *使用PrintStream 包装和OutputStream  字节流==节点流
 * 
 * */
public class PrintStreamTest {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos=null;
		PrintStream ps=null;
		try {
			//1\创建节点流
			fos=new FileOutputStream("process_stream.txt");
			//2\封装处理流
			ps=new PrintStream(fos);
			//3\io操作
			ps.println("处理流");
			ps.println(new PrintStreamTest()); //当前类的匿名对象
			ps.println("hello");
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			fos.close();
			ps.close();
		}
		
	
		

	}

}
