package redir_stdio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.sql.PseudoColumnUsage;
import java.util.Scanner;

/*System.in  ����        setIn(InputSteam) 
 * System.out   ��Ļ  setOut(OutputSteam)
 * System.err   ��ĻsetError(PrintSteam)
 * */
public class RedirStdio {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PrintStream ps=null;
		try {
			ps=new PrintStream(new FileOutputStream("redir.txt"));
			//system.out--->ps
			System.out.println("�ض���֮ǰ����ӡ���ն�");
			System.out.println(new Object());
			
			System.setOut(ps);
			
			System.out.println("�ض���֮�󣺴�ӡ���ļ�");
			System.out.println(new Object());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			ps.close();
		}
		
		FileInputStream fis=null;
		try {
			fis = new FileInputStream("redir.txt");
			Scanner sc=new Scanner(System.in);
			String str=sc.next();
			System.out.println("�����룺");
			System.out.println("�ض���ǰ ���ն˶�ȡ"+str);
			System.out.println(fis);
			
			//ʹ��System.in���󹹽�scanner����  ����ȡ����
			Scanner scanner=new Scanner(System.in);
			scanner.useDelimiter("\n");
			while (scanner.hasNext()) {
				System.out.println("�ļ��������ݣ�"+scanner.next());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}