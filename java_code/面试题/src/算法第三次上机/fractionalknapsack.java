package 算法第三次上机;

import java.util.*;

/**
*
*author:liuxv
*student_number:15130120185
*email:liuxver444@gmail.com
*email1:1369058574@qq.com
*/
public class fractionalknapsack {
	
	static List<Item> answer(List<Item> list){
		double num=100;
		List<Item> result=new ArrayList<Item>();
		double now=0;
		int i=0;
		while(true){
			double temp=list.get(i).weight;
			if(now+temp>100){
				break;
			}
			now+=temp;
			
			result.add(list.get(i));
			i++;
		}
		double need=num-now;
		double value=need*(list.get(i).valuePerWeight);
		Item item=new Item(value,need,list.get(i).valuePerWeight);
		result.add(item);
		return result;
		
		
	}
	
	

	public static void main(String[] args){
		//double [][] items={{20,10,2},{30,20,1.5},{65,30,2.1},{40,40,1},{60,50,1.2}};
		List<Item> list=new LinkedList<Item>();
		
		
		list.add(new Item(20,10,2.0));
		list.add(new Item(30,20,1.5));
		list.add(new Item(65,30,2.1));
		list.add(new Item(40,40,1.0));
		list.add(new Item(60,50,1.2));
		
		Collections.sort(list);
		
		List<Item> result=answer(list);
		double total=0;
		for(int i=0;i<result.size();i++){
			System.out.println(result.get(i).valuePerWeight+" "+result.get(i).value+" "+result.get(i).weight);
			total+=result.get(i).value;
		}
		System.out.println("The total value is : "+total);
		
		
	}
	
	

	
	
}
class Item implements Comparable<Object>{
	double value;
	double weight;
	double valuePerWeight;
	public Item(double a,double b,double c){
		value=a;
		weight=b;
		valuePerWeight=c;
	}
		
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		if(((Item)o).valuePerWeight>this.valuePerWeight)
			return 1;
		else if(((Item)o).valuePerWeight<this.valuePerWeight)
			return -1;
		else
			return 0;
			
	}
		
}
	