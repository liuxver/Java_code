import java.math.*;
public class LargeFactorial {
	public static void main(String[] args){
		System.out.println("So! is\n"+factorial(50));
		
	}
	
	public static BigInteger factorial(long n){
		BigInteger result=BigInteger.ONE;
		for(int i=1;i<=n;i++){
			result=result.multiply(new BigInteger(i+""));
		}
		return result;
	}
}
