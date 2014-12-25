/*
 * 
 * */
package 异常;

public class TeacherTestDemo {
	public static void main(String[] args) {
//		Teacher t=new Teacher();
//		try {
//			t.checkScore(-20);
//		} catch (ScoreException e) {
//			e.printStackTrace();
//		}
		Teacher t=new Teacher();
		try {
			
		} catch (ScoreException e) {
			e.printStackTrace();
		}
		
		t.checkScore(1000);//运行时异常
	}

}
class ScoreException extends RuntimeException{
	public ScoreException(){}
	public ScoreException(String s){
		super(s);
	}
}

class Teacher{
	//方法上的throws是告诉你 你调用方法的时候  要注意问题
	public void checkScore(int score) {
		if (score<0||score>100) {
			//这里是把实际的异常对象抛出
			throw new ScoreException("分数必须是0到100之间");
		}else{
			System.out.println("分数正常");
		}
	}
}