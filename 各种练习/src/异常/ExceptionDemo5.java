/*针对变异时期的异常才需要编写出代码进行处理
 * A 方案1 try 。。catch ..finally
 * B 抛出异常：
 * 			把异常抛到方法上
 * 			格式： throws 异常类名；
 * 目前做法：
 * 			看到了程序出现了异常问题，点击鼠标解决即可
 * 			能够用try解决的尽量不要用throws
 * 
 * */
package 异常;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionDemo5 {
	public static void main(String[] args) {
		//日期类的一个问题
		String s="2008-08-08";
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		//方式一
//		try {
//			Date d=(Date) sdf.parse(s);
//			System.out.println(d);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		//方式二
//		Date d =sdf.parse(s);
//		System.out.println(d);
		
		//注意：
		Date d=null;
		try{
			//System.out.println(10/0);
			d=(Date) sdf.parse(s);
		}catch(ParseException e){
			e.printStackTrace();
		}
		System.out.println(d.toString());
	}

}
