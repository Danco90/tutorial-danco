package com.daniele.socket.client;

import java.io.DataOutputStream;
import java.net.Socket;

/**
 * 
 * @author matteodaniele
 * @update 1/21/2018
 * @version 0.3.3
 */
public class MyClientSocketApp {

	public static void main(String[] args) {
		try{
			Socket s = new Socket("localhost", 3333);
			DataOutputStream dout = new DataOutputStream(s.getOutputStream());
			dout.writeUTF("Hello Server");
			dout.flush();
			dout.close();
			s.close();
		}catch(Exception e){
			System.out.println(e);
		}
	}
	

	
}
