public interface Wifi{
	String ssid="java_wifi";//初始化 因为是全局常量
	String pass="oracle123";
	
	void open();
	void close();
}