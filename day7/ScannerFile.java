import java.util.*;
import java.io.File;
public class ScannerFile{
	public static void main(String[] args)throws Exception{
		//��һ��file�ļ�������Ϊscanner �Ĺ�����������scanner��ȡ�ļ�����
		File file = new File("ScannerFile.java");		
		Scanner sc=new Scanner(file);
		System.out.println("ScannerFile.java�ļ��������£�");
		//�ж��Ƿ�����һ��
		while(sc.hasNextLine()){
			//�����ļ��е���һ��
			System.out.println(sc.nextLine());
		}
	}
}