import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//文件中 对于异常的处理
public class Test异常 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//字符输出流
		FileWriter fw=null;
		try {
			fw=new FileWriter("baidu.txt");
			fw.write("百度杀毒");//写到了缓冲区
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if (fw!=null) {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
		}
		
		

	}

}
