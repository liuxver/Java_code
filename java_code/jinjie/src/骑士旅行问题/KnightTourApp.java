package 骑士旅行问题;
import java.util.List;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class KnightTourApp extends JApplet {
	private KnightTourModel model=new KnightTourModel();
	private PaintKnightTour paintKnightTour=new PaintKnightTour();
	private JTextField jtfRow=new JTextField(2);
	private JTextField jtfColumn=new JTextField(2);
	private JButton jbtSearch=new JButton("Search");
	
	
	public KnightTourApp(){
		JPanel panel=new JPanel();
		panel.add(new JLabel("开始的行数："));
		panel.add(jtfRow);
		panel.add(new JLabel("列数："));
		panel.add(jtfColumn);
		panel.add(jbtSearch);
		
		add(paintKnightTour,BorderLayout.CENTER);
		add(panel,BorderLayout.SOUTH);
		
		jbtSearch.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				int position=Integer.parseInt(jtfRow.getText())*8+Integer.parseInt(jtfColumn.getText());
				System.out.println(position);
				System.out.println(model.getHamiltonianPath(position));
				paintKnightTour.displayPath(model.getHamiltonianPath(position));
			}
		});
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	private static class PaintKnightTour extends JPanel{
		private List<Integer> path;
		
		public PaintKnightTour(){
			setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
		}
		
		public void displayPath(List<Integer> path){
			this.path=path;
			repaint();
		}
		
		protected void paintComponent(Graphics g){
			super.paintComponent(g);
			
			for(int i=0;i<8;i++){
				g.drawLine(0, i*getHeight()/8, getWidth(), i*getHeight()/8);
			}
			
			for(int i=0;i<8;i++){
				g.drawLine(i*getWidth()/8, 0, (int)i*getWidth()/8, getHeight());
			}
			
			if(path==null)
				return;
			
			for(int i=0;i<path.size();i++){
				int u=path.get(i);
				int v=path.get(i+1);
				g.drawLine((u%8)*getWidth()/8+getWidth()/16, (u/8)*getHeight()/8+getHeight()/16, (v%8)*getWidth()/8+getWidth()/16,
						(v/8)*getHeight()/8+getHeight()/16);
			}
			
			
			
		}
		
		
		
		
	}
	
	
	
	
}
