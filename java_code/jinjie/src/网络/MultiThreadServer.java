package ����;

import java.io.*;
import java.net.*;
import java.util.*;
import java.awt.*;
import javax.swing.*;

public class MultiThreadServer extends JFrame {
	private JTextArea jta=new JTextArea();
	
	public static void main(String[] args){
		new MultiThreadServer();
	}
	
	public MultiThreadServer(){
		setLayout(new BorderLayout());
		add(new JScrollPane(jta),BorderLayout.CENTER);
		
		setTitle("MultiThreadServer");
		setSize(500,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		try{
			ServerSocket serverSocket=new ServerSocket(8000);
			jta.append("MultiThreadServer started at "+new Date()+" \n");
			
			int clientNo=1;
			
			while(true){
				Socket socket=serverSocket.accept();
				jta.append("Starting thread for client "+clientNo+" at "+new Date()+" \n");
				
				InetAddress inetAddress=socket.getInetAddress();
				
				jta.append("Client "+clientNo+" 's host name is "+inetAddress.getHostName()+"\n");
				jta.append("Client "+clientNo+" 's Address is "+inetAddress.getHostAddress()+" \n");
				
				HandleAClient task=new HandleAClient(socket);
				new Thread(task).start();
				
				clientNo++;
			}
			
		}catch(IOException ex){
			System.err.println(ex);
		}
	}
	
	class HandleAClient implements Runnable{
		private Socket socket;
		
		public HandleAClient(Socket socket){
			this.socket=socket;
		}
		
		public void run(){
			try{
				DataInputStream inputFromClient=new DataInputStream(socket.getInputStream());
				DataOutputStream outputToClient=new DataOutputStream(socket.getOutputStream());
				
				while(true){
					double radius=inputFromClient.readDouble();
					double area=radius*radius*Math.PI;
					
					outputToClient.writeDouble(area);
					
					jta.append("radius "+radius+" received from client: "+radius+'\n');
					jta.append("Area found: "+area+" \n");
				}
			}
			catch(IOException ex){
				System.err.println(ex);
			}
		}
		
		
	}
	
	
}




