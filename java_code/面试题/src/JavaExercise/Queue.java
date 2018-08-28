package JavaExercise;

import java.util.*;

/**
*
*author:liuxv
*student_number:15130120185
*email:liuxver444@gmail.com
*email1:1369058574@qq.com
*/
public class Queue {
	private List<String> list=new LinkedList<String>();
	private int num=6;
	
	public Queue(){
		
	}
	
	public void add(String s){
		if(list.size()>6){
			list.remove(0);
			list.add(s);
			return;
		}
		list.add(s);
		
	}
	
	
	
	public String get(int n){
		return list.get(n);
	}
	
	public int getSize(){
		return list.size();
	}
	
	
	
}
