package file_demo;
/*File:java.io  与平台无关的 目录 文件
 * 		创建、删除、重命名
 * File类： 不能直接访问 内容本身，---使用输入、输出流来对内容进行操作
 * 
 * */
import java.io.File;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) throws IOException {
		//.当前路径..上一目录

		File file =new File(".");
		System.out.println(file);
		System.out.println(file.getName());
		System.out.println(file.getPath());
		System.out.println(file.getAbsolutePath());//返回对象对应的绝对路径
		System.out.println(file.getAbsoluteFile());//返回绝对路径
		System.out.println(file.getParent());
	
		//创建文件  临时文件(这里是静态的 可以直接使用类名来访问)
//		File tmpFile =File.createTempFile("tem_file", ".txt");
//		File tmp =File.createTempFile("tmp_file", ".txt", file);
//		//当jvm退出的时候 删除 
//		tmpFile.deleteOnExit();
//		tmp.deleteOnExit();
//		
//		//创建文件
//		File file2=new File("create_bycode");
//		//File file2=new File("create_bycode/sub_dir/sub_dir");  //仅仅是创建了一个对象  不代表创建了文件
//		System.out.println(file2.createNewFile());
//		//在同一目录不能创建同名的文件和文件夹
//		//file2.createNewFile();//这两个 每次只能执行一个  不能用一个
//		//System.out.println(file2.mkdir());
//		//System.out.println(file2.mkdirs());
//		
//		System.out.println(file2.exists());
//		
//		//如果file表示一个文件 那么list（）将返回null
//		String[] str_dir=file.list();
//		String[] str_file=file2.list();
//		//System.out.println("std_str?"+str_dir.equals(null)+"str_file?"+str_file.equals(null)); 有异常 我们就直接输出
//		System.out.println("std_str?"+str_dir+"str_file?"+str_file);
//		//遍历：
//		System.out.println("打印当前路径下的文件 文件夹");
//		for (String string : str_dir) {
//			System.out.println(string);
//		}
		
		File[] roots=file.listRoots();
		for (File root : roots) {
			System.out.println(root);
		}
	}

}
