import javax.swing.text.TabableView;

/*����һ��ѧ�� �ҿ��Զ�����������ֵ ��Ҳ���Ի�ȡ������ֵ �����̼߳�ͨ�ŵİ���������
 * ��Դ��Student
 * �����̣߳� setthread
 * ��ȡ�̣߳� getthread
 * �����ࣺ StudentDemo
 * 
 * ����һ��ÿ���̲߳��������Լ����Ǹ�ѧ������
 * ��ô����� �ö���̲߳���ͬһ��ѧ������
 * 
 * ����2��һ�θ�ֵ�ͻ�ȡֵ�ò��� ���ݶ�����������
 * �̵߳�����ԣ�
 * 
 * ���������̲߳����Ķ���һ�㶼�ǱȽϸ��ӵĲ��� �������Ǽ�����ѭ���Ĳ���
 * �������ʱ�� �����˸�������� 
 * ͬһ�����ݳ����˶��     ��CPU��һ���ʱ���㹻����ִ�кܶ�εĲ���
 * 					����ϼ---27
 * 				  	 ����ϼ---27
 * 					 ����ϼ---27
 * ����Ҳ���������⣺     ����cpu��ÿһ�ε�ִ�е�Ӧ����ԭ���Բ���
 * 				liuyi--27
 * 				����ϼ--30
 * 
 * ����̰߳�ȫ���⣺
 *      ���� ������̰߳�ȫ�����
 *      �Ƕ��̻߳�������
 *      �й����������� s����
 *      �Թ��������ж����������� s.name  s.age
 *      
 *      ��ν���أ�
 *      �ѻ���ֵĴ�����ͬ�������������
 *      
 * �����ģ�  ���Ǽ������߳�ͬ���� ��Ȼ��������
 * 		1�������̲߳�����ʱ��Ҫ��֤ͬ�������뱣֤ÿһ�����͵��̱߳����ͬ��������ֻset ��ͬ��get
 * 		2����ʹ�Ǹ��������͵��̼߳��� Ҳ����Ҫ����ͬһ����
 * */
public class StudentDemo {
	public static void main(String[] args) {
		//����һ��ѧ������
		Student s=new Student();
		SetThread st=new SetThread(s);
		GetThread gt=new GetThread(s);
		
		Thread t1=new Thread(st);
		Thread t2=new Thread(gt);
		
		t1.start();
		t2.start();
	}

}
class Student{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
}


class SetThread implements Runnable{
	private Student s;
	private int x=0;
	
	public SetThread(Student s){
		this.s=s;
	}
	
	@Override
	public void run() {
		//Student s=new Student();
		while(true){//�˴�����Ӱ���̰߳�ȫ����  ����Ҫͬ��
			//���ҵñ�֤������ͬһ���� �Ϳ���������new�����Ķ���  ����Ҫ����������
			//synchronized (new Object()) {
			synchronized (s) {	
				if(x%2==0){
					s.setName("����ϼ");
					s.setAge(27);
				}else {
					s.setName("liuyi");
					s.setAge(30);
				}
				x++;
			}
			
		}
	}
}
class GetThread implements Runnable{
	private Student s;
	public GetThread(Student s){
		this.s=s;
	}
	@Override
	public void run() {
		//Student s=new Student();
		//��֤��ͬһ���� ��ֱ���������new������s�� ��Ҫ������newһ����һ������
		//synchronized (new Object()) {
		while(true){
			synchronized (s) {
				System.out.println(s.getName()+"---"+s.getAge());
			}
		}
	}
}