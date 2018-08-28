package 算法第三次上机;

import java.util.*;

/**
*
*author:liuxv
*student_number:15130120185
*email:liuxver444@gmail.com
*email1:1369058574@qq.com
*/
public class schedulingproblem {
	
	static int answer(Map<Integer, Character> map){
		int [] result=new int[map.size()];
		int j=0;
		for(Integer key:map.keySet()){
			//System.out.println(key);
			
			int i=j;
			for(;i<map.size();i++){
				result[i]+=key;
			}
			j++;
			
			
		}
		
		int num=0;
		for(int a:result){
			num+=a;
		}
		
		//for(int i=0;i<result.length;i++){
			//System.out.println(result[i]);
		//}
		
		
		
		return num;
		
	}
	
	
	public static void main(String[] args){
		//int [] num=new int[]{15,8,3,10};
		Map<Integer, Character> map=new TreeMap<Integer,Character>();
		map.put(15,'1');
		map.put(8,'2');
		map.put(3,'3');
		map.put(10,'4');
		
		
		int result=answer(map);
		for(Map.Entry<Integer, Character> entry:map.entrySet()){
			System.out.println("j"+entry.getValue()+" : "+entry.getKey());
		}
		System.out.println(result/4.0);
	}
}
