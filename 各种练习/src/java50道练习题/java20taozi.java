package java50����ϰ��;


public class java20taozi{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double m=2;
		double n=1;
		double s=0;
		for(int i=1;i<=20;i++){
			s=s+m/n;
			//System.out.println("di"+s+++"  "+m+"/"+n);
			double temp;
			temp=m;
			m=m+n;
			n=temp;	
		}
		System.out.println(m+"/"+n);
	}

}
