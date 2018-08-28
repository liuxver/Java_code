import java.awt.*;
import java.awt.event.*;
import java.io.FileNotFoundException;

import javax.swing.*;
import java.util.*;
public class ComboBoxDemo extends JFrame {
	private String[] name={"xiaomengmeng","liuxv","wuyue"};
	
	private ImageIcon[] nameImage={
			new ImageIcon("../b.gif"),
			new ImageIcon("../a.jpg"),
			new ImageIcon("../c.jpg")
	};
	
	private String[] nameDescription=new String[3];
	
	private DescriptionPanel descriptionPanel=new DescriptionPanel();
	
	private JComboBox jcbo=new JComboBox(name);
	
	
	public static void main(String[] args) throws FileNotFoundException{
		ComboBoxDemo frame=new ComboBoxDemo();
		frame.setSize(500, 400);
		frame.setTitle("ComboBoxDemo");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	
	
	
	
	public ComboBoxDemo() throws FileNotFoundException{
		java.io.File file=new java.io.File("1.txt");
		Scanner input=new Scanner(file);
		nameDescription[0]=input.nextLine();
		nameDescription[1]=input.nextLine();
		nameDescription[2]=input.nextLine();
		
		setDisplay(0);
		
		add(jcbo,BorderLayout.NORTH);
		add(descriptionPanel,BorderLayout.CENTER);
		
		jcbo.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e){
				setDisplay(jcbo.getSelectedIndex());
			}
		});
		input.close();
	}
	
	public void setDisplay(int index){
		descriptionPanel.setTitle(name[index]);
		descriptionPanel.setImageIcon(nameImage[index]);
		descriptionPanel.setDescription(nameDescription[index]);
	}
	
	
	
	
}
