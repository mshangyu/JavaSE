
package 网络;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class URLDecoderTest {
	public static void main(String[] args) throws UnsupportedEncodingException {
		//将application/x-www-form-urlencoded
		//转换成普通字符串
		//其中的字符串直接从图17.3所示的窗口中复制过来
		String keyWord=URLDecoder.decode("%B7%E8%BF%F1java","GBK");
		System.out.println(keyWord);
		//将普通字符串转换成
		//application/x-www-form-urlencoded字符串
		String ur1str=URLDecoder.decode("疯狂Android讲义","GBK");
		System.out.println(ur1str);
	}



}
