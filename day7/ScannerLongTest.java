import java.util.*;
public class ScannerLongTest{
	public static void main(String[] args){
		//syatem.in ����׼���� ���Ǽ�������
		Scanner sc=new Scanner(System.in);
		//�ж��Ƿ�����һ��long����
		while(sc.hasNextLong()){      //Ҫ���������ı����ǳ����ε� ����ͽ���
			//���������
			System.out.println("��������������ǣ�"+sc.nextLong());
		}
	}
}


//�����򵥵ķ��������ж�ȡ
//boolean hasNextLine()   ��������Դ���Ƿ�����һ��
//String nextLine()   ��������Դ����һ�е��ַ���
