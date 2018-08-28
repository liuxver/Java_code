import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TextFieldAndLabelDemo extends RadioButtonDemo{
	private JTextField jtfMessage=new JTextField(10);
	
	public static void main(String[] args){
		TextFieldAndLabelDemo frame=new TextFieldAndLabelDemo();
		frame.pack();
		frame.setTitle("TextFieldAndLabelDemo:");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	
	
	public TextFieldAndLabelDemo(){
		JPanel jpTextField=new JPanel();
		jpTextField.setLayout(new BorderLayout(10,1000));
		
		//加入标签
		jpTextField.add(new JLabel("Enter a message:"), BorderLayout.WEST);
		
		//加入文本域
		jpTextField.add(jtfMessage, BorderLayout.CENTER);
		add(jpTextField,BorderLayout.NORTH);
		
		
		//控制字的方向
		jtfMessage.setHorizontalAlignment(JTextField.RIGHT);
		
		jtfMessage.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				messagePanel.setMessage(jtfMessage.getText());
				jtfMessage.requestFocusInWindow();
			}
		});
	}
	
	
}
