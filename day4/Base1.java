public class Base1{
	private String pri_str="私有变量";
			String def_str="默认变量";
	protected String pro_str="protected变量";
	public String pub_str="public变量";
	
	private void pri_show(){
		System.out.println("私有方法");
	}
	
	void def_show(){
		System.out.println("默认方法");
	}
	protected void pri_show(){
		System.out.println("protected方法");
	}
	public void pri_show(){
		System.out.println("public 方法");
	}
}