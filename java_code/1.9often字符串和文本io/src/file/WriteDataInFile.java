package file;
import java.io.FileNotFoundException;

public class WriteDataInFile {
	public static void main(String[] args) throws Exception{
		java.io.File file=new java.io.File("scores2.txt");
		if(file.exists()){
			System.out.println("File already exists.");
			System.exit(0);
		}
		
		/*这是一种方法
		 * 
		 * java.io.PrintWriter output = null;
		try {
			output = new java.io.PrintWriter(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		java.io.PrintWriter output=new java.io.PrintWriter("love.txt");
		
		output.print("liu xv ");
		output.println(100);
		output.print("chen mei ");
		output.println(100);
		
		output.close();
	}
}
