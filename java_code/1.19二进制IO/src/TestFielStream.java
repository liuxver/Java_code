import java.io.*;
public class TestFielStream {
	public static void main(String[] args) throws IOException{
		FileOutputStream output=new FileOutputStream("temp.dat");
		
		for(int i=0;i<=10;i++){
			output.write(i);
		}
		
		output.close();
		
		FileInputStream input=new FileInputStream("temp.dat");
		int value;
		while((value=input.read())!=-1){
			System.out.println(value+" ");
		}
		
		input.close();
	}
}
