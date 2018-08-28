import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ControlCircle2 extends JFrame {
	private JButton jbtEnlarge=new JButton("Enlarge");
	private JButton jbtShrink=new JButton("Shrink");
	private CirclePanel canvas=new CirclePanel();
	
	public ControlCircle2(){
		JPanel panel=new JPanel();
		panel.add(jbtEnlarge);
		panel.add(jbtShrink);
		
		this.add(canvas, BorderLayout.CENTER);
		this.add(panel, BorderLayout.SOUTH);
		
		jbtEnlarge.addActionListener(new EnlargeListener());
		jbtShrink.addActionListener(new ShrinkListener());
		
	}
	
	public static void main(String[] args){
		JFrame frame=new ControlCircle2();
		frame.setTitle("ControlCircle1");
		frame.setSize(200, 200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	
	
	//为了让actionperformed可以访问 canvas  定义为内部类 
	
	class EnlargeListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			canvas.enlarge();
		}
	}
	
	
	class ShrinkListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			canvas.enshrink();
		}
	}


    //定义为内部类，防止和别的包里面的类冲突
	class CirclePanel extends JPanel{
		private int radius=5;
	
		public void enlarge(){
			radius+=5;
			repaint();
		}	
		
		public void enshrink(){
			radius-=5;
			repaint();
		}
	
		protected void paintComponent(Graphics g){
			super.paintComponent(g);
			
			g.drawOval(getWidth()/2-radius, getHeight()/2-radius, 2*radius, 2*radius);
		}
	}

	
	
}



