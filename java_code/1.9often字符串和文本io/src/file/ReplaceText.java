package file;
import java.io.*;
import java.util.*;
public class ReplaceText {
	public static void main(String[] args) throws Exception{
		if(args.length!=4){
			System.out.println("Usage:java ReplaceTxt sourceFile TargetFile olsStr newStr");
			System.exit(0);
		}
		
		File sourceFile=new File(args[0]);
		if(!sourceFile.exists()){
			System.out.println("SourceFile "+args[0]+" does not exist");
			System.exit(0);
		}
		
		File targetFile=new File(args[1]);
		if(targetFile.exists()){
			System.out.println("TargetFile "+args[1]+" does not exists");
		}
		
		//初始化源文件
		
		final int LENGTH=100;
		PrintWriter output1=new PrintWriter(sourceFile);
		for(int i=0;i<LENGTH;i++){
			char ch=RandomCharacter.getRandomLowerCaseLetter();
			output1.print(ch);
		}
		output1.close();
		
		//执行替代过程
		
		
		Scanner input=new Scanner(sourceFile);
		PrintWriter output=new PrintWriter(targetFile);
		
		while(input.hasNext()){
			String s1=input.nextLine();
			String s2=s1.replaceAll(args[2], args[3]);
			output.println(s2);
		}
		input.close();
		output.close();
		
	}
}
