import java.util.Scanner;
public class GuessBirthday {
	public static void main(String[] args){
		String s1=
				" 1    3    5   7\n"+" 9	11	13	15\n"+" 17	19	21	23\n"+" 25	27	29	31";
		String s2=
				" 2    3    6   7\n"+" 10	11	14	15\n"+" 18  19  22  23\n"+" 28  29  30  31";
		String s3=
				" 4    5    6   7\n"+" 12   13  14  15\n"+" 20  21  22  23\n"+" 28  29  30  31";
		String s4=
				" 8    9    10  11\n"+" 12   13  14  15\n"+" 24  25   26  27\n"+" 28  29  30  31";
		String s5=
				" 16   17   18  19\n"+" 20   21  22  23\n"+" 24  25   26  27\n"+" 28  29  30  31";
		
		int day=0;
		Scanner input=new Scanner(System.in);
		
		System.out.println("Is your birthday in s1 ?");
		System.out.println(s1);
		System.out.print("\n 0 for no and 1 for yes :");
		int answer=input.nextInt();
		if(answer==1){
			day+=1;
		}
		
		System.out.println("\n is your birthday in s2 ?");
		System.out.println(s2);
		System.out.print("\n 0 for no and 1 for yes :");
		answer=input.nextInt();
		if(answer==1){
			day+=2;
		}
		
		System.out.println("\n is your birthday in s3 ?");
		System.out.println(s3);
		System.out.print("\n 0 for no and 1 for yes :");
		answer=input.nextInt();
		if(answer==1){
			day+=4;
		}
		
		System.out.println("\n is your birthday in s4 ?");
		System.out.println(s4);
		System.out.print("\n 0 for no and 1 for yes :");
		answer=input.nextInt();
		if(answer==1){
			day+=8;
		}
		
		System.out.println("\n is your birthday in s5 ?");
		System.out.println(s5);
		System.out.print("\n 0 for no and 1 for yes :");
		answer=input.nextInt();
		if(answer==1){
			day+=16;
		}
		
		System.out.println("\n your birthday is "+day+" ! ");
	}
}
