import java.util.Scanner;

public class DisplayTime {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		
		System.out.print("enter a integer for seconds:");
		int seconds=input.nextInt();
		
		int minutes=seconds/60;
		int remainingSeconds=seconds%60;
		int hours=minutes/60;
		minutes=minutes%60;
		
		System.out.println(seconds+" seconds is "+hours+" hours "+minutes+" minutes "+remainingSeconds+
				"seconds");
		
		System.out.println(1.0-0.9);
		System.out.println(0xffff);
	}
}
