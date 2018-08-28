package 网络_发送和接受对象;

import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class StudentClient extends JApplet {
	private JTextField jtfName=new JTextField(32);
	private JTextField jtfCity=new JTextField(20);
	private JTextField jtfPhone=new JTextField(12);
	
	private JButton jbtRegister=new JButton("Register to the server");
	
	private boolean isStandAlone=false;//是否在本机上运行
	
	String host="localHost";
	
	public void init(){
		JPanel p1=new JPanel();
		p1.setLayout(new GridLayout(2,1));
		p1.add(new Label("Name"));
		p1.add(new Label("City"));
		
		JPanel jpPhone=new JPanel();
		jpPhone.setLayout(new BorderLayout());
		jpPhone.add(new JLabel("phone"),BorderLayout.WEST);
		jpPhone.add(jtfPhone, BorderLayout.CENTER);
		
		JPanel p2=new JPanel();
		p2.setLayout(new BorderLayout());
		p2.add(jtfCity, BorderLayout.CENTER);
		p2.add(jpPhone, BorderLayout.EAST);
		
		JPanel p3=new JPanel();
		p3.setLayout(new GridLayout(2,1));
		p3.add(jtfName);
		p3.add(p2);
		
		JPanel studentPanel=new JPanel();
		studentPanel.setBorder(new BevelBorder(BevelBorder.RAISED));
		studentPanel.add(p1, BorderLayout.WEST);
		studentPanel.add(p3, BorderLayout.CENTER);
		
		add(studentPanel,BorderLayout.CENTER);
		add(jbtRegister,BorderLayout.SOUTH);
		
		if(!isStandAlone)
			host=getCodeBase().getHost();
		
	}
	
	
	private class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			try{
				Socket socket=new Socket(host,8001);
				
				ObjectOutputStream toServer=new ObjectOutputStream(socket.getOutputStream());
				
				
				String name=jtfName.getText().trim();
				String city=jtfCity.getText().trim();
				String phone=jtfPhone.getText().trim();
				
				StudentAddress s=new StudentAddress(name,city,phone);
				
				toServer.writeObject(s);
				
				
				
			}
			catch(IOException ex){
				System.err.println(ex);
			}
		}
	}
	
	
	public static void main(String[] args){
		JFrame frame=new JFrame("Register Student Client");
		
		StudentClient applet=new StudentClient();
		applet.isStandAlone=true;
		if(args.length==1)
			applet.host=args[0];
		
		frame.add(applet, BorderLayout.CENTER);
		applet.init();
		applet.start();
		
		frame.pack();//自动显示大小 适应大小
		frame.setVisible(true);
		
	}
	
	
	
}









