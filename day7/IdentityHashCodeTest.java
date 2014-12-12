public class IdentityHashCodeTest{
	public static void main(String[] args){
		//下面程序中s1和s2是两个不同对象
		String s1=new String("hello");
		String s2=new String("hello");
		//String 重写了hashCode（）方法--改为根据字符序列计算hashCode值
		//因为s1和s2的字符序列相同，所以他们的hashCode（）方法返回值相同
		System.out.println(s1.hashCode()+"---"+s2.hashCode());
		String s3="Java";
		String s4="Java";
		//s3和s4是相同的字符串对象，所以它们的identityHashCode值相同
		System.out.println(System.identityHashCode(s3)+"--"+System.identityHashCode(s4));
		
	}
}