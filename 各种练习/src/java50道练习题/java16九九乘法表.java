package java50����ϰ��;

public class java16�žų˷��� {
	public static void main(String[] args) {
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+"x"+i+"="+i*j+" ");
				//���Ϊ�˸�ʽ���Զ���
				if(j>1 && j*i<10){System.out.print(" ");}
			}System.out.println();
		}

	}

}
