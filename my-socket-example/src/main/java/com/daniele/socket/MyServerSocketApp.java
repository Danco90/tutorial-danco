package com.daniele.socket;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 
 * @author matteodaniele
 * @update 1/21/2018
 * @version 0.4.3
 */
@SpringBootApplication
public class MyServerSocketApp 
{
	private static final Logger log = LoggerFactory.getLogger(MyServerSocketApp.class);

	
    public static void main( String[] args ) throws IOException
    {
        ConfigurableApplicationContext context = SpringApplication.run(MyServerSocketApp.class, args);
    
        ServerSocket serverSocket = new ServerSocket(3333);
        Socket socket = serverSocket.accept();
        
        DataInputStream din = new DataInputStream(socket.getInputStream());
        DataOutputStream dout= new DataOutputStream(socket.getOutputStream());
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str="",str2="";
        while(!str.equals("stop")){
        	str=din.readUTF();
        	log.info("*****Client says : "+str);
        	System.out.println("*****Client says : "+str);
        	str=br.readLine();
            dout.writeUTF(str2);
            dout.flush();
;       }
        din.close();
        socket.close();
        serverSocket.close();
    }
}
