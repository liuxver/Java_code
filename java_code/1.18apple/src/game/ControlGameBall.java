package game;
import javax.swing.*;

import java.awt.event.*;
import java.awt.*;

public class ControlGameBall extends JPanel {
	private GameBall gameBall=new GameBall();
	private JButton jbtResume=new JButton("Resume");
	private JButton jbtSuspend=new JButton("Suspend");
	private JButton jbtUpper=new JButton("Upper");
	private JButton jbtLower=new JButton("Lower");
	//private JTextArea jtaScore=new JTextArea();
	
	
	
	public ControlGameBall(){
		
		
		//gameBall.setSize(1000, 500);
		//gameBall.setVisible(false);
		JPanel panel=new JPanel();
		panel.setLayout(new GridLayout(2,2));
		panel.add(jbtUpper);
		panel.add(jbtLower);
		panel.add(jbtSuspend);
		panel.add(jbtResume);
		
		
		gameBall.setBorder(new javax.swing.border.LineBorder(Color.red));
		
		setLayout(new BorderLayout());
		//add(jtaScore,BorderLayout.NORTH);
		add(gameBall,BorderLayout.CENTER);
		add(panel,BorderLayout.SOUTH);
		
		jbtUpper.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				gameBall.upper();
			}
		});
		
		jbtLower.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				gameBall.lower();
			}
		});
		
		jbtSuspend.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				gameBall.suspend();
			}
		});
		
		jbtResume.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				gameBall.resume();
			}
		});
		
		
		
		
	}
}
