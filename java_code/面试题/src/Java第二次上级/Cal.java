package Java第二次上级;
/**
*
*author:liuxv
*student_number:15130120185
*email:liuxver444@gmail.com
*email1:1369058574@qq.com
*/
import java.util.*;
public class Cal {
	public static void main(String[] args){
		//enum monthName{
		String[] monthName=new String[]{"January","February","March","April","May","June","July","August","September","October","November","December"};
		
		int month=Integer.parseInt(args[0]);
		int year=Integer.parseInt(args[1]);
		Calendar calendar=new GregorianCalendar();
		calendar.set(year,month-1, 1);
		int maxDay=calendar.getActualMaximum(Calendar.DATE);
		int firstDay=calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println(monthName[month-1]+" "+year);
		System.out.println("Su\t"+"Mo\t"+"Tu\t"+"We\t"+"Th\t"+"Fr\t"+"Sa\t");
		for(int i=1;i<firstDay;i++){
			System.out.print("\t");
		}
		
		for(int i=1;i<=maxDay;i++){
			System.out.print(i+"\t");
			if((i-(8-firstDay))%7==0){
				System.out.println();
			}
		}
		
	}
}
