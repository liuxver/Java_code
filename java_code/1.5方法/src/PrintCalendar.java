import java.util.*;
public class PrintCalendar {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("enter full year :");
		int year=input.nextInt();
		
		System.out.print("enter mouth in number between 1 and 12: ");
		int mouth=input.nextInt();
		
		printMouth(year,mouth);
	}
	
	public static void printMouth(int year,int mouth){
		printMouthTitle(year,mouth);
		printMouthBody(year,mouth);
	}
	
	public static void printMouthTitle(int year,int mouth){
		System.out.println("       "+getMouthName(mouth)+"    "+year);
		System.out.println("-------------------------------------------------------");
		System.out.println(" Sun Mon Tue Wed Thu Fri Sat ");
		
	}
	
	public static String getMouthName(int mouth){
		String monthName=" ";
		switch(mouth){
		case 1:
			monthName="January";
			break;
		case 2:
			monthName="February";
			break;
		case 3:
			monthName="Match";
			break;
		case 4:
			monthName="April";
			break;
		case 5:
			monthName="May";
			break;
		case 6:
			monthName="June";
			break;
		case 7:
			monthName="July";
			break;
		case 8:
			monthName="August";
			break;
		case 9:
			monthName="September";
			break;
		case 10:
			monthName="October";
			break;
		case 11:
			monthName="November";
			break;
		case 12:
			monthName="December";
			break;
		}
		return monthName;
	}
	
	public static void printMouthBody(int year,int mouth){
		int startDay=getStartDay(year,mouth);
		int numberOfDaysInMonth=getNumberOfDaysInMouth(year,mouth);
		int i=0;
		for(i=0;i<startDay;i++)
			System.out.print("    ");
		for(i=1;i<=numberOfDaysInMonth;i++){
			System.out.printf("%4d",i);
			
			if((i+startDay)%7==0){
				System.out.println();
			}
		}
		System.out.println();
	}
	
	public static int getStartDay(int year,int mouth){
		final int START_DAY_FROM_JAN_1_1800=3;
		int totalNumberOfDays=getTotalNumberOfDays(year,mouth);
		return (totalNumberOfDays+START_DAY_FROM_JAN_1_1800)%7;
	}
	
	public static int getTotalNumberOfDays(int year,int mouth){
		int total=0;
		for(int i=1800;i<year;i++){
			if(isLeapYear(i))
				total+=366;
			else
				total+=365;
		}
		
		for(int i=1;i<mouth;i++)
			total+=getNumberOfDaysInMouth(year,i);
		
		return total;
	}
	
	public static int getNumberOfDaysInMouth(int year,int mouth){
		if(mouth==1||mouth==3||mouth==5||mouth==7||mouth==8||mouth==10||mouth==12)
			return 31;
		if(mouth==4||mouth==6||mouth==9||mouth==11)
			return 30;
		if(mouth==2)
			return isLeapYear(year)?29:28;
		return 0;
	}
	
	public static boolean isLeapYear(int year){
		return year%400==0||(year%4==0&&year%100!=0);
	}
}

