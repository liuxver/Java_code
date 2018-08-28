import java.util.Scanner;

public class ComputeAreaWithConsoleInput {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		final double PI=3.14159;
		System.out.print("enter a number for radius:");
		double radius=input.nextDouble();
		
		double area=radius*radius*PI;
		
		System.out.println("the area for the circle of radius "+radius+" is "+area);
		
		/*String s=input.nextLine();
		System.out.println("the string is "+s);*/
		int value=2147483647+1;
		System.out.println(value);
	}
}
