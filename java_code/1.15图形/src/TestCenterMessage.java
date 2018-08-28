import javax.swing.*;
import java.awt.*;
public class TestCenterMessage extends JFrame{
	public TestCenterMessage(){
		CenterMessage messagePanel=new CenterMessage();
		add(messagePanel);
		messagePanel.setBackground(Color.red);
		messagePanel.setFont(new Font("Californian F8",Font.BOLD,30));
		
	}
	
	public static void main(String[] args){
		TestCenterMessage frame=new TestCenterMessage();
		frame.setSize(300, 150);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
}

class CenterMessage extends JPanel{
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		
		FontMetrics fm=g.getFontMetrics();
		
		int stringWidth=fm.stringWidth("Welcome to liuxv");
		int stringAscent=fm.getAscent();
		
		//int xCoodinate=getWidth()/2-stringWidth/2;
		//int yCoodinate=getHeight()/2+stringAscent/2;
		
		int xCoodinate=50;
		int yCoodinate=30;
		
		g.drawString("welcome to liuxv", xCoodinate, yCoodinate);
		
		
	}
}