import java.util.Scanner;
import java.io.*;
public class FileNotFoundExceptionDemo {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a file name: ");
		String fileName=input.nextLine();
		
		try{
			Scanner inputFromFile=new Scanner(new File(fileName));
			System.out.println("File "+fileName+" exists.");
		}
		catch(FileNotFoundException ex){
			System.out.println("Exception: "+fileName+" not found.");
		}
	}
}
