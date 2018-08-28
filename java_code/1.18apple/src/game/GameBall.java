package game;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.*;

public class GameBall extends JPanel {
	static int number=1;
	private int delay=100;
	private Timer timer=new Timer(delay,new TimerListener());
	JTextArea jtaScore=new JTextArea();
	
	
/*	private int radius=getWidth()/20;
	private int x=getWidth()/3;
	private int y=getHeight()/2;
	private int dy=getHeight()/10;
	
	private int width=getWidth()/50;//욱똑
	private int x1=getWidth()-width;
	private int height=((int)Math.random()*(10-1))*getHeight()/10;
	private int y1=Math.random()>0.5?0:getHeight()-height;
	private int dx=getWidth()/50;
	*/
	
	
	final int WIDTH=1920;
	final int HEIGHT=897;
	
	
	private int radius=WIDTH/20;
	private int x=WIDTH/3;
	private int y=HEIGHT/2;
	private int dy=HEIGHT/10;
	
	
	
	private int width=WIDTH/50;//욱똑
	private int x1=WIDTH-width;
	private int height=(int)(Math.random()*10)*HEIGHT/10;
	private int y1=Math.random()>0.5?0:HEIGHT-height;
	private int dx=WIDTH/50;
	
	
	
	
	
	
	public GameBall(){
		//System.out.println(x+" "+y+" "+radius);
		timer.start();
		add(jtaScore,BorderLayout.NORTH);
		
	}
	
	private class TimerListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			//System.out.println(x+" "+y+" "+radius);
			repaint();
		}
	}
	
	protected void paintComponent(Graphics g){
		//
		//System.out.println(getWidth()+"                      "+getHeight());
		super.paintComponent(g);
		jtaScore.setText(number+"");
		
		g.setColor(Color.red);
		
		x1-=(dx);
		//g.drawOval(x, y, radius, radius);
		g.fillOval(x, y, radius, radius);
		System.out.println(over());
		g.fillRect(x1, y1, width, height);
	//	System.out.println(y1+height);
		System.out.println(x+"          "+x1);
		if(x1<x){
			if(over()){
				timer.stop();
			}
			number++;
			x1=WIDTH-width;
			height=(int)(Math.random()*11)*HEIGHT/10;
			y1=Math.random()>0.5?0:HEIGHT-height;
			g.fillRect(x1, y1, width, height);
		}
		System.out.println(number);
		
	}
	
	public boolean over(){
		if((x>x1&&x<x1+radius)&&(((y-radius<height)&&(y1==0)))||(((y+radius>y1)&&(y1==HEIGHT-height))))
			return true;
		else
			return false;
	}
	
	public void suspend(){
		timer.stop();
	}
	
	public void resume(){
		timer.start();
	}
	
	public void upper(){
		
		if(y<80){
			dy=0;
		}else{
			dy=HEIGHT/10;
		}
			
		
		//dy=HEIGHT/10;
		
		y-=dy;
		repaint();
	}
	
	public void lower(){
		
		if(y>HEIGHT-radius){
			dy=0;
		}else{
			dy=HEIGHT/10;
		}
		
		//
		y+=dy;
		repaint();
	}
	
	
	
	
	public void setDelay(int delay){
		this.delay=delay;
		timer.setDelay(delay);
	}
	
	
	
	
	
}
