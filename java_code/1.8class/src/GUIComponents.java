import javax.swing.*;
public class GUIComponents {
	public static void main(String[] args){
		
		JButton jbtOK=new JButton("OK");//��ť
		
		JButton jbtCancel=new JButton("Cannel");//��ť
		
		JLabel jlblName=new JLabel("Enter your name:");//�ı�
		
		JTextField jtfName=new JTextField("Type Name Here:");//�ı���
		
		JCheckBox jchkBold=new JCheckBox("Bold");//��ѡ��
		
		JCheckBox jchkItalic=new JCheckBox("Italic");//��ѡ��
		
		JRadioButton jrbRed=new JRadioButton("Red");//��ѡ��ť
		
		JRadioButton jrbYellow=new JRadioButton("Yellow");//��ѡ��ť
		
		JComboBox jcboColor=new JComboBox(new String[]{"Freshman","Sophomore","Junoir","Senior"});//�����˵�
		
		
		
		
		JPanel panel=new JPanel();
		panel.add(jbtOK);
		panel.add(jbtCancel);
		panel.add(jlblName);
		panel.add(jtfName);
		panel.add(jchkBold);
		panel.add(jchkItalic);
		panel.add(jrbRed);
		panel.add(jrbYellow);
		panel.add(jcboColor);
		
		
		JFrame frame=new JFrame();
		frame.add(panel);
		frame.setTitle("show GUL componment:");
		frame.setSize(1000,200);
		frame.setLocation(0, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
	}
}
