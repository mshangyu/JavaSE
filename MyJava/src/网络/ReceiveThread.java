package ����;

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
				//�������ݰ�
				byte[] bys=new byte[1024];
				DatagramPacket dp=new DatagramPacket(bys, bys.length);
				
				//��������
				ds.receive(dp);
				
				//��������
				String ip=dp.getAddress().getHostAddress();
				String data=new String(dp.getData(),0,dp.getLength());
				System.out.println("from"+ip+"data is"+data);
			}
		}catch(IOException e){
			e.printStackTrace();
		}

	}

}
