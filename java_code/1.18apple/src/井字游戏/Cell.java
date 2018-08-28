package ¾®×ÖÓÎÏ·;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;



public class Cell extends JPanel{
	
	private char token=' ';
	
	
	public Cell(){
		setBorder(new LineBorder(Color.BLACK,2));
		//addMouseListener(new MyMouseListener());
	}
	
	public char getToken(){
		return token;
	}
	
	public void setToken(char c){
		token=c;
		repaint();
	}
	
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		
		if(token=='X'){
			g.drawLine(10, 10, getWidth()-10, getWidth()-10);
			g.drawLine(getWidth()-10, 10, 10, getHeight()-10);
		}
		else if(token=='O'){
			g.drawOval(10, 10, getWidth()-20, getHeight()-20);
		}
	}
	
	/*
	private class MyMouseListener extends MouseAdapter{
		public void mouseClicked(MouseEvent e){
			if(token==' '&&whoseTurn!=' '){
				setToken(whoseTurn);
				
				if(isWon(whoseTurn)){
					jlblStatus.setText(whoseTurn+" won! The game is over.");
					whoseTurn=' ';
				}
				else if(isFull()){
					jlblStatus.setText("Draw!The game is over.");
				}else{
					whoseTurn=(whoseTurn=='X')?'O':'X';
					jlblStatus.setText(whoseTurn+"'s turn.");
				}
				
			}	
		}
	}*/
	
}
	