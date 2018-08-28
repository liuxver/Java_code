package √Ê ‘Ã‚;
/**
*
*author:liuxv
*student_number:15130120185
*email:liuxver444@gmail.com
*email1:1369058574@qq.com
*/
import java.util.*;
public class huya {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		String[] list=null;
		String s=input.nextLine();
		list=s.split(",");
		
		String s1="";
		
		for(int i=0;i<list.length;i++){
			int temp=Integer.parseInt(list[i]);
			switch(temp){
			case 1:{
				s1=s1+2+",";
				break;
			}
			case 2:{
				s1=s1+4+",";
				break;
			}
			case 3:{
				s1=s1+1+",";
				break;
			}
			case 4:{
				s1=s1+5+",";
				break;
			}
			case 5:{
				s1=s1+3+",";
				break;
			}
			default:
				break;
			}
			//System.out.println(list[i]);
		}
		String s2 = s1.substring(0, s1.length()-1);
		//System.arraycopy(s1, 0, s2, 0, s1.length()-1);
		System.out.println(s2);
		
	}
}
