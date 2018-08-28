import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class ListDemo extends JFrame {
	final int NUMBER=3;
	
	private String[] name={
			"xiaomengmeng","liuxv","wuyue"
	};
	
	private JList jlist=new JList(name);
	
	private ImageIcon[] imageIcons={
			new ImageIcon("../images/b.gif"),
			new ImageIcon("../images/a.jpg"),
			new ImageIcon("../images/c.jpg")
	};
	
	
	private JLabel[] jlblName=new JLabel[NUMBER];
	
	public static void main(String[] args){
		
		ListDemo frame=new ListDemo();
		frame.setSize(650, 500);
		frame.setTitle("ListDemo");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	
	
	public ListDemo(){
		JPanel p=new JPanel(new GridLayout(3,3,5,5));
		
		for(int i=0;i<NUMBER;i++){
			p.add(jlblName[i]=new JLabel());
			jlblName[i].setHorizontalAlignment(SwingConstants.CENTER);
		}
		

		
		add(p,BorderLayout.CENTER);
		add(new JScrollPane(jlist),BorderLayout.WEST);
		
		jlist.addListSelectionListener(new ListSelectionListener(){
			public void valueChanged(ListSelectionEvent e){
				int[] indices=jlist.getSelectedIndices();
				
				int i;
				for(i=0;i<indices.length;i++){
					jlblName[i].setIcon(imageIcons[indices[i]]);
				}
				
				for(;i<NUMBER;i++){
					jlblName[i].setIcon(null);
				}
			}
		});
		
	}
	
	
}
