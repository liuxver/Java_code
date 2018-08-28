import javax.swing.JFrame;
public class TestFrame {
	public static void main(String[] args){
		JFrame frame1=new JFrame();
		frame1.setTitle("windows1");
		frame1.setSize(300,200);
		frame1.setLocation(200, 100);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setVisible(true);
		
		JFrame frame2=new JFrame();
		frame2.setTitle("window 2");
		frame2.setSize(500,400);
		frame2.setLocation(410, 100);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭框架时候就终止程序
		frame2.setVisible(true);//是否显示框架
		
	}
}
