package process_stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.sql.PseudoColumnUsage;

/*���������������˵ײ������豸�Ͻڵ����ò��� ���ṩ�˸��ӷ���������������
 * ���裺  1���ṩһ���ڵ���
 * 2����װ�ɴ�����
 * 3��ֱ��ʹ�ô�������io���� ����ӵز����ײ���豸�ļ�
 * 4���ر�
 * 
 *ʹ��PrintStream ��װ��OutputStream  �ֽ���==�ڵ���
 * 
 * */
public class PrintStreamTest {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos=null;
		PrintStream ps=null;
		try {
			//1\�����ڵ���
			fos=new FileOutputStream("process_stream.txt");
			//2\��װ������
			ps=new PrintStream(fos);
			//3\io����
			ps.println("������");
			ps.println(new PrintStreamTest()); //��ǰ�����������
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