import java.util.*;
public class Test511{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("��������Ҫ���ҵ�ѧ������");
		String name =in.next();
		String[] arr={"����","����","��������","С��","�ڻ�"};
		boolean flag=false;//���
		for(int i=0;i<arr.length;i++){
			if(name.equals(arr[i])){
				flag=true;
				break;
			
			}
			if(flag==true){
				System.out.println("�ҵ���");
			}else{
				System.out.println("û�����ѧԱ");
			}
		
		}
	}
}