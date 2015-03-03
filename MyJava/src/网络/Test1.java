package 网络;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Test1 {

	public static void main(String[] args) throws IOException, IOException {
		//创建客户端Socket对象。
		Socket s = new Socket("10.205.1.53",12321);
		
		//封装键盘录入
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		//把通道内的输出流封装成字符流
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter
				(s.getOutputStream()));
		
		String line = null;
		while((line = br.readLine()) != null){
			if("over".equals(line)){
				break;
			}	
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		
		//释放资源
		s.close();
	}

}