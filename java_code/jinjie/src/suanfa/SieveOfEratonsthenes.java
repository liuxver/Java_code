package suanfa;
import java.util.Scanner;

public class SieveOfEratonsthenes {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("Find all prime number <=n,enter n:");
		int n=input.nextInt();
		
		boolean[] primes=new boolean[n+1];
		for(int i=0;i<primes.length;i++){
			primes[i]=true;
		}
		
		for(int k=2;k<=n;k++){
			if(primes[k]){
				for(int i=k;i<=n/k;i++){
					primes[k*i]=false;
				}
			}
		}
		
		int count=0;
		
		for(int i=2;i<primes.length;i++){
			if(primes[i]){
				count++;
				if(count%10==0)
					System.out.printf("%8d\n", i);
				else
					System.out.printf("%8d", i);
			}
		}
		
		System.out.println("\n"+count+" primes(s) less than or equal to "+n);
		
		
		
	}
}
