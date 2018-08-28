
import java.util.*;
public class ReadDataFromFile {
	public static void main(String[] args) throws Exception{
		java.io.File file=new java.io.File("scores1.txt");
		
		Scanner input=new Scanner(file);
		
		while(input.hasNext()){
			String xing=input.next();
			String ming=input.next();
		//	String lastname=input.next();
			int score=input.nextInt();
			System.out.println(xing+" "+ming+" : "+score);
		}
		input.close();
	}
}
