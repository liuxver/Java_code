import java.awt.event.*;
import javax.swing.JFrame;

public class TestWindowEvent extends JFrame{
	public static void main(String[] args){
		TestWindowEvent frame=new TestWindowEvent();
		frame.setSize(220, 80);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("TestWindouEvent");
		frame.setVisible(true);
		
	}
	
	public TestWindowEvent(){
		addWindowListener(new WindowListener(){
			
			
			//最小化窗口
			public void windowDeiconified(WindowEvent event){
				System.out.println("Window deiconified");
			}
			
			
			//还原窗口
			public void windowIconified(WindowEvent event){
				System.out.println("Window iconified");
			}
			
			
			//激活窗口
			public void windowActivated(WindowEvent event){
				//
				
				//具体实现打开窗口时候的动作
				System.out.println("Window activated");
			}
			
			
			
			//变成非活动窗口
			public void windowDeactivated(WindowEvent event){
				System.out.println("Window deactivated");
			}
			
			
			//打卡窗口
			public void windowOpened(WindowEvent event){
				System.out.println("Window opened");
			}
			
			
			//正在关闭窗口
			public void windowClosing(WindowEvent event){
				System.out.println("Window closing");
			}
			
			
			
			//关闭窗口
			public void windowClosed(WindowEvent event){
				System.out.println("Window closed.");
			}
		}
		
		);
	}
	
	
}
