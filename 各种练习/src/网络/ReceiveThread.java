package 网络;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveThread implements Runnable {
	private DatagramSocket ds;
	public ReceiveThread(DatagramSocket ds){
		this.ds=ds;
	}
	
	@Override
	public void run() {
		try{
			while (true) {
				//创建数据包
				byte[] bys=new byte[1024];
				DatagramPacket dp=new DatagramPacket(bys, bys.length);
				
				//接受数据
				ds.receive(dp);
				
				//解析数据
				String ip=dp.getAddress().getHostAddress();
				String data=new String(dp.getData(),0,dp.getLength());
				System.out.println("from"+ip+"data is"+data);
			}
		}catch(IOException e){
			e.printStackTrace();
		}

	}

}
