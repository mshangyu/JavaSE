
/*1\����û�л���  �뻻����ô�죿
 *      �����������߼������Ǽ����˻��з���\n ��������û�н������
 *      ԭ����ʲô�أ�
 *      	��ͬ�Ĳ���ϵͳ�Ի��з���ʶ��һ��
 *      	windows:\r\n
 *      linux:\n
 *      mac:\r
 *      �����Ĺ�������ṩ�ļ��±����ܱȽ�ǿ��  ����ʶ������һ�ֻ��з�
 *      if(xxx=='\n'||xxx=='\r'||xxx.equals("\r\n")){....}
 * 2�����ʵ�����ݵ�׷��д���أ�
 * 	ʹ�ô����������Ĺ��췽���� �ڶ�������ָʾ�Ƿ�׷��д��
 * */
package IO����������ַ���;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteDemo3 {
	public static void main(String[] args) throws IOException {
		//��������
		//FileWriter fw=new FileWriter("fw4.txt");
		
		
		//public FileWriter(String filename,boolean append)
		//�����ʾ ��β��Ǵ�ͷ��ʼ���Ǵ��ϴε�ĩβ ��׷��
		FileWriter fw=new FileWriter("fw4.txt",true);
		
		
		
		
		//д����
		for (int x = 0; x < 10; x++) {
			fw.write("java"+x);
			//���뻻�з�
			fw.write("\r\n");
		}
		
		//�ͷ���Դ
		fw.close();
	}

}
