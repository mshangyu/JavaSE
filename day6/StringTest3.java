/*���� ����¼��һ���ַ�����������ַ���ֻ�����֣�Ӣ���ַ������
��ֱ�ͳ�����֣���д��ĸ��Сд�ָ����ж���
������Hello123World     ������ �Ӽ�������һ���ַ���
���:��д��2��                 ��������ͳ�Ʊ���
Сд��8��                      �����ַ�����ȡ��ÿһ���ַ�
���֣�3��                       �ж�����ʲô����дСд ����
                                ��Ӧ��ͳ�Ʊ���++
								�������
*/
import java.util.*;
public class StringTest3{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ���ַ���");
		String line= sc.nextLine();
		//��������ͳ�Ʊ���
		int bigCount=0;
		int smallCount=0;
		int numberCount=0;
		
		//�����ַ�����ȡ��ÿһ���ַ�
		for(int x=0;x<line.length();x++){
			char ch=line.charAt(x);
			
			if(ch>='0'&&ch<='9'){
				numberCount++;
			}else if(ch>='a'&&ch<='z'){
				smallCount++;
			}else{
				bigCount++;
			}
		}
		
		//�������
		System.out.println("��д��"+bigCount);
		System.out.println("Сд��"+smallCount);
		System.out.println("���֣�"+numberCount);
	}
}