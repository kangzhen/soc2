package com.socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket c=new Socket("localhost",9999);
		DataInputStream din=new DataInputStream(c.getInputStream());//获取输入流
		final DataOutputStream dout=new DataOutputStream(c.getOutputStream());
		//dout.writeUTF("sss");
		final Scanner sc=new Scanner(System.in);
		new Thread(){
			public void run()
			{
				while(sc.hasNext())				//阻塞方法
				{
					String s=sc.next();
					try {
						dout.writeUTF(s);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					try {
						dout.flush();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
			}
			
		}.start();
		
		while(true){
			String serverMsg=din.readUTF();
			System.out.println(serverMsg);
		}
	}

}
