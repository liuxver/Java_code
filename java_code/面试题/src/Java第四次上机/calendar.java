package Java第四次上机;
/**
*
*author:liuxv
*student_number:15130120185
*email:liuxver444@gmail.com
*email1:1369058574@qq.com
*/
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFrame;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class calendar extends JFrame{
	public calendar(String[] args){
		//行数 列数 水平间隔 垂直间隔
		setLayout(new GridLayout(6,7,5,5));
		
		add(new JLabel("First Name"));
		add(new JTextField(8));
		add(new JLabel("MI"));
		add(new JTextField(1));
		add(new JLabel("Last Name"));
		add(new JTextField(8));
		
		//第一行
		add(new JLabel("Su"));
		add(new JLabel("Mo"));
		add(new JLabel("Tu"));
		add(new JLabel("We"));
		add(new JLabel("Th"));
		add(new JLabel("Fr"));
		add(new JLabel("Sa"));
		
		

		
		int month=Integer.parseInt(args[0]);
		int year=Integer.parseInt(args[1]);
		Calendar calendar=new GregorianCalendar();
		calendar.set(year,month-1, 1);
		int maxDay=calendar.getActualMaximum(Calendar.DATE);
		int firstDay=calendar.get(Calendar.DAY_OF_WEEK);
		//System.out.println(monthName[month-1]+" "+year);
		//System.out.println("Su\t"+"Mo\t"+"Tu\t"+"We\t"+"Th\t"+"Fr\t"+"Sa\t");
		for(int i=1;i<firstDay;i++){
			add(new JLabel("    "));
		}
		
		for(int i=1;i<=maxDay;i++){
			Calendar c=new GregorianCalendar();
			c.set(year, month-1, i);
			Date d=c.getTime();
			PIMCollection collection=new PIMCollection();
			List<PIMEntity> list=collection.getItemsForDate(d);
			
			
			
			
			
			//System.out.print(i+"\t");
			//if((i-(8-firstDay))%7==0){
			//	System.out.println();
			//}
		}
		
		
		
		
		
	}
	public static void main(String[] args){
		calendar frame=new calendar(args);
		frame.setTitle("Show GridLayout");
		frame.setSize(200,125);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
