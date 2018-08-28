package Java第四次上机;

import java.util.ArrayList;

//package Java第三次上机;
//package Java第二次上级;
/**
*
*author:liuxv
*student_number:15130120185
*email:liuxver444@gmail.com
*email1:1369058574@qq.com
*/
public class PIMNote extends PIMEntity {
	
	String text;
	
	PIMNote(){
		super();
		text="";
	}
	
	PIMNote(String priority){
		super(priority);
		text="";
	}
	
	PIMNote(String priority,String text){
		this(priority);
		this.text=text;
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
		String[] newNote=s.split(" ");
		this.Priority=newNote[0];
		this.text=newNote[1];
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String s="NOTE "+this.getPriority()+" "+this.getText()+" .";
		return s;
	}

	@Override
	public void fromString(ArrayList<String> list) {
		// TODO Auto-generated method stub
		
	}
	
}
