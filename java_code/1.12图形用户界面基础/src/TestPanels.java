import java.awt.*;
import javax.swing.*;
public class TestPanels extends JFrame{
	public TestPanels(){
		JPanel p1=new JPanel();
		p1.setLayout(new GridLayout(4,3));
		
		for(int i=1;i<=9;i++){
			Font font1=new Font("SansSerif",Font.BOLD,16);
			
			JButton jbt=new JButton(""+i);
			Color color=new Color(128,100,50);
			jbt.setBackground(Color.RED);
			jbt.setForeground(Color.YELLOW);
			jbt.setFont(font1);
			p1.add(jbt);
		}
		
		p1.add(new JButton(""+0));
		p1.add(new JButton("start"));
		p1.add(new JButton("Stop"));
		
		JPanel p2=new JPanel(new BorderLayout());
		p2.add(new JTextField("Time to be displayed here."), BorderLayout.NORTH);
		p2.add(p1,BorderLayout.CENTER);
		
		// setLayout 方法是在 java.awt.Container 中定义的 
		add(p2,BorderLayout.EAST);
		add(new JButton("Food to be display here"),BorderLayout.CENTER);
	}
	public static void main(String[] args){
		TestPanels frame=new TestPanels();
		frame.setTitle("The front view of a Microwave Oven");
		frame.setSize(400, 250);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
}
