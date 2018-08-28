import java.util.Scanner;
public class ComputeLoan {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		
		System.out.print("enter yearly interset rate,for example 5.20 :");
		double annualInterestRate=input.nextDouble();
		
		double mouthlyInterestRate=annualInterestRate/1200;
		
		System.out.print("enter number of years as an integer,for example 5 :");
		int numberOfYears=input.nextInt();
		
		System.out.print("enter loan amount,for example 120000.05 :");
		double loanAmount=input.nextDouble();
		
		System.out.println(annualInterestRate);
		System.out.println(mouthlyInterestRate);
		System.out.println(numberOfYears);
		System.out.println(loanAmount);
		
		double mouthlyPayment=loanAmount*mouthlyInterestRate/(1-1/Math.pow(1+mouthlyInterestRate, numberOfYears*12));
		double totalPayment=mouthlyPayment*numberOfYears*12;
		
		System.out.println("the mouthly payment is "+(int)(mouthlyPayment*100)/100.0);
		System.out.println("the total payment is "+(int)(totalPayment*100)/100.0);
		double m=250000*0.4791666666666/(1-1/Math.pow(1+0.479166666666666, 15*12));
		System.out.println(m);
	}
}
