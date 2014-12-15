
public class Runtime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//获取java程序关联的运行时对象
		Runtime rt=Runtime.getRuntime();
		System.out.println("处理器数量 ："+rt.availableProcessors());
	}

}
