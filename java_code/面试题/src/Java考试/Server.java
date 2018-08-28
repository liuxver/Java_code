package Javaøº ‘;
/**
*
*author:liuxv
*student_number:15130120185
*email:liuxver444@gmail.com
*email1:1369058574@qq.com
*/

import java.io.*;
import java.net.*;
public class Server  {
	public static void main(String[] args) throws Exception{
		ServerSocket server=new ServerSocket(6789);
	
		while(true){
			Socket connectionSocket=server.accept();
			BufferedReader inFromClient=new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
		
			DataOutputStream outToClient=new DataOutputStream(connectionSocket.getOutputStream());
		
			String s=inFromClient.readLine();
			String s1=s.toUpperCase()+"\n";
			outToClient.writeBytes(s1);
		}
	}
	
}
