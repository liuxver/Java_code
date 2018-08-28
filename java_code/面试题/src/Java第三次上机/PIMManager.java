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
import java.io.*;
public class PIMManager {
	static List<PIMEntity> items=new LinkedList<PIMEntity>();
	static SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd/MM/yyyy");
	//static int num=0;
	static Scanner input=new Scanner(System.in);

	public static void main(String[] args) throws FileNotFoundException, ParseException{
		//Scanner input=new Scanner(System.in);
		System.out.println("Welcome to PIM.");
		System.out.println("---Enter a command (suported commands are List Create Save Load Quit)---");
		String s=input.nextLine();
		while(!s.equals(new String("Quit"))){
			/*switch(s){
			case "Create":{
				create();
				break;
			}
			case "Save":{
				save();
				break;
			}
			case "Load":{
				load();
				break;
			}
			case "List":{
				
			}
			default:{
				//System.out.println("---Enter a command (suported commands are List Create Save Load Quit)---");
				//continue;
				break;
			}
			}*/
			if(s.equals(new String("Create"))){
				create();
				
			}
			else if(s.equals(new String("List"))){
				list();
			}
			else if(s.equals(new String("Load"))){
				load();
				
			}
			else if(s.equals(new String("Save"))){
				save();
			}
			else{
				System.out.println("---Enter a command (suported commands are List Create Save Load Quit)---");
				s=input.nextLine();

				continue;
				
			}
				
			System.out.println("---Enter a command (suported commands are List Create Save Load Quit)---");
			s=input.nextLine();

		}
		
	}
	
	public static void create(){
		System.out.println("Enter an item type ( todo, note, contact or appointment )");
		String s=input.nextLine();
		if(s.equals(new String("todo"))){
			System.out.println("Enter date for todo item: ");
			String date=input.nextLine();
			
			
			Date date1 = null;
			try{
				date1=simpleDateFormat.parse(date);
				
			}catch(ParseException px){
				System.out.println("Data error(shu ru cuo wu!)");
				px.printStackTrace();
			}
			
			
			
			
			System.out.println("Enter todo text:");
			String text=input.nextLine();
			System.out.println("Enter todo priority:");
			String priority=input.nextLine();
			
			PIMTodo todo=new PIMTodo(priority,date1,text);
			items.add(todo);
			//break;
			
		}
		else if(s.equals(new String("note"))){
			System.out.println("Enter priority for note:");
			String priority=input.nextLine();
			System.out.println("Enter text fot note:");
			String text=input.nextLine();
			
			PIMNote note=new PIMNote(priority,text);
			items.add(note);
			//break;
		}
		else if(s.equals(new String("appointment"))){
			System.out.println("Enter pority for appointment:");
			String priority=input.nextLine();
			System.out.println("Enter date for appointment:");
			String date=input.nextLine();
			System.out.println("Enter description for appointment:");
			String description=input.nextLine();
			
			Date date1=null;
			try{
				date1=simpleDateFormat.parse(date);
				
			}catch(ParseException px){
				System.out.println("Data error!");
				px.printStackTrace();
			}
			
			PIMAppointment appointment=new PIMAppointment(priority,date1,description);
			items.add(appointment);
			//break;
		}
		else if(s.equals(new String("contact"))){
			System.out.println("Enter priority for contact:");
			String priority=input.nextLine();
			PIMContact contact=new PIMContact(priority);
			System.out.println("Enter the first name,last name and email with balnk spilt:");
			while(input.hasNextLine()){
				String person=input.nextLine();
				if(person.equals(new String("over")))
					break;
				contact.add(person);
			}
			items.add(contact);
			//break;
		}
		else{
			System.out.println("data error!");
			
		}
		
		
		
	}
	
	
	//@SuppressWarnings("resource")
	public static void save() throws FileNotFoundException{
		//File file=new File("data.txt");
		PrintWriter output=new PrintWriter("data.txt");
		
		System.out.println("There are "+items.size()+" items. ");
		output.println("There are "+items.size()+" items. ");
		for(int i=0;i<items.size();i++){
			System.out.println("Item "+i+" : "+items.get(i).toString());
			output.println("Item "+i+" : "+items.get(i).toString());
		}
		output.close();
	}
	
	public static void load() throws FileNotFoundException, ParseException{
		System.out.println("Enter the file path :");
		String fileName=input.nextLine();
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
	}
	
	public static void list(){
		System.out.println("There are "+items.size()+" items. ");
		for(int i=0;i<items.size();i++){
			System.out.println("Item "+i+" : "+items.get(i).toString());
		}
	}

}


