import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class excerise_ControlStillClock extends JFrame{
	private StillClock clock=new StillClock(0,0,0);
	private JButton jbtStart=new JButton("Start");
	private JButton jbtStop=new JButton("Stop");
	
	static int number=0;
	
	MessagePanel messagePanel=new MessagePanel(clock.getHour()+" : "+clock.getMinute()+" : "+clock.getSecond());
	
	public excerise_ControlStillClock(){
		
		JPanel panel1=new JPanel();
		panel1.add(jbtStart);
		panel1.add(jbtStop);
		//panel1.add(message, BorderLayout.SOUTH);
		
		this.add(clock, BorderLayout.CENTER);
		this.add(panel1,BorderLayout.SOUTH);
		this.add(messagePanel,BorderLayout.NORTH);
		
		messagePanel.setCentered(true);
		
		
		
		Timer timer=new Timer(1000,new TimerListener());
		//timer.start();
		jbtStart.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				timer.start();
				
			}
		});
		jbtStop.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				timer.stop();
				
			}
		});
		
	}
	
	
	private class TimerListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			number++;
			clock.setTime(number);
			clock.repaint();
			messagePanel.setMessage(clock.getHour()+" : "+clock.getMinute()+" : "+clock.getSecond());;
			//System.out.println(number);
			//System.out.println(messagePanel.getMessage());
		
		}
	}
	
	public static void main(String[] args){
		excerise_ControlStillClock frame=new excerise_ControlStillClock();
		frame.setSize(300, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("excerise_ControlStillClock");
		frame.setVisible(true);
		
	}
	
	
}
















