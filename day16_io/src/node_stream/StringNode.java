package node_stream;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

/*节点流：与底层设备关联、低级流
 * 处理流：基于节点流、高级流
 *
 * */
public class StringNode {
	public static void main(String[] args) {
		//使用内存中的字符串、作为数据源
		String src="aaaaaaaaaaaaaa"+"bbbbbbbbbbb"+"ccccccccccccccc"+"dddddddddddddddddddddd";
		
		char[] buffer=new char[32];
		int hasRead=0;
		StringReader sr=new StringReader(src);
		try {
			while ((hasRead=sr.read(buffer))>0) {
				System.out.println(new String(buffer,0,hasRead));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//节点流的输出流
		StringWriter sw=new StringWriter();
		sw.write("eeeeeeeeeeeeeeee");
		sw.write("ffffffffffffffff");
		sw.write("ggggggggggggggggg");
		sw.write("zzzzzzzzzzzzzzzzzzzzzzz");
		System.out.println(sw.toString());
		
		
		
		
		
		
		
		
		
	}

}
