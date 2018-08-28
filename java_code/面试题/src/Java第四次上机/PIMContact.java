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
public class PIMContact extends PIMEntity {
	//String[][] s=null;
	//int num=0;
	List<Person> list=new ArrayList<Person>();
	PIMContact(){
		super();
		//list=null;
	}
	
	PIMContact(String priority){
		super(priority);
		//list=null;
	}
	
	
	PIMContact(String priority,String[] s){
		this(priority);
	
		//String[][] s1=null;
		for(int i=0;i<s.length/3;i++){
			String a=s[i*3+0];
			String b=s[i*3+1];
			String c=s[i*3+2];
			Person p=new Person(a,b,c);
			list.add(p);
			
		}
		//this.s=s1;
	}
	
	public void add(String s1){
		//System.out.println(s1);
		String[] newContact=s1.split(" ");
		//System.out.println(s1);
		//System.out.println(newContact);
		
		
		
		String a=newContact[0];
		String b=newContact[1];
		String c=newContact[2];
		//System.out.println(" "+a+b+c);
		Person p=new Person(a,b,c);
		list.add(p);
		
		//s[s.length][0]=first;
		//s[s.length][1]=last;
		//s[s.length][2]=email;
		//num++;
	}
	public String delete(){
		return "因为时间原因，这个函数没有写";
	}

	public void fromString(String s1) {
		// TODO Auto-generated method stub
		String[] newContact=s1.split(" ");
	//	this.s[this.s.length][0]=newContact[0];
		//this.s[this.s.length][1]=newContact[1];
		//this.s[this.s.length][1]=newContact[1];
		///this.add(newContact[0], newContact[1], newContact[2]);
		String[] s2 = null;
		System.arraycopy(newContact, 1, s2, 0,newContact.length-1);
		this.Priority=newContact[0];
		
		for(int i=0;i<s2.length/3;i++){
			String a=s2[i*3+0];
			String b=s2[i*3+1];
			String c=s2[i*3+2];
			Person p=new Person(a,b,c);
			list.add(p);
			
		}
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String result="CONTACT "+this.getPriority()+" ";
		for(int i=0;i<list.size();i++){
			result=result+list.get(i).first+" "+list.get(i).last+" "+list.get(i).email+" ";
		}
		
		
		
		return result;
	}

	@Override
	public void fromString(ArrayList<String> list) {
		// TODO Auto-generated method stub
		
	}
	
	
}


