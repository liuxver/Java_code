
public class ShowCurrentTime {
	public static void main(String[] args){
		long totalMillSeconds=System.currentTimeMillis();
		
		long totalSeconds=totalMillSeconds/1000;
		
		long currentSeconds=totalSeconds%60;
		
		long totalMinutes=totalSeconds/60;
		
		long currentMinutes=totalMinutes%60;
		
		long totalHours=totalMinutes/60;
		
		long currentHours=totalHours%24;
		
		System.out.println("Current time is "+currentHours+":"+currentMinutes+":"+currentSeconds+" GMT");
	}
}
