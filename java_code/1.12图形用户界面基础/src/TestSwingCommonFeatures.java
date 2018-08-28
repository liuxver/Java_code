import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class TestSwingCommonFeatures extends JFrame{
	public TestSwingCommonFeatures(){
		JPanel p1=new JPanel(new FlowLayout(FlowLayout.LEFT,2,2));
		JButton jbtLeft=new JButton("left");
		JButton jbtCenter=new JButton("center");
		JButton jbtRight=new JButton("right");
		
		jbtLeft.setBackground(Color.white);
		jbtCenter.setForeground(Color.GREEN);
		jbtRight.setToolTipText("This is the right button");
		
		//jbtLeft.setVisible(false);
		
		p1.add(jbtRight);
		p1.add(jbtCenter);
		p1.add(jbtLeft);
		
		p1.setBorder(new TitledBorder("Three Buttons."));
		
		
		Font largeFont=new Font("TimesRoman",Font.BOLD,20);
		Border lineBorder=new LineBorder(Color.BLACK,2);
		
		JPanel p2=new JPanel(new GridLayout(1,2,5,5));
		JLabel jlblRed=new JLabel("red");
		JLabel jlblOrange=new JLabel("Orange");
		
		jlblRed.setForeground(Color.RED);
		jlblOrange.setForeground(Color.orange);
		jlblRed.setFont(largeFont);
		jlblOrange.setFont(largeFont);
		jlblRed.setBorder(lineBorder);
		jlblOrange.setBorder(lineBorder);
		
		
		
		p2.add(jlblRed);
		p2.add(jlblOrange);
		p2.setBorder(new TitledBorder("Tow Labels"));
		setLayout(new GridLayout(2,1,5,5));
		
		add(p1);
		add(p2);
	}
	public static void main(String[] args){
		JFrame frame=new TestSwingCommonFeatures();
		frame.setTitle("Test Swing Common Features:");
		frame.setSize(300, 150);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
