import javax.swing.*;
import java.awt.event.*;

public class HandleEvent_�ӿ�_�¼�����ͼ����� extends JFrame{
	public HandleEvent_�ӿ�_�¼�����ͼ�����(){
		JButton jbtOk=new JButton("ok");
		JButton jbtCancel=new JButton("Cancel");
		
		JPanel panel=new JPanel();
		panel.add(jbtOk);
		panel.add(jbtCancel);
		
		add(panel);
		
		OKListenerClass listen1=new OKListenerClass();
		CancelListenerClass listen2=new CancelListenerClass();
		
		jbtOk.addActionListener(listen1);
		jbtCancel.addActionListener(listen2);
	}
	public static void main(String[] args){
		JFrame frame=new HandleEvent_�ӿ�_�¼�����ͼ�����();
		frame.setTitle("Handel event �ӿ� �¼�����ͼ�����");
		frame.setSize(200,150);
		frame.setLocation(200, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
		
}
	
	
	
class OKListenerClass implements ActionListener{
	public void actionPerformed(ActionEvent e){
		System.out.println("OK button vlicked.");
	}
}
	


class CancelListenerClass implements ActionListener{
	public void actionPerformed(ActionEvent e){
		//JFrame.EXIT_ON_CLOSE;
		System.out.println("Cannel button clicked.");
	}
}
	
	
	
	
	
	
