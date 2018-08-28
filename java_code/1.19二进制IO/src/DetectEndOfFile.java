import java.io.*;
public class DetectEndOfFile {
	public static void main(String[] args){
		try{
			DataOutputStream output=new DataOutputStream(new FileOutputStream("test.dat"));
			output.writeDouble(4.5);
			output.writeDouble(52.0);
			output.writeDouble(52.1);
			output.close();
			
			DataInputStream input=new DataInputStream(new FileInputStream("test.dat"));
			while(true){
				System.out.println(input.readDouble());
			}
		}
		catch(EOFException ex){
			System.out.println("All data read.");
		}
		catch(IOException ex){
			ex.printStackTrace();
		}
	}
}
