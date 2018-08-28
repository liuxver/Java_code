package Java第四次上机;
//package Java第三次上机;
//package Java第二次上级;
/**
*
*author:liuxv
*student_number:15130120185
*email:liuxver444@gmail.com
*email1:1369058574@qq.com
*/
import java.util.*;
import java.text.*;
public class PIMAppointment extends PIMEntity {
	//String priority;
	Date date;
	String description;
	
	PIMAppointment(){
		super();
		date=new Date();
		description="";
	}
	
	PIMAppointment(String  priority){
		super(priority);
		date=new Date();
		description="";
	}
	
	PIMAppointment(String priority,Date date){
		this(priority);
		this.date=date;
		description="";
	}
	PIMAppointment(String priority,Date date,String text){
		this(priority,date);
		this.description=text;
	}
	
	public String getDate(){
		SimpleDateFormat f=new SimpleDateFormat("dd/MM/yyyy");
		
		String s=f.format(this.date);
		return s;
		//return date;
	}
	
	public void setDate(Date date){
		//SimpleDateFormat f=new SimpleDateFormat("dd/MM/yyyy");
		
		//String s=f.format(this.date);
		//return s;
		this.date=date;
	}
	
	public String getDescription(){
		return description;
	}
	
	public void setDescription(String text){
		this.description=text;
	}
	
	public void fromString(String s) {
		// TODO Auto-generated method stub
		String[] newTodo=s.split(" ");
		//this(newTodo[0],newTodo[1],newTodo[2]);
		this.Priority=newTodo[0];
		
		//从字符串到日期的转换
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd/MM/yyyy");
		try{
			Date date=simpleDateFormat.parse(newTodo[1]);
			this.date=date;
		}catch(ParseException px){
			px.printStackTrace();
		}
		//this.date=Date.from(newTodo[1]);
		this.description=newTodo[2];
		
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String s="APPOINTMENT "+this.Priority+" "+this.getDate()+" "+this.getDescription()+" .";
		
		return s;
	}

	@Override
	public void fromString(ArrayList<String> list) {
		// TODO Auto-generated method stub
		
	}
	
}
