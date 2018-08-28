import javax.swing.*;
import java.awt.Font;
import java.awt.BorderLayout;

public class DisplayMessageApp extends JApplet {
	private String message="A default message";
	private int x=20;
	private int y=20;
	
	private boolean isStandalone=false;
	
	public void init(){
		if(!isStandalone){
			message=getParameter("MESSAGE");
			x=Integer.parseInt(getParameter("X"));
			y=Integer.parseInt(getParameter("Y"));
		}
		MessagePanel messagePanel=new MessagePanel(message);
		messagePanel.setFont(new Font("SansSerif",Font.BOLD,20));
		messagePanel.setXCoordinate(x);
		messagePanel.setYCoordinate(y);
		
		add(messagePanel);
	}
	
	public static void main(String[] args){
		JFrame frame=new JFrame("DisplayMessageApp");
		DisplayMessageApp applet=new DisplayMessageApp();
		
		applet.isStandalone=true;
		
		applet.getCommandLineParameters(args);
		
		frame.add(applet,BorderLayout.CENTER);
		
		applet.init();
		applet.start();
		
		frame.setSize(300, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
	
	
	
	private void getCommandLineParameters(String[] args){
		if(args.length!=3){
			System.out.println("Usage:java DisplayMessageApp x y message");
			System.exit(0);
		}
		else{
			x=Integer.parseInt(args[0]);
			y=Integer.parseInt(args[1]);
			message=args[2];
		}
	}
	
	
	
}
