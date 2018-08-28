package JavaExercise;

import java.util.Scanner;

/**
*
*author:liuxv
*student_number:15130120185
*email:liuxver444@gmail.com
*email1:1369058574@qq.com
*/
public class userCheckingAccount {
	public static void main(String[] args) throws IllegalArgumentException{
		Scanner input=new Scanner(System.in);
		String s = "";
		double b=0;
		try{
			System.out.println("Enter your name:");
			s=input.nextLine();
			System.out.println("Enter the begin balance:");
			b=input.nextDouble();
		}
		catch(Exception ex){
			System.out.println("ERROR:You enter a bad argument.");
			ex.printStackTrace();
		}
		
		CheckingAccount account1=new CheckingAccount(s,b);
		int n=0;
		try{
			System.out.println("1:存款，2：取款，3：查看记录，4：修改名字：5：查看创建了多少账户：0:退出");
			n=input.nextInt();
		}
		catch(Exception ex){
			System.out.println("ERROR:enter a number，ok?");
			ex.printStackTrace();
		}
		finally{
			n=input.nextInt();
		}
		while(n!=0){
			switch(n){
			case 1:{
				try{
					System.out.println("Enter balance:");
					double balance=input.nextDouble();
					account1.deposit(balance);
					System.out.println("your balance is "+account1.getBalance());
				}
				catch(Exception ex){
					System.out.println("ERROR:you enter a bad balance!");
				}
				
				break;
			}
			case 2:{
				try{
					System.out.println("Enter balance:");
					double balance=input.nextDouble();
					account1.withdraw(balance);
					System.out.println("your balance is "+account1.getBalance());
				}
				catch(Exception ex){
					System.out.println("ERROR:you enter a bad balance.");
				}
				
				break;
			}
			case 3:{
				System.out.println("you history:"+account1.getHistory());
				break;
			}
			case 4:{
				try{
					System.out.println("Enter name:");
					
					String s1=input.nextLine();
					String name=input.nextLine();
					account1.setName(name);
					System.out.println("your name now is : "+account1.getName());
				}
				catch(Exception ex){
					System.out.println("ERROR:you enter a bad balance.");
				}
				
				break;
			}
			case 5:{
				System.out.println(BankAccount.num);
				break;
			}
			default:
				break;
			}
			
			try{
				System.out.println("1:存款，2：取款，3：查看记录，4：修改名字：5：查看创建了多少账户：0:退出");
				n=input.nextInt();
			}
			catch(Exception ex){
				System.out.println("ERROR:enter a number，ok?");
				ex.printStackTrace();
			}
			finally{
				n=input.nextInt();
			}
			
			
		}
		System.out.println("Bye.");
	}
}
