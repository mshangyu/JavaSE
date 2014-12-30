package 编码概述;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

import IO基类下面的字符流.FileWriteDemo;

/*
 * public void store(OutputStream out,String comments)
 * public void store(Writer writer,String comments)
 * 
 * load:加载进度
 * store:保存进度
 * */
public class PropertiesDemo5 {
	public static void main(String[] args) throws IOException {
		//创建集合对象
		Properties prop=new Properties();
		//添加元素
		prop.setProperty("梁山伯", "祝英台");
		prop.setProperty("罗密欧", "朱丽叶");
		prop.setProperty("刘艺", "林青霞");
		
		//public void store(Writer writer,String comments)
		prop.store(new FileWriter("ql.txt"), null);
		
	}

}
