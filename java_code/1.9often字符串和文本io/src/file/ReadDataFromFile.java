package file;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
public class ReadDataFromFile {
	public static void main(String[] args) throws Exception{
		java.io.File file=new java.io.File("scores.txt");
		
		Scanner input=new Scanner(file);
		
		while(input.hasNext()){
			String xing=input.next();
			String ming=input.next();
			int score=input.nextInt();
			System.out.println(xing+" "+ming+" : "+score);
		}
		input.close();
	}
}
