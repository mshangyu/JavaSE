package 网络;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendThread implements Runnable {
	private DatagramSocket ds;
	public SendThread(DatagramSocket ds){
		this.ds=ds;
	}
	
	@Override
	public void run() {
		try{
		//键盘封装录入
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String line=null;
		while ((line=br.readLine())!=null) {
			if ("886".equals(line)) {
				break;
			}
			//创建数据包
			byte[] bys=line.getBytes();
			DatagramPacket dp=new DatagramPacket(bys, bys.length,InetAddress.getByName("192.168.32.255"),11111);
			//发送数据
			ds.send(dp);
		}
		//释放资源
		ds.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
