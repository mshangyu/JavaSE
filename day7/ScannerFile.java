import java.util.*;
import java.io.File;
public class ScannerFile{
	public static void main(String[] args)throws Exception{
		//将一个file文件对象作为scanner 的构造器参数，scanner读取文件内容
		File file = new File("ScannerFile.java");		
		Scanner sc=new Scanner(file);
		System.out.println("ScannerFile.java文件内容如下：");
		//判断是否还有下一行
		while(sc.hasNextLine()){
			//输入文件中的下一行
			System.out.println(sc.nextLine());
		}
	}
}