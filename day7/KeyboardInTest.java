import java.util.*;
import java.io.*;
public class KeyboardInTest{
	public static void main(String[] args) throws Exception{
		//��System��in�ֽ���Ϊ���� ����һ��bufferedReader����
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String line=null;
		//���ж�ȡ��������
		while((line=br.readLine()) !=null){
			System.out.println("�û�����������ǣ�"+line);
		}
	}
}

//BufferedReader �������ж�ȡ�û��ļ������� �û���ÿ�μ������붼��BufferesReader����String���� ���Ƕ�ȡstring����