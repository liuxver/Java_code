import javax.swing.*;
import java.awt.event.*;

public class DetectSourceDemo extends JFrame{
	
	private JButton jbtNew=new JButton("New");
	private JButton jbtOpen=new JButton("Open");
	private JButton jbtSave=new JButton("Save");
	private JButton jbtPrint=new JButton("Print");
	
	public DetectSourceDemo(){
		JPanel panel=new JPanel();
		panel.add(jbtNew);
		panel.add(jbtOpen);
		panel.add(jbtSave);
		panel.add(jbtPrint);
		
		add(panel);
		
		ButtonListener listener=new ButtonListener();
		jbtNew.addActionListener(listener);
		jbtOpen.addActionListener(listener);
		jbtSave.addActionListener(listener);
		jbtPrint.addActionListener(listener);
		
		
		
	}
	
	class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(e.getSource()==jbtNew)
				System.out.println("Provess new");
			else if(e.getSource()==jbtOpen)
				System.out.println("Process open.");
			else if(e.getSource()==jbtSave)
				System.out.println("Process save");
			else
				System.out.println("Process print.");
		}
	}
	
	public static void main(String[] args){
		JFrame frame=new DetectSourceDemo();
		frame.setTitle("AnonymousListenerDemo");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
	
	
	
}
