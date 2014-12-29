package 编码概述;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;
import java.util.Set;

/*把键值对形式的文件数据加载到Properties集合中
 * public void load(InputStream inStream)
 *public void load(Reader reader)
 * */
public class PropertiesDemo4 {
	public static void main(String[] args) throws IOException {
		Properties prop=new Properties();
		
		//public void load(Reader reader)
		
//		Reader r=new FileReader("user.txt");
//		prop.load(r);
//		r.close();
		//上面三步可以转换成一步
		prop.load(new FileReader("user.txt"));
		
		
		Set<String> set=prop.stringPropertyNames();
		for (String key : set) {
			String value=prop.getProperty(key);
			System.out.println(key+"---"+value);
		}
	}

}
