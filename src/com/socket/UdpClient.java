package com.socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

import java.net.InetSocketAddress;
import java.net.SocketException;
import java.util.Scanner;

public class UdpClient {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
			DatagramSocket c=new DatagramSocket();
			Scanner sc=new Scanner(System.in);
			DatagramPacket p=null;
			while(sc.hasNext())
			{
				String s=sc.next();
				int port=9999;
				InetAddress address=InetAddress.getByName("127.0.0.1");
				p=new DatagramPacket(s.getBytes(), s.length(), address, port);
				c.send(p);
				 
				byte[] b=new byte[2048];
				p=new DatagramPacket(b, b.length);
				c.receive(p);
				String recStr=new String(p.getData(),0,p.getLength());
				System.out.println(recStr);

				}
			
			
	}

}
