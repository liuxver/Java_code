package 算法第二次上机;

import java.util.ArrayList;
import java.util.LinkedList;

/**
*
*author:liuxv
*student_number:15130120185
*email:liuxver444@gmail.com
*email1:1369058574@qq.com
*/
public class SP {
	static LinkedList<Integer> getShortPath(int[][] data){
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(15);
		while(!list.contains(0)){
			//System.out.println("5555555555555555");
			int minNum=88888;
			int minIndex=15;
			//System.out.println(list.getLast());
			for(int i=0;i<data.length;i++){
				//System.out.println(i);
				if(list.getLast()==data[i][1]){
					//System.out.println("1111111111111111111111111111111111");
					//System.out.println(data[i][1]);
					if(data[i][2]<minNum){
						minNum=data[i][2];
						//System.out.println(i);
						minIndex=data[i][0];
					}
					
				}
			}
			//System.out.println(minIndex);
			
			//System.out.println(minIndex);
			list.add(minIndex);
		}
		
		return list;
		
		
	}
	
	public static void main(String[] args){
		int [][] data={{0,1,5},{0,2,3},{1,3,1},{1,4,3},{1,5,6},{2,4,8},
				{2,5,7},{2,6,6},{3,7,6},{3,8,8},{4,7,3},{4,8,5},{5,8,3},
				{5,9,3},{6,8,8},{6,9,4},{7,10,2},{7,11,2},{8,11,1},{8,12,2},
				{9,11,3},{9,12,3},{10,13,3},{10,14,5},{11,13,5},{11,14,2},{12,13,6},
				{12,14,6},{13,15,4},{14,15,3}
		};
		
		LinkedList<Integer> result=getShortPath(data);
		for(int i=result.size()-1;i>=0;i--){
			System.out.print(result.get(i)+" ");
		}
	}
}
