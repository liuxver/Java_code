import javax.swing.JFrame;
public class MyFrame {
	public static void main(String[] args){
		JFrame frame=new JFrame("MyFrame");
		frame.setSize(400, 300);
		
		//设定和其他组件的位置 如果为空 则 居中
		frame.setLocationRelativeTo(null);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
}
