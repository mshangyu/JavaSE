import java.awt.image.RescaleOp;
import java.util.Comparator;




public  class MyComparator implements Comparator<Student>{

	@Override
	public int compare(Student ss1, Student ss2) {
		int num=ss2.getName().length()-ss1.getName().length();
		int num2=num==0?ss1.getName().compareTo(ss2.getName()):num;
		int num3=num2==0?ss1.getAge()-ss2.getAge():num2;
		return num3;
	}

	



}
