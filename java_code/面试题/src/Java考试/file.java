package Javaøº ‘;
/**
*
*author:liuxv
*student_number:15130120185
*email:liuxver444@gmail.com
*email1:1369058574@qq.com
*/
import java.io.*;
public class file {
	public static void main(String[] args) throws IOException{
		BufferedReader in=new BufferedReader(new FileReader("in.txt"));
		
		String s;
		StringBuilder sb=new StringBuilder();
		int n=0;
		while((s=in.readLine())!=null){
			sb.append("line "+n+"="+s+"\n");
		}
		in.close();
		
		
		PrintWriter p=new PrintWriter(new FileWriter("out.txt"));
		p.println(sb);
		
		p.close();
		
	}
}
