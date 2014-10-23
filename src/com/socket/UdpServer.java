package com.socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UdpServer {

	/**
	 * @param args
	 * @throws SocketException 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DatagramSocket server=new DatagramSocket(9999);
		System.out.println("服务器启动");
		
		while(true)
		{
		byte[] b=new byte[1024];
		DatagramPacket p=new DatagramPacket(b, 0, b.length);
		server.receive(p);
		String instr=new String(p.getData(),0,p.getLength());
				System.out.println("接收到数据:"+instr);
		
				int port=p.getPort();
				InetAddress addr=p.getAddress();
				String s="服务器已经接收";
				p=new DatagramPacket(s.getBytes(), 0,s.getBytes().length,addr,port);
				server.send(p);
	}

}
}
