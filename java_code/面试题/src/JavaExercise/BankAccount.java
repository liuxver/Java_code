package JavaExercise;


/**
*
*author:liuxv
*student_number:15130120185
*email:liuxver444@gmail.com
*email1:1369058574@qq.com
*/
public class BankAccount {
	static int num=0;
	private String name;
	private double balance;
	
	private Queue history=new Queue();
	
	
	public BankAccount(String name,double balance){
		this.name=name;
		this.balance=balance;
		num++;
		String s=new String("+"+balance+"\n");
		history.add(s);
	}
	
	
	
	public void deposit(double n){
		balance+=n;
		String s=new String("+"+n+"\n");
		history.add(s);
	}
	
	public void withdraw(double n){
		if(n>balance){
			System.out.println("You have no enough money.");
			
			return;
		}
		balance-=n;
		String s=new String("-"+n+"\n");
		history.add(s);
	}
	
	
	public void setName(String s){
		this.name=s;
	}
	
	public String getName(){
		return this.name;
	}
	
	
	
	public double getBalance(){
		return this.balance;
	}
	
	
	public String getHistory(){
		String s="";
		for(int i=0;i<history.getSize();i++){
			s+=history.get(i);
		}
		return s;
	}
	
	
	
	
	
	
	
	
	
	
	
}
