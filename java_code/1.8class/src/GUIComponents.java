import javax.swing.*;
public class GUIComponents {
	public static void main(String[] args){
		
		JButton jbtOK=new JButton("OK");//按钮
		
		JButton jbtCancel=new JButton("Cannel");//按钮
		
		JLabel jlblName=new JLabel("Enter your name:");//文本
		
		JTextField jtfName=new JTextField("Type Name Here:");//文本框
		
		JCheckBox jchkBold=new JCheckBox("Bold");//复选框
		
		JCheckBox jchkItalic=new JCheckBox("Italic");//复选框
		
		JRadioButton jrbRed=new JRadioButton("Red");//单选按钮
		
		JRadioButton jrbYellow=new JRadioButton("Yellow");//单选按钮
		
		JComboBox jcboColor=new JComboBox(new String[]{"Freshman","Sophomore","Junoir","Senior"});//下拉菜单
		
		
		
		
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
