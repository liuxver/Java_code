package 面试题;
/**
*
*author:liuxv
*student_number:15130120185
*email:liuxver444@gmail.com
*email1:1369058574@qq.com
*/
import java.util.*;
public class meituan {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int[] nums=new int[n];
		for(int i=0;i<n;i++){
			nums[i]=input.nextInt();
		}
		for(int j=0;j<n;j++){
			//int m=input.nextInt();
			int num=0;//=digitCounts(n);
			for(int i=0;i<=9;i++){
			//System.out.println(i+" "+digitCounts(i,nums[j]));
				num+=digitCounts(i,nums[j]);
			}
			System.out.println(num-1);
		}
		
	}
	public static int digitCounts(int k, int n) {
        // write your code here
        if(n==0&&k==0){
    		return 1;
    	}
    	
    	
    	int temp=n;
    	int result=0;
    	int pow=1;
    	if(k==0){
    		result++;
    		while(temp>0){
    			result+=(temp/10);
    			temp=temp/10;
    		}
    		return result;
    		
    	}
    	while(temp>0){
    		int i=temp%10;
    		if(i>k){
    			if(!(k==0&&temp/10==0)){//k=0 的情况
    				result+=((temp/10+1)*pow);
    			}
    			
    			
    		}
    		else if(i==k){
    			result+=(temp/10*pow+(n-temp*pow)+1);
    		}
    		else{
    			result+=(temp/10*pow);
    		}
    		//System.out.println(i+" "+temp+" "+result);
    		temp=temp/10;
    		pow*=10;
    	}
    	
    	
    	
    	
    	return result;
    }

}
