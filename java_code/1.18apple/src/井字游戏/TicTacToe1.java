package ¾®×ÖÓÎÏ·;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class TicTacToe1 extends JPanel {
	
	protected char whoseTurn='X';
	
	private Cell[][] cells=new Cell[3][3];
	
	protected JLabel jlblStatus=new JLabel("X's turn to play");
	
	public TicTacToe1(){
		JPanel p=new JPanel(new GridLayout(3,3,0,0));
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				p.add(cells[i][j]=new Cell());
			}
		}
		
		p.setBorder(new LineBorder(Color.red,1));
		
		jlblStatus.setBorder(new LineBorder(Color.YELLOW,1));
		
		add(p,BorderLayout.CENTER);
		add(jlblStatus,BorderLayout.SOUTH);
		
		
	}
	
	public boolean isFull(){
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				if(cells[i][j].getToken()==' ')
					return false;
			}
		}
		return true;
	}
	
	public boolean isWon(char token){
		for(int i=0;i<3;i++){
			if((cells[i][0].getToken()==token)&&(cells[i][1].getToken()==token)
					&&(cells[i][2].getToken()==token)){
				return true;
			}
		}
		
		for(int j=0;j<3;j++){
			if((cells[0][j].getToken()==token)&&(cells[1][j].getToken()==token)&&(cells[2][j].getToken()==token)){
				return true;
			}
		}
		
		if((cells[0][0].getToken()==token)&&(cells[1][1].getToken()==token)&&(cells[2][2].getToken()==token))
			return true;
		
		if((cells[0][2].getToken()==token)&&(cells[1][1].getToken()==token)&&(cells[2][0].getToken()==token))
			return true;
		
		return false;
		
	}
	
	
	
}













