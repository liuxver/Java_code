import java.awt.*;
import javax.swing.*;

public class TestMessagePanel extends JFrame {
	public TestMessagePanel(){
		MessagePanel messagePanel1=new MessagePanel("Welcome to liuxv");
		MessagePanel messagePanel2=new MessagePanel("Liuxv is very handsome");
		MessagePanel messagePanel3=new MessagePanel("you must like him.");
		MessagePanel messagePanel4=new MessagePanel("must't you? xiaomengmeng.");
		
		messagePanel1.setFont(new Font("SansSerif",Font.ITALIC,20));
		messagePanel2.setFont(new Font("Courier",Font.BOLD,20));
		messagePanel3.setFont(new Font("Times",Font.ITALIC,20));
		messagePanel4.setFont(new Font("Californian FB",Font.PLAIN,20));
		
		messagePanel1.setBackground(Color.red);
		messagePanel2.setBackground(Color.cyan);
		messagePanel3.setBackground(Color.GREEN);
		messagePanel4.setBackground(Color.blue);
		
		messagePanel1.setCentered(true);
		
		setLayout(new GridLayout(2,2));
		add(messagePanel1);
		add(messagePanel2);
		add(messagePanel3);
		add(messagePanel4);
		
		
		//messagePanel2.setXCoordinate(100);
		
		
		
		
	}
	
	public static void main(String[] args){
		TestMessagePanel frame=new TestMessagePanel();
		frame.setSize(300, 200);
		frame.setTitle("TestMessagePanel");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	
}
