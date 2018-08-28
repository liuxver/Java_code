import javax.swing.*;
public class DisPlayImageWithURL extends JApplet {
	public DisPlayImageWithURL(){
		java.net.URL url=this.getClass().getResource("b.gif");
		System.out.println(url);
		add(new JLabel(new ImageIcon(url)));
	}
}
