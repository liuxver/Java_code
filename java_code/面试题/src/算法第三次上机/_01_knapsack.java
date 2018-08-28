package 算法第三次上机;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
*
*author:liuxv
*student_number:15130120185
*email:liuxver444@gmail.com
*email1:1369058574@qq.com
*/
public class _01_knapsack {
	
	static List<Item> answer(List<Item> list){
		double num=100;
		Collections.sort(list);
		List<Item> result=new ArrayList<Item>();
		double now=0;
		double need=100;
		//int i=0;
		while(true){
			//double temp=list.get(i).weight;
			int i=0;
			//boolean no_stop=true;
			while(i<list.size()){
				if(list.get(i).weight<=need){
					break;
				}
				i++;
				//no_stop=false;
			}
			if(i>=list.size()){
				break;
			}
			double temp=list.get(i).weight;
			need=need-temp;
			
			
			result.add(list.get(i));
			//i++;
			list.remove(i);
		}
		//double need=num-now;
		//double value=need*(list.get(i).valuePerWeight);
		//Item item=new Item(value,need,list.get(i).valuePerWeight);
		//result.add(item);
		return result;
		
		
	}

	
	public static void main(String[] args){
		List<Item> list=new LinkedList<Item>();
		
		
		list.add(new Item(20,10,2.0));
		list.add(new Item(30,20,1.5));
		list.add(new Item(65,30,2.1));
		list.add(new Item(40,40,1.0));
		list.add(new Item(60,50,1.2));
		
		//Collections.sort(list);
		
		//for(int i=0;i<list.size();i++){
			//System.out.println(list.get(i).valuePerWeight);
		//}
		
		List<Item> result=answer(list);
		double total=0;
		for(int i=0;i<result.size();i++){
			System.out.println(result.get(i).valuePerWeight+" "+result.get(i).value+" "+result.get(i).weight);
			total+=result.get(i).value;
		}
		System.out.println("The total value is : "+total);
	}
	
	
	
}


