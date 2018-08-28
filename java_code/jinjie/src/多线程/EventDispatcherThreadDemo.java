package ∂‡œﬂ≥Ã;

import javax.swing.*;

public class EventDispatcherThreadDemo extends JApplet {
	public EventDispatcherThreadDemo(){
		add(new JLabel("Liuxv,l love you."));
	}
	
	public static void main(String[] args){
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				JFrame frame=new JFrame("EvevtDispatcherThreadDemo");
				frame.add(new EventDispatcherThreadDemo());
				frame.setSize(200, 200);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
			}
		});
	}
}
