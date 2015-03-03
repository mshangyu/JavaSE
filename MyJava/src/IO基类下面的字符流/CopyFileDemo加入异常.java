
//�����ļ��ı�׼����
package IO����������ַ���;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileDemo�����쳣 {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		try{
		// ��װ����Դ
		fr = new FileReader("IODemo.java");
		// ��װĿ�ĵ�
		fw = new FileWriter("d:\\Copy.java");

		// ��ȡ���ݲ���д������
		int ch = 0;
		while ((ch = fr.read()) != -1) {
			fw.write(ch);
		}

		}catch(FileNotFoundException e){
			e.printStackTrace();
			System.out.println("�Ҳ����ļ�");
		}catch (IOException e) {
			e.printStackTrace();
			System.out.println("��д�ļ�ʧ��");
		}finally{
			if (fw!=null) {
				// �ͷ���Դ
				try {
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println("�ͷ������ʧ��");
				}
				if (fr!=null) {
					try {
						fr.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						System.out.println("�ͷ�������ʧ��");
					}
				}
				
			}
			
		}
	}
}
