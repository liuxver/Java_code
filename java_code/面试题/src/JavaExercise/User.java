package JavaExercise;
/**
*
*author:liuxv
*student_number:15130120185
*email:liuxver444@gmail.com
*email1:1369058574@qq.com
*/
import java.util.*;
public class User {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your name:");
		String s=input.nextLine();
		System.out.println("Enter the begin balance:");
		double b=input.nextDouble();
		BankAccount account1=new BankAccount(s,b);
		System.out.println("1:��2��ȡ�3���鿴��¼��4���޸����֣�5���鿴�����˶����˻���0:�˳�");
		int n=input.nextInt();
		while(n!=0){
			switch(n){
			case 1:{
				System.out.println("Enter balance:");
				double balance=input.nextDouble();
				account1.deposit(balance);
				System.out.println("your balance is "+account1.getBalance());
				break;
			}
			case 2:{
				System.out.println("Enter balance:");
				double balance=input.nextDouble();
				account1.withdraw(balance);
				System.out.println("your balance is "+account1.getBalance());
				break;
			}
			case 3:{
				System.out.println("you history:"+account1.getHistory());
				break;
			}
			case 4:{
				System.out.println("Enter name:");
				
				String s1=input.nextLine();
				String name=input.nextLine();
				account1.setName(name);
				System.out.println("your name now is : "+account1.getName());
				break;
			}
			case 5:{
				System.out.println(BankAccount.num);
				break;
			}
			default:
				break;
			}
			System.out.println("1:��2��ȡ�3���鿴��¼��4���޸����֣�5���鿴�����˶����˻���0:�˳�");
		    n=input.nextInt();
			
		}
		System.out.println("Bye.");
	}
}
