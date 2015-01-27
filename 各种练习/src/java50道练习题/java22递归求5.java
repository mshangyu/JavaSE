package java50µ¿¡∑œ∞Ã‚;

public class java22µ›πÈ«Û5 {
	public static void main(String[] args) {
		
		System.out.println(di(5));

	}
	public static int di(int a ){
		long l=0;
		int n=0;
		if (a==1) {
			return 1;
		}else{
			return a*di(a-1);
		}
	}

}
