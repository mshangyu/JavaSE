package 编码概述;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class StringEncodeDemo {

	/*String类中的编码问题
	 * 编码：把能够看懂的变成看不懂的
	 * String---byte[]
	 * 解码：把看不懂的变成能看得懂的
	 * byte[]---String
	 * 
	 * 举例：
	 */
	public static void main(String[] args) throws UnsupportedEncodingException {
		String s="你好";
		//编码
		//byte[] bys=s.getBytes();//默认编码GBK
		//byte[] bys=s.getBytes("GBK");//指定编码GBK
		byte[] bys=s.getBytes("UTF-8");//指定编码UTF-8
		System.out.println(Arrays.toString(bys));
		
		//解码
		//String ss=new String(bys);//默认GBK
		String ss=new String(bys,"UTF-8");//指定编码UTF-8
		System.out.println(ss);

	}

}
