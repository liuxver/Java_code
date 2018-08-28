import javax.swing.*;
import java.awt.event.*;

public class AnonymousListenerDemo extends JFrame{
	public AnonymousListenerDemo(){
		
		JButton jbtNew=new JButton("new");
		JButton jbtOpen=new JButton("open");
		JButton jbtSave=new JButton("save");
		JButton jbtPrint=new JButton("print");
		
		JPanel panel=new JPanel();
		panel.add(jbtNew);
		panel.add(jbtOpen);
		panel.add(jbtSave);
		panel.add(jbtPrint);
		
		add(panel);
		
		
		jbtNew.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						System.out.println("Process new.");
					}
				});
		
		jbtOpen.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						System.out.println("Process open.");
					}
				});
		
		jbtSave.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						System.out.println("Process save.");
					}
				});
		
		jbtPrint.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						System.out.println("Process print.");
					}
				});
		
	}
	
	public static void main(String[] args){
		JFrame frame=new AnonymousListenerDemo();
		frame.setTitle("AnonymousListenerDemo");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
	
	
	
}
