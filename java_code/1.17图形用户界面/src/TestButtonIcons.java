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
		
		//Ĭ��ͼ��
		JButton jbt=new JButton("Click it",usIcon);

		//����ͼ��
		jbt.setPressedIcon(pressIcon);
		
		
		//��תͼ��
		jbt.setRolloverIcon(rolloverIcon);
		
		add(jbt);
		
		
		
	}
	
	
}
