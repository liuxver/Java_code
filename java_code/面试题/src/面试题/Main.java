package √Ê ‘Ã‚;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k=input.nextInt();
        Set<Integer> set=new TreeSet<Integer>();
        
        for(int i=0;i<n;i++){
        	int temp=input.nextInt();
        	set.add(temp);
        }
        //Iterator<Integer> iterator=set.iterator();
        int m=0;
        List<Integer> list=new ArrayList<Integer>();
        
        list.addAll(set);
        
        //System.out.println(list);
        //Boolean [] bool=new Boolean[list.size()];
        int num=0;
        for(int i=0;i<list.size();i++){
        	for(int j=i+1;j<list.size();j++){
        		if((list.get(i)+k==list.get(j))||(list.get(i)-k==list.get(j))){
        			//System.out.println(list.get(i)+" "+list.get(j));
        			num++;
        		}
        	}
        }
        
        
        
        System.out.println(num);
    }
}