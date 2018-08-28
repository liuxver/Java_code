import javax.swing.*;
import java.awt.*;

public class DescriptionPanel extends JPanel {
	
	private JLabel jlblImageTitle=new JLabel();
	private JTextArea jtaDescription=new JTextArea();
	
	public DescriptionPanel(){
		//��ǩ���ı���ͼ���ˮƽ���뷽ʽ
		jlblImageTitle.setHorizontalAlignment(JLabel.CENTER);
		//��ǩ�������ͼ����ı�ˮƽλ��
		jlblImageTitle.setHorizontalTextPosition(JLabel.CENTER);
		//��ǩ�������ͼ����ı���ֱλ��
		jlblImageTitle.setVerticalTextPosition(JLabel.BOTTOM);
		
		jlblImageTitle.setFont(new Font("SansSerif",Font.BOLD,16));
		jtaDescription.setFont(new Font("Serif",Font.PLAIN,14));
		
		jtaDescription.setLineWrap(true);
		jtaDescription.setWrapStyleWord(true);
		
		//���ɸı�
		jtaDescription.setEditable(false);
		
		JScrollPane scrollPane=new JScrollPane(jtaDescription);
		
		setLayout(new BorderLayout(5,5));
		add(scrollPane,BorderLayout.CENTER);
		add(jlblImageTitle,BorderLayout.WEST);
		
		
		
	}
	
	public void setTitle(String title){
		jlblImageTitle.setText(title);
	}
	
	public void setImageIcon(ImageIcon icon){
		jlblImageTitle.setIcon(icon);
	}
	
	public void setDescription(String text){
		jtaDescription.setText(text);
	}
	
	
}
