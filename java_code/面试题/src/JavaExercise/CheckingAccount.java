package JavaExercise;
/**
*
*author:liuxv
*student_number:15130120185
*email:liuxver444@gmail.com
*email1:1369058574@qq.com
*/
public class CheckingAccount {
	static int num=0;
	private String name;
	private double balance;
	
	private Queue history=new Queue();
	
	
	public CheckingAccount(String name,double balance){
		this.name=name;
		this.balance=balance;
		num++;
		String s=new String("+"+balance+"\n");
		history.add(s);
	}
	
	
	
	public void deposit(double n) throws IllegalArgumentException{
		try{
			balance+=n;
			String s=new String("+"+n+"\n");
			history.add(s);
		}
		catch(Exception ex){
			System.out.println("输入参数不对！");
			ex.printStackTrace();
		}
	}
	
	public void withdraw(double n) throws IllegalArgumentException{
		try{
			if(n>balance){
				System.out.println("You have no enough money.");
			
				return;
			}
			balance-=n;
			String s=new String("-"+n+"\n");
			history.add(s);
		}
		catch(Exception ex){
			System.out.println("输入参数不对！");
			ex.printStackTrace();
		}
		
	}
	
	
	public void setName(String s) throws IllegalArgumentException{
		try{
			this.name=s;
		}
		catch(Exception ex){
			System.out.println("输入的不是字符串！");
			ex.printStackTrace();
		}
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
