import java.awt.*;
import javax.swing.*;

public class EightQueens extends JApplet {
	public static final int SIZE=8;
	private int[] queens=new int[SIZE];
	
	public EightQueens(){
		search(0);
		add(new ChessBoard(),BorderLayout.CENTER);
	}
	
	private boolean isValid(int row,int column){
		for(int i=1;i<=row;i++){
			if(queens[row-i]==column||queens[row-i]==column-i||queens[row-i]==column+i)
				return false;
			
		}
		return true;
	}
	
	private boolean search(int row){
		if(row==SIZE)
			return true;
		
		for(int column=0;column<SIZE;column++){
			queens[row]=column;
			if(isValid(row,column)&&search(row+1))
				return true;
		}
		
		return false;
	}
	
	class ChessBoard extends JPanel{
		private Image queenImage=new ImageIcon("../images/a.jpg").getImage();
		
		ChessBoard(){
			this.setBorder(BorderFactory.createLineBorder(Color.RED,2));
		}
		
		protected void paintComponent(Graphics g){
			super.paintComponent(g);
			
			for(int i=0;i<SIZE;i++){
				int j=queens[i];
				g.drawImage(queenImage, j*getWidth()/SIZE, i*getHeight()/SIZE, getWidth()/SIZE,getHeight()/SIZE,this);
			}
			
			for(int i=1;i<SIZE;i++){
				g.drawLine(0, i*getHeight()/SIZE, getWidth(), i*getWidth()/SIZE);
				
				g.drawLine(i*getWidth()/SIZE, 0, i*getWidth()/SIZE, getHeight());
			}
		}
		
		
	}
	
	
	
}
