//rpackage Java第二次上级;
/**
*
*author:liuxv
*student_number:15130120185
*email:liuxver444@gmail.com
*email1:1369058574@qq.com
*/
import java.util.*;
import java.text.*;
public class PIMTodo extends PIMEntity {
	//String priority;
	Date date;
	String text;
	
	PIMTodo(){
		super();
		date=new Date();
		text="";
	}
	
	PIMTodo(String  priority){
		super(priority);
		date=new Date();
		text="";
	}
	
	PIMTodo(String priority,Date date){
		this(priority);
		this.date=date;
		text="";
	}
	PIMTodo(String priority,Date date,String text){
		this(priority,date);
		this.text=text;
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
	
	public String getText(){
		return text;
	}
	
	public void setText(String text){
		this.text=text;
	}
	
	@Override
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
		this.text=newTodo[2];
		
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String s="TODO "+this.Priority+" "+this.getDate()+" "+this.getText()+" .";
		
		return s;
	}
	
}
