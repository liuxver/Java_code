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
			
			
			//��С������
			public void windowDeiconified(WindowEvent event){
				System.out.println("Window deiconified");
			}
			
			
			//��ԭ����
			public void windowIconified(WindowEvent event){
				System.out.println("Window iconified");
			}
			
			
			//�����
			public void windowActivated(WindowEvent event){
				//
				
				//����ʵ�ִ򿪴���ʱ��Ķ���
				System.out.println("Window activated");
			}
			
			
			
			//��ɷǻ����
			public void windowDeactivated(WindowEvent event){
				System.out.println("Window deactivated");
			}
			
			
			//�򿨴���
			public void windowOpened(WindowEvent event){
				System.out.println("Window opened");
			}
			
			
			//���ڹرմ���
			public void windowClosing(WindowEvent event){
				System.out.println("Window closing");
			}
			
			
			
			//�رմ���
			public void windowClosed(WindowEvent event){
				System.out.println("Window closed.");
			}
		}
		
		);
	}
	
	
}
