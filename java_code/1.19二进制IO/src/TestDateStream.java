import java.io.*;
public class TestDateStream {
    public static void main(String[] args) throws IOException{
    	DataOutputStream output=new DataOutputStream(new FileOutputStream("temp1.dat"));
    	output.writeUTF("liuxv");
    	output.writeDouble(100.0);
    	output.writeUTF("wuyue");
    	output.writeDouble(101.1);
    	output.close();
    	
    	DataInputStream input=new DataInputStream(new FileInputStream("temp1.dat"));
    	
    	System.out.println(input.readUTF()+" "+input.readDouble());
    	System.out.println(input.readUTF()+" "+input.readDouble());
    	
    }
}
