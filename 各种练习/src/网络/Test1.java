package ����;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Test1 {

	public static void main(String[] args) throws IOException, IOException {
		//�����ͻ���Socket����
		Socket s = new Socket("10.205.1.53",12321);
		
		//��װ����¼��
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		//��ͨ���ڵ��������װ���ַ���
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
		
		//�ͷ���Դ
		s.close();
	}

}