package ����;

import java.net.DatagramSocket;
import java.net.SocketException;

//���̸߳Ľ�����
public class ChatRoom {
	public static void main(String[] args) throws SocketException {
		DatagramSocket dsSend=new DatagramSocket();
		DatagramSocket dsReceive=new DatagramSocket(11111);
		
		SendThread st=new SendThread(dsSend);
		ReceiveThread rt=new ReceiveThread(dsReceive);
		
		Thread t1=new Thread(st);
		Thread t2=new Thread(rt);
		
		t1.start();
		t2.start();
		

	}

}
