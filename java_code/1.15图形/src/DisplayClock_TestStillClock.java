import java.awt.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.*;
public class DisplayClock_TestStillClock extends JFrame {
	static int secondOld;
	public DisplayClock_TestStillClock(){
		StillClock clock=new StillClock();
		secondOld=clock.getSecond();
		MessagePanel messagePanel=new MessagePanel(clock.getHour()+" : "+clock.getMinute()+" : "+clock.getSecond());
		messagePanel.setCentered(true);
		messagePanel.setForeground(Color.blue);
		messagePanel.setFont(new Font("Courier",Font.BOLD,16));
		
		add(clock);
		add(messagePanel,BorderLayout.SOUTH);
		
		
	}
	
	public static void main(String[] args){
		
		DisplayClock_TestStillClock frame=new DisplayClock_TestStillClock();
		frame.setTitle("DisplayClock");
		frame.setSize(300,300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		while(true){
        Calendar calendar=new GregorianCalendar();
		
		int second=calendar.get(Calendar.SECOND);
		if(second!=secondOld){
			DisplayClock_TestStillClock frame1=new DisplayClock_TestStillClock();
			frame1.setTitle("DisplayClock");
			frame1.setSize(300,300);
			frame1.setLocationRelativeTo(null);
			frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame1.setVisible(true);
			System.gc();
		}
		}
		
		
       
		
        
		
	}
	
	
}
