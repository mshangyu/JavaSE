import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//�ļ��� �����쳣�Ĵ���
public class Test�쳣 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//�ַ������
		FileWriter fw=null;
		try {
			fw=new FileWriter("baidu.txt");
			fw.write("�ٶ�ɱ��");//д���˻�����
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if (fw!=null) {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
		}
		
		

	}

}
