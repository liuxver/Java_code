package √Ê ‘Ã‚;

public class a2 {
	/*
     * @param n: An integer
     * @return: An integer, denote the number of trailing zeros in n!
     */
	public static void main(String[] args){
		System.out.println(trailingZeros(1001171717));
	}
    public static long trailingZeros(long n) {
        // write your code here, try to do it without arithmetic operators.
    	/*long a=1,i=0;
    	for(long b=1;b<=n;b++){
        	//System.out.println(a+"   "+b+"    "+i);
        	long x=b;
        	while(x%10==0){
        		i++;
        		x=x/10;
        	}
        	a=a%10000;
        	x=x%10000;
    		a=a*x;
    		
    		while(a%10==0){
        		i++;
        		//a=a%10000;
        		a=a/10;
        	}
    		//System.out.println(a+"   "+b+"    "+i);
    	}
    	//System.out.println(i);
    	return i;*/
    	int i=0;
    	while(n>0){
    		i+=n/5;
    		n=n/5;
    	}
    	return i;
    }

}
