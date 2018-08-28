import java.util.Scanner;
public class AddNumberr_SentinelValue {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		
		System.out.print("enter an int value (the program exists if the input is 0 ):");
		int data=input.nextInt();
		
		int sum=0;
		while(data!=0){
			sum+=data;
			System.out.print("enter an int value (the program exists if the input is 0 ):");
			data=input.nextInt();
		}
		System.out.println("the sum is "+sum);
	}
}
