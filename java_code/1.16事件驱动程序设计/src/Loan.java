
public class Loan {
	private double annualInterestRate;
	private int numberOfYears;
	private double loanAmount;
	private java.util.Date loanDate;
	
	public Loan(){
		this(2.5,1,1000);
	}
	
	public Loan(double annualInterestRate,int numberOfYears,double loanAmount){
		this.annualInterestRate=annualInterestRate;
		this.numberOfYears=numberOfYears;
		this.loanAmount=loanAmount;
		loanDate=new java.util.Date();
	}
	
	public double getAnnualInterestRate(){
		return annualInterestRate;
	}
	
	public void setAnnualInterestRate(double annualInterestRate){
		this.annualInterestRate=annualInterestRate;
	}
	
	public int getNumberOfYears(){
		return numberOfYears;
	}
	
	public void setNumberOfYears(int numberOfYears){
		this.numberOfYears=numberOfYears;
	}
	
	public double getLoanAmount(){
		return loanAmount;
	}
	
	public void setLoanAmount(double loanAmount){
		this.loanAmount=loanAmount;
	}
	
	public double getMouthlyPayment(){
		double mouthlyInterestRate=annualInterestRate/1200;
		double mouthlyPayment=loanAmount*mouthlyInterestRate/(1-(Math.pow(1/(1+mouthlyInterestRate), numberOfYears*12)));
		return mouthlyPayment;
	}
	
	public double getTotalPayment(){
		double totalPayment=getMouthlyPayment()*numberOfYears*12;
		return totalPayment;
	}
	
	public java.util.Date getLoanDate(){
		return loanDate;
	}
	
}
