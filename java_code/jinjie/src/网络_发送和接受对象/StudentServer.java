package 网络_发送和接受对象;

import java.io.*;
import java.net.*;

public class StudentServer {
	private ObjectOutputStream outputToFile;
	private ObjectInputStream inputFromClient;
	
	public static void main(String[] args){
		new StudentServer();
		
	}
	
	public StudentServer(){
		try{
			ServerSocket serverSocket=new ServerSocket(8001);
			System.out.println("Server start :");
			
			outputToFile=new ObjectOutputStream(new FileOutputStream("student.dat",true));
			
			while(true){
				Socket socket=serverSocket.accept();
				
				inputFromClient=new ObjectInputStream(socket.getInputStream());
				
				Object object=inputFromClient.readObject();
				outputToFile.writeObject(object);
				System.out.println("A new Student object is stored.");
			}
		}
		catch(ClassNotFoundException ex){
			ex.printStackTrace();
		}
		catch(IOException ex){
			ex.printStackTrace();
		}
		finally{
			try{
				inputFromClient.close();
				outputToFile.close();
			}
			catch(Exception ex){
				ex.printStackTrace();
			}
		}
	}
	
	
}
