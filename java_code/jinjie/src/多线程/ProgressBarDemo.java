package 多线程;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.beans.*;

public class ProgressBarDemo extends JApplet {
	private JProgressBar jpb=new JProgressBar();
	private JTextArea jtaResult=new JTextArea();
	private JTextField jtfPrimeCount=new JTextField(8);
	private JButton jbtDisplayPrime=new JButton("Display Prime");
	
	public ProgressBarDemo(){
		jpb.setStringPainted(true);
		jpb.setValue(0);
		jpb.setMaximum(100);
		
		jtaResult.setWrapStyleWord(true);
		jtaResult.setLineWrap(true);
		
		JPanel panel=new JPanel();
		panel.add(new JLabel("Enter the primer count :"));
		panel.add(jtfPrimeCount);
		panel.add(jbtDisplayPrime);
		
		add(jpb,BorderLayout.NORTH);
		add(new JScrollPane(jtaResult),BorderLayout.CENTER);
		add(panel,BorderLayout.SOUTH);
		
		jbtDisplayPrime.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				ComputePrime task=new ComputePrime(Integer.parseInt(jtfPrimeCount.getText()),jtaResult);
				task.addPropertyChangeListener(new PropertyChangeListener(){
					public void propertyChange(PropertyChangeEvent e){
						if("progress".equals(e.getPropertyName())){
							jpb.setValue((Integer)e.getNewValue());//获取新的进度值 来更新进度条 
						}
					}
				});
				task.execute();
			}
		});
		
		
		
	}
	
	
	
	static class ComputePrime extends SwingWorker<Integer,Integer>{
		private int count;
		private JTextArea result;
		
		public ComputePrime(int limit,JTextArea result){
			this.count=limit;
			this.result=result;
		}
		
		
		
		//在后台中 运行   publishPrimenumber()   
		protected Integer doInBackground() throws Exception {
			publishPrimeNumber(count);
			return 0;
		}
	
		
		protected void process(java.util.List<Integer> list){
			for(int i=0;i<list.size();i++){
				result.append(list.get(i)+" ");
			}
		}
		
		
		private void publishPrimeNumber(int n){
			int count=0;
			int number=2;
			
			while(count<=n){
				if(isPrime(number)){
					count++;
					setProgress(100*count/n);//设置新的进度值 导致  propertyChangevent  被触发  
					publish(number);//将数据发送个 process方法  
				}
				number++;
			}
		}
		
		
		
		
		public static boolean isPrime(int number){
			for(int divisor=2;divisor<=number/2;divisor++){
				if(number%divisor==0){
					return false;
				}
			}
			return true;
		}

	}
		
		
		
	
}
