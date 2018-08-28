//package Java第三次上机;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
*
*author:liuxv
*student_number:15130120185
*email:liuxver444@gmail.com
*email1:1369058574@qq.com
*/
public class PIMCollection implements PIMInterface {
	
	static List<PIMEntity> items=new LinkedList<PIMEntity>();
	static SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd/MM/yyyy");
	//static int num=0;
	//static Scanner input=new Scanner(System.in);
	
	
	public static void load() throws FileNotFoundException, ParseException{
		System.out.println("Load From data.txt>-------");
		String fileName=new String("data.txt");
		File file=new File(fileName);
		Scanner input=new Scanner(file);
		String s=input.nextLine();
		System.out.println(s);
		//s=input.nextLine();
		while(input.hasNextLine()){
			//s=input.nextLine();
			s=input.nextLine();
			String[] s1=s.split(" ");
			//System.out.println(s);
			
			if(s1[3].equals(new String("TODO"))){
				String[] s3=new String[s1.length-6];
				String text="";
				for(int i=0;i<s3.length;i++){
					s3[i]=s1[i+6];
					text=text+" "+s3[i];
				}
				//String text=s3.toString();
				Date date=simpleDateFormat.parse(s1[5]);//throws ParseException
				PIMTodo todo=new PIMTodo(s1[4],date,text);
				items.add(todo);
				//break;
			}
			else if(s1[3].equals(new String("NOTE"))){
				String[] s3=new String[s1.length-5];
				String text="";
				for(int i=0;i<s3.length;i++){
					s3[i]=s1[i+5];
					text=text+" "+s3[i];
				}
				//String text=s3.toString();
				PIMNote note=new PIMNote(s1[4],text);
				items.add(note);
				//break;
				//break;
			}
			else if(s1[3].equals(new String("APPOINTMENT"))){
				String[] s3=new String[s1.length-6];
				String text="";
				for(int i=0;i<s3.length;i++){
					s3[i]=s1[i+6];
					text=text+" "+s3[i];
				}
				//String text=s3.toString();
				Date date=simpleDateFormat.parse(s1[5]);
				PIMAppointment appointment=new PIMAppointment(s1[4],date,text);
				items.add(appointment);
				//break;

			}
			else if(s1[3].equals(new String("CONTACT"))){
				String [] s2 = s1;
				//System.out.println(s);
				
				//System.arraycopy(s1, 6, s2, 0, s1.length-6);
				String[] s3=new String[s2.length-5];
				for(int i=0;i<s3.length;i++){
					s3[i]=s2[i+5];
					//System.out.println(s3[i]);
				}
				//System.out.println(s3.length);
				
				PIMContact contact=new PIMContact(s1[4],s3);
				items.add(contact);
				//break;
				//break;
			}
			else{
				System.out.println("data error!");
				
			}
			
			
			//s=input.nextLine();
			
		}
		input.close();
		
	}
	
	
	
	
	
	
	public List<PIMEntity> getNotes(){
		List<PIMEntity> list=new LinkedList<PIMEntity>();
		
		for(int i=0;i<items.size();i++){
			PIMEntity temp=items.get(i);
			if(temp instanceof PIMNote){
				list.add(temp);
			}
		}
		return list;
		
	}

	public List<PIMEntity> getTodos(){
		List<PIMEntity> list=new LinkedList<PIMEntity>();
		
		for(int i=0;i<items.size();i++){
			PIMEntity temp=items.get(i);
			if(temp instanceof PIMTodo){
				list.add(temp);
			}
		}
		return list;
	}

	public List<PIMEntity> getAppointments(){
		List<PIMEntity> list=new LinkedList<PIMEntity>();
		
		for(int i=0;i<items.size();i++){
			PIMEntity temp=items.get(i);
			if(temp instanceof PIMAppointment){
				list.add(temp);
			}
		}
		return list;
	}


	public List<PIMEntity> getContact(){
		List<PIMEntity> list=new LinkedList<PIMEntity>();
		
		for(int i=0;i<items.size();i++){
			PIMEntity temp=items.get(i);
			if(temp instanceof PIMContact){
				list.add(temp);
			}
		}
		return list;
	}


	public List<PIMEntity> getItemsForDate(Date d){
		SimpleDateFormat f=new SimpleDateFormat("dd/MM/yyyy");
		
		String s=f.format(d);
		List<PIMEntity> list=new LinkedList<PIMEntity>();
		
		for(int i=0;i<items.size();i++){
			PIMEntity temp=items.get(i);
			if(temp instanceof PIMTodo){
				if(((PIMTodo) temp).getDate().equals(s)){
					list.add(temp);
				}
			}
			if(temp instanceof PIMAppointment){
				if(((PIMAppointment) temp).getDate().equals(s)){
					list.add(temp);
				}
			}
			
		}
		return list;
	}
	
	
	public static void show(List<PIMEntity> list){
		System.out.println("There are "+list.size()+" items. ");
		for(int i=0;i<list.size();i++){
			System.out.println("Item "+i+" : "+list.get(i).toString());
		}
	}
	
	
	public static void main(String[] args) throws FileNotFoundException, ParseException{
		PIMCollection c=new PIMCollection ();
		load();
		System.out.println("1:getNotes,2:getTodos,3:getAppointment,4:getContact,5:getItemsForDate,0:over ---------------");
		Scanner input =new Scanner(System.in);
		int n=Integer.parseInt(input.nextLine());
		while(n!=0){
			switch(n){
			case 1:{
				List<PIMEntity> list=c.getNotes();
				show(list);
				break;
			}
			case 2:{
				List<PIMEntity> list=c.getTodos();
				show(list);
				break;
			}
			case 3:{
				List<PIMEntity> list=c.getAppointments();
				show(list);
				break;
			}
			case 4:{
				List<PIMEntity> list=c.getContact();
				show(list);
				break;
			}
			case 5:{
				System.out.println("Enter date:(dd/mm/yyyy)");
				//Scanner input1=new Scanner(System.in);
				String s=input.nextLine();
				String s1="23/5/2018";
				Date date1=null;
				try{
					date1=simpleDateFormat.parse(s);
					
				}catch(ParseException px){
					System.out.println("Data error!");
					px.printStackTrace();
				}
				
				List<PIMEntity> list=c.getItemsForDate(date1);
				show(list);
				break;
			}
			default:
				break;
			}
			
			n=Integer.parseInt(input.nextLine());
		}
	}

}
