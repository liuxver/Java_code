import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
public class ClockAnimation extends JFrame {
	private StillClock clock=new StillClock();
	
	
	
	
	public ClockAnimation(){
		
		MessagePanel message=new MessagePanel(clock.getHour()+" : "+clock.getMinute()+" : "+clock.getSecond());
		message.setForeground(Color.red);
		message.setCentered(true);
		
		add(clock);
		add(message,BorderLayout.SOUTH);
		Timer timer=new Timer(1000,new TimerListener());
		timer.start();
	}
	
	private class TimerListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			clock.setCurrentTime();
			clock.repaint();
		}
	}
	
	public static void main(String[] args){
		ClockAnimation frame=new ClockAnimation();
		frame.setSize(300, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("ClockAnimation");
		frame.setVisible(true);
		
	}
	
	
}
