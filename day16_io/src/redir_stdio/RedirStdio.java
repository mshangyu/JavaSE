package redir_stdio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.sql.PseudoColumnUsage;
import java.util.Scanner;

/*System.in  键盘        setIn(InputSteam) 
 * System.out   屏幕  setOut(OutputSteam)
 * System.err   屏幕setError(PrintSteam)
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
			System.out.println("重定向之前：打印到终端");
			System.out.println(new Object());
			
			System.setOut(ps);
			
			System.out.println("重定向之后：打印到文件");
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
			System.out.println("请输入：");
			System.out.println("重定向前 从终端读取"+str);
			System.out.println(fis);
			
			//使用System.in对象构建scanner对象  来获取输入
			Scanner scanner=new Scanner(System.in);
			scanner.useDelimiter("\n");
			while (scanner.hasNext()) {
				System.out.println("文件输入内容："+scanner.next());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
