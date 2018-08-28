package 面试题;

public class a3 {
	public static void main(String[] args){
		System.out.println(digitCounts(0,19));
	}
	
	/*
     * @param : An integer
     * @param : An integer
     * @return: An integer denote the count of digit k in 1..n
     */
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
