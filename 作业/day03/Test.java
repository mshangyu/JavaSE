import java.util.*;
public class Test{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		//System.out.println("������ѧ��������");
		//String[][] arr=new String[20][5];
		String[] name=new String[20];//��һ��string�������洢ѧ��������
		String[] course=new String[5];//����һ��string�������洢�γ̵�����
		int[][] number=new int[20][5];//�������ܳɼ�
		int[] sum=new int[20];//���������ܷ�
		int[] avg=new int[20];//��������ƽ����
		
		/*����ѭ���洢�γ̵�����*/
		for(int i=0;i<5;i++){
			System.out.println("��"+(i+1)+"�ſγ�Ϊ");
			course[i]=in.next();   //����������Ŀγ�
		}
		
		/*����¼��ѧ���ĸ��Ƴɼ�*/
		for(int i=0;i<20;i++){ //Ƕ��ѭ�� ��Ҫ��������һ��ѧ��������֮�� �ͻ�ִ��һ�����ѧ�������ſγɼ�
			
			int S=0;
			System.out.println("������ѧ����������");
			name[i]=in.next();   //�����洢 �����������ѧ��������
			for(int j=0;j<5;j++){
				System.out.println("������ѧ��"+name[i]+course[j]+"�ĳɼ�");
				number[i][j]=in.nextInt();//�����洢���յ�����ĳλѧԱ�ľ���ɼ�
				S+=number[i][j];
			}
			sum[i]=S;
			avg[i]=S/5;
		}
		System.out.print("ѧ��");//���û��� ������println
		for(int i=0;i<5;i++){
			System.out.print("\t"+course[i]);//Ϊ������������ ѧ��������ѧ ȫ��������һ��
		}
		System.out.print("\t�ܷ�\tƽ����");
		System.out.println();//Ϊ�˻��� 
		for(int i=0;i<20;i++){         //Ϊ������һ��ѧ���������ͳɼ� ��һ�� ����һ���˵�Ҫ����
			System.out.print(name[i]);
			for(int j=0;j<5;j++){
				System.out.print("\t"+number[i][j]);
			}
			System.out.print("\t"+sum[i]);//sum[i]
			System.out.print("\t"+avg[i]);
			System.out.println();//Ϊ�˻��� 
		}
		
		
		
	}
}