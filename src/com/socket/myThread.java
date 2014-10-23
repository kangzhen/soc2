package com.socket;

public class myThread implements Runnable {

	public void run() {
		while(true){
			
			System.out.println("my Thread");   // TODO Auto-generated method stub
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t=new Thread(new myThread());
		t.start();
		while(true){
			System.out.println("main Thread");
		}
	}

}
