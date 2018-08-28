package suanfa;
import java.util.Scanner;
public class EfficientPrimeNumber {
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		System.out.print("Find all prime number <=n,enter n:");
		int n=input.nextInt();
		
		java.util.List<Integer> list=new java.util.ArrayList<Integer>();
		
		final int NUM_PER_LINE=10;
		int count=0;
		int number=2;
		int squareRoot=1;
		System.out.println("The prime number are :");
		while(number<=n){
			boolean isPrime=true;
			if(squareRoot*squareRoot<number)
				squareRoot++;
			
			for(int k=0;k<list.size()&&list.get(k)<=squareRoot;k++){
				if(number%list.get(k)==0){
					isPrime=false;
					break;
				}
			}
			
			if(isPrime){
				count++;
				list.add(number);
				if(count%NUM_PER_LINE==0){
					System.out.println();
					System.out.printf("%8d",number);
				}
				else
					System.out.printf("%8d",number);
			}
			number++;
			
		}
		
		System.out.println("\n"+count+" primer(s) less than or equare to "+n);
		
		
	}
}
