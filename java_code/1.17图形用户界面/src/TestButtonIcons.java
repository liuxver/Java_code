import javax.swing.*;

public class TestButtonIcons extends JFrame {
	public static void main(String[] args){
		JFrame frame=new TestButtonIcons();
		frame.setTitle("Button Icons ");
		frame.setSize(400, 800);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public TestButtonIcons(){
		ImageIcon usIcon=new ImageIcon("images/a.jpg");
		ImageIcon pressIcon=new ImageIcon("images/b.gif");
		ImageIcon rolloverIcon=new ImageIcon("images/c.jpg");
		
		//默认图标
		JButton jbt=new JButton("Click it",usIcon);

		//按下图标
		jbt.setPressedIcon(pressIcon);
		
		
		//翻转图标
		jbt.setRolloverIcon(rolloverIcon);
		
		add(jbt);
		
		
		
	}
	
	
}
