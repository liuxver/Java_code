import java.awt.*;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.*;

public class TextAreaDemo extends JFrame {
	private DescriptionPanel descriptionPanel=new DescriptionPanel();
	
	
	public static void main(String[] args) throws FileNotFoundException{
		TextAreaDemo frame=new TextAreaDemo();
		frame.pack();
		frame.setTitle("TextAreaDemo");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	
	
	public TextAreaDemo() throws FileNotFoundException{
		descriptionPanel.setTitle("liuxv");
		java.io.File file=new java.io.File("1.txt");
		Scanner input=new Scanner(file);
		String description=input.nextLine();
		
		descriptionPanel.setDescription(description);
		descriptionPanel.setImageIcon(new ImageIcon("../images/a.jpg"));
		
		setLayout(new BorderLayout());
		add(descriptionPanel,BorderLayout.CENTER);
		input.close();
	}
	
	
}
