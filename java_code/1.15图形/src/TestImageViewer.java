import java.awt.*;
import javax.swing.*;

public class TestImageViewer extends JFrame {
	public TestImageViewer(){
		Image image1=new ImageIcon("../images/a.jpg").getImage();
		Image image2=new ImageIcon("images/a.jpg").getImage();
		Image image3=new ImageIcon("../images/b.gif").getImage();
		Image image4=new ImageIcon("../images/c.jpg").getImage();
		
		
		setLayout(new GridLayout(2,0,5,5));
		
		add(new ImageViewer(image1));
		add(new ImageViewer(image2));
		add(new ImageViewer(image3));
		add(new ImageViewer(image4));
		
		
		
		
		
		
	}
	
	public static void main(String[] args){
		TestImageViewer frame=new TestImageViewer();
		frame.setTitle("TestImageViewer");
		frame.setSize(400, 400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	
	
	
	
}
