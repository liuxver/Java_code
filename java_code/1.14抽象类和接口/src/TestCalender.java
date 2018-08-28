import java.util.*;
public class TestCalender {
	public static void main(String[] args){
		Calendar calendar=new GregorianCalendar();
		
		System.out.println("Current time is "+new Date());
		System.out.println("YEAR:\t"+calendar.get(calendar.YEAR));
		System.out.println("MOUTH:\t"+calendar.get(calendar.MONTH));
		System.out.println("DATE:\t"+calendar.get(calendar.DATE));
		System.out.println("HOUR:\t"+calendar.get(calendar.HOUR));
		System.out.println("HOR_OF_DAY:\t"+calendar.get(calendar.HOUR_OF_DAY));
		System.out.println("MINUTE:\t"+calendar.get(calendar.MINUTE));
		System.out.println("SECOND:\t"+calendar.get(calendar.SECOND));
		System.out.println("DAY_OF_WEEK:\t"+calendar.get(calendar.DAY_OF_WEEK));
		System.out.println("DAY_OF_MOUTH:\t"+calendar.get(calendar.DAY_OF_MONTH));
		System.out.println("DAY_OF_YEAR:\t"+calendar.get(calendar.DAY_OF_YEAR));
		System.out.println("WEEK_OF_MOUTH:\t"+calendar.get(calendar.WEEK_OF_MONTH));
		System.out.println("WEEK_OF_YEAR:\t"+calendar.get(calendar.WEEK_OF_YEAR));
		System.out.println("AM_PM:\t"+calendar.get(calendar.AM_PM));
	}
}
