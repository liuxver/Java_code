package ÃæÊÔÌâ;

public class a6 {
	public static void main(String[] args){
		int [] a={1,2,3,5};
		int [] b={2,2,3,4};
		
	}
	/**
     * @param A: sorted integer array A
     * @param B: sorted integer array B
     * @return: A new sorted integer array
     */
    public int[] mergeSortedArray(int[] A, int[] B) {
        // write your code here
    	int [] list=new int[A.length+B.length];
    	int i=0,j=0,k=0;
    	for(;i<A.length&&j<B.length;k++){
    		if(A[i]<B[j]){
    			list[k]=A[i];
    			i++;
    		}
    		else if(A[i]>B[j]){
    			list[k]=B[j];
    			j++;
    		}
    	}
    	if(i<A.length){
    		for(;i<A.length;i++,k++){
    			list[k]=A[i];
    		}
    	}
    	if(j<B.length){
    		for(;j<B.length;j++,k++){
    			list[k]=B[j];
    		}
    	}
    	
    	return list;
    }
}
