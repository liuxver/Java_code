package Javaøº ‘;

import java.io.*;
//import java.io.InputStreamReader;
import java.net.*;

/**
*
*author:liuxv
*student_number:15130120185
*email:liuxver444@gmail.com
*email1:1369058574@qq.com
*/
public class Client {

	public static void main(String[] args) throws Exception{
		BufferedReader inFromUser=new BufferedReader(new InputStreamReader(System.in));
		Socket client=new Socket("localhost",6789);
		
		DataOutputStream outToServer=new DataOutputStream(client.getOutputStream());
		
		BufferedReader inFromServer=new BufferedReader(new InputStreamReader(client.getInputStream()));
		
		String sentence=inFromUser.readLine();
		
		outToServer.writeBytes(sentence+"\n");
		
		String returnSentence=inFromServer.readLine();
		
		System.out.println("From Server: "+returnSentence);
		
		client.close();
	}
}
