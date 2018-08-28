package ¶à¸ö´°¿Ú;

import java.awt.*;
import java.util.*;
import java.awt.event.*;
import java.io.FileNotFoundException;

import javax.swing.*;

public class MultipleWindowsDemo extends JFrame {
	private JTextArea jta;
	
	private JButton jbtShowHistogram=new JButton("Show Histograme");
	private JButton jbtGetFileWords=new JButton("Get Words From File");
	
	private Histogram histogram=new Histogram();
	
	private JFrame histogramFrame=new JFrame();
	
	public MultipleWindowsDemo(){
		JScrollPane scrollPane=new JScrollPane(jta=new JTextArea());
		scrollPane.setPreferredSize(new Dimension(300,200));
		jta.setWrapStyleWord(true);
		jta.setLineWrap(true);
		
		add(scrollPane,BorderLayout.CENTER);
		
		JPanel panel1=new JPanel();
		panel1.add(jbtGetFileWords);
		panel1.add(jbtShowHistogram);
		add(panel1,BorderLayout.SOUTH);
		
		jbtShowHistogram.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String text=jta.getText();
				int[] count=countLetters(text);
				
				histogram.showHistogram(count);
				
				histogramFrame.setVisible(true);
			}
		});
		
		jbtGetFileWords.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				java.io.File file=new java.io.File("1.txt");
				try {
					Scanner input=new Scanner(file);
					String text=input.nextLine();
					while(input.hasNextLine()){
						text+=input.nextLine();
					}
					
					jta.setText(text);
					
					
					int[] count=countLetters(text);
					histogram.showHistogram(count);
					histogramFrame.setVisible(true);
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
			}
		});
		
		histogramFrame.add(histogram);
		histogramFrame.pack();
		histogramFrame.setTitle("Histogram");
		
	}
	
	private int[] countLetters(String text){
		int[] count=new int[26];
		
		
		for(int i=0;i<text.length();i++){
			char character=text.charAt(i);
			if((character>='A')&&(character<='Z'))
				count[character-'A']++;
			else if((character>='a')&&(character<='z'))
				count[character-'a']++;
			
		}
		
		return count;
	}
	
	public static void main(String[] args){
		MultipleWindowsDemo frame=new MultipleWindowsDemo();
		frame.setLocationRelativeTo(frame);
		frame.setTitle("MutltipleWindowsDemo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
	
	
	
}























