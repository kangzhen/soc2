package com.socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class server {

	 public static void main(String[] args) throws IOException {
	
			ServerSocket server=new ServerSocket(9999);//建立服务
			System.out.println("服务器已启动");
			Socket s=server.accept();	//等待客户端链接
			DataInputStream din=new DataInputStream(s.getInputStream());//获取输入流
			DataOutputStream dout=new DataOutputStream(s.getOutputStream());
			
		while(true)
		{
			String cMsg=din.readUTF();
			System.out.println(cMsg);
			dout.writeUTF("已经收到消息");//输出到客户端
			
			
		}
	}
		
		
}

