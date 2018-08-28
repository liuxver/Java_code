import java.util.Scanner;
public class GuessNumber {
	public static void main(String[] args){
		int number=(int)(Math.random()*101);
		
		Scanner input=new Scanner(System.in);
		System.out.println("guess a number between 0 and 100 :");
		
		int guess=-1;
		while(guess!=number){
			System.out.print("\nenter you guess :");
			guess=input.nextInt();
			
			if(guess==number){
				System.out.println("yes ,the number is "+number);
			}else if(guess>number){
				System.out.println("you guess is too high !");
			}else{
				System.out.println("you guess is too low !");
			}
		}
	}
}
