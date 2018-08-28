import javax.swing.*;
import java.awt.*;

public class DescriptionPanel extends JPanel {
	
	private JLabel jlblImageTitle=new JLabel();
	private JTextArea jtaDescription=new JTextArea();
	
	public DescriptionPanel(){
		//标签上文本和图标的水平对齐方式
		jlblImageTitle.setHorizontalAlignment(JLabel.CENTER);
		//标签上相对于图标的文本水平位置
		jlblImageTitle.setHorizontalTextPosition(JLabel.CENTER);
		//标签上相对于图标的文本垂直位置
		jlblImageTitle.setVerticalTextPosition(JLabel.BOTTOM);
		
		jlblImageTitle.setFont(new Font("SansSerif",Font.BOLD,16));
		jtaDescription.setFont(new Font("Serif",Font.PLAIN,14));
		
		jtaDescription.setLineWrap(true);
		jtaDescription.setWrapStyleWord(true);
		
		//不可改变
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
