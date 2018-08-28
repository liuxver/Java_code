import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonDemo extends JFrame {
	protected MessagePanel messagePanel=new MessagePanel("welcome to liuxv");
	
	
	private JButton jbtLeft=new JButton("<=");
	private JButton jbtRight=new JButton("=>");
	
	
	public static void main(String[] args){
		ButtonDemo frame=new ButtonDemo();
		frame.setTitle("ButtonDemo");
		frame.setSize(250, 100);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	
	
	
	public ButtonDemo(){
		messagePanel.setBackground(Color.white);
		
		JPanel jpButtons=new JPanel();
		jpButtons.add(jbtLeft);
		jpButtons.add(jbtRight);
		
		
		//设置热键
		jbtLeft.setMnemonic('L');
		jbtRight.setMnemonic('R');
		
		
		//设置图标
		jbtLeft.setIcon(new ImageIcon("images/d.jpg"));
		jbtRight.setIcon(new ImageIcon("images/e.jpg"));
		
		//设置文本 
		jbtLeft.setText("left to xiao mengmnegmneg");
		jbtRight.setText("Right to xiaomengmeng");
		
		
		
		//设置鼠标移动上去的文本显示
		jbtLeft.setToolTipText("Move message to left.");
		jbtRight.setToolTipText("Move message to right.");
		
		setLayout(new BorderLayout());
		add(messagePanel,BorderLayout.CENTER);
		add(jpButtons,BorderLayout.SOUTH);
		
		
		jbtLeft.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				messagePanel.moveLeft();
			}
		});
		
		jbtRight.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				messagePanel.moveRight();
			}
		});
		
		
	}
	
	
	
	
}
