import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/*
 * 
 * */
public class ByToChar {
	public static void main(String[] args) {
		//System.in==字节输入流
		InputStreamReader isr=new  InputStreamReader(System.in);
		//
		BufferedReader br=new BufferedReader(isr);
		
		String buff=null;
		
		try {
			while ((buff=br.readLine())!=null) {
				if (buff.equals("exit")) {
					System.out.println("exit--------");
					System.exit(1);
				}
				System.out.println("输入的："+buff);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
