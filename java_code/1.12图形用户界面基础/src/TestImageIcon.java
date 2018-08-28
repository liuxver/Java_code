import javax.swing.*;
import java.awt.*;

public class TestImageIcon extends JFrame{
	private ImageIcon aIcon=new ImageIcon("img/a.jpg");
	private ImageIcon bIcon=new ImageIcon("img/b.gif");
	private ImageIcon cIcon=new ImageIcon("img/c.jpg");
	
	private ImageIcon a1Icon=new ImageIcon("../images/a.jpg");
	private ImageIcon b1Icon=new ImageIcon("../images/b.gif");
	private ImageIcon c1Icon=new ImageIcon("../images/c.jpg");
	
	public TestImageIcon(){
		setLayout(new GridLayout(2,3,5,5));
		add(new JLabel(aIcon));
		add(new JLabel(bIcon));
		add(new JLabel(cIcon));
		add(new JButton(a1Icon));
		add(new JButton(b1Icon));
		add(new JButton(c1Icon));
		
	}
	
	public static void main(String[] args){
		TestImageIcon frame=new TestImageIcon();
		frame.setTitle("Test ImageIcon");
		frame.setSize(400,800);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
}
