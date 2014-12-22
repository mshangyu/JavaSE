import com.sun.org.apache.xerces.internal.impl.dv.xs.AbstractDateTimeDV;


public class Demo<QQ> {
	public void print(QQ qq){
		System.out.println(qq);
	}
	//把泛型加在方法上
	public <AD> void method(AD ad){
		System.out.println(ad);
	}
}
