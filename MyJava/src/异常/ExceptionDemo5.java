/*��Ա���ʱ�ڵ��쳣����Ҫ��д��������д���
 * A ����1 try ����catch ..finally
 * B �׳��쳣��
 * 			���쳣�׵�������
 * 			��ʽ�� throws �쳣������
 * Ŀǰ������
 * 			�����˳���������쳣���⣬������������
 * 			�ܹ���try����ľ�����Ҫ��throws
 * 
 * */
package �쳣;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionDemo5 {
	public static void main(String[] args) {
		//�������һ������
		String s="2008-08-08";
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		//��ʽһ
//		try {
//			Date d=(Date) sdf.parse(s);
//			System.out.println(d);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		//��ʽ��
//		Date d =sdf.parse(s);
//		System.out.println(d);
		
		//ע�⣺
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
