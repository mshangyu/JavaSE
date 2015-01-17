package java50道练习题;

public class java16九九乘法表 {
	public static void main(String[] args) {
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+"x"+i+"="+i*j+" ");
				//这句为了格式可以对齐
				if(j>1 && j*i<10){System.out.print(" ");}
			}System.out.println();
		}

	}

}
