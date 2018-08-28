import java.util.Scanner;
public class GetStringFromConsole {
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	
	String s1=input.next();
	String s2=input.next();
	
	Scanner input1=new Scanner(System.in);
	
	String s3=input1.nextLine();
	System.out.println("s1 is "+s1);
	System.out.println("s2 is "+s2);
	System.out.println("the string entered is "+s3);
	//System.out.println("s1 is "+s1);
	
	}
}
