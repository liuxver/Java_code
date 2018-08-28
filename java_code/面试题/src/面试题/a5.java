package ÃæÊÔÌâ;

public class a5 {
	public static void main(String[] args){
		int [] list=new int[] {1,2,3,4,5,6,8,9,10,7};
		System.out.println(kthLargestElement(10,list));
	}
	
	/*
     * @param k : description of k
     * @param nums : array of nums
     * @return: description of return
     */
    public static int kthLargestElement(int k, int[] nums) {
        // write your code here
    	/*int result = 0;
    	for(int i=0;i<k;i++){
    		int temp=nums[0];
    		int index=0;
    		for(int j=1;j<nums.length;j++){
    			if(nums[j]>temp){
    				temp=nums[j];
    				index=j;
    			}
    		}
    		result=nums[index];
    		nums[index]=Integer.MIN_VALUE;
    	}
    	return result;*/
    	
    	return findKthLargestElement(k,nums,0,nums.length-1);
    		
    	
    }
    
    static int findKthLargestElement(int k,int [] nums,int start,int end){
    	
    	if(start==end)
    		return nums[start];
    	int index=partition(nums,start,end);
    	if(end-index+1==k){
    		return nums[index];
    	}
    	else if(end-index+1>k){
    		return findKthLargestElement(k,nums,index+1,end);
    	}
    	else{
    		return findKthLargestElement(k-(end-index+1),nums,start,index-1);
    		
    	}
    }
    
    
    
    static int partition(int[] nums,int start,int end){
    	int x=(start+end)/2;
    	System.out.println("11111111111111111111111111");
    	for(int i=0;i<nums.length;i++){
    		System.out.print(nums[i]+" ");
    	}
    	System.out.println("222222222222222222222222");
    	//
    	//swap(nums[start],nums[x]);
    	//System.out.println(nums[start]+" "+nums[x]);
    	int temp;
    	temp=nums[start];
    	nums[start]=nums[x];
    	nums[x]=temp;
    	//System.out.println(nums[start]+" "+nums[x]);
    	int i=start+1;
    	int j=i;
    	while(i<=end&&j<=end){
    		if(nums[j]<nums[start]){
    			//swap(nums[i],nums[j]);
    			temp=nums[i];
    			nums[i]=nums[j];
    			nums[j]=temp;
    			
    			i++;
    		}
    		j++;
    	}
    	//swap(nums[start],nums[i-1]);
    	/*System.out.println("111111111333333333333333333111");
    	for(int m=0;m<nums.length;m++){
    		System.out.print(nums[m]+" ");
    	}
    	System.out.println("2224444444444444444444422");
    */
    	//System.out.println(nums[start]+" "+nums[i-1]);
    	temp=nums[start];
    	nums[start]=nums[i-1];
    	nums[i-1]=temp;
    	//System.out.println(nums[start]+" "+nums[i-1]);
    /*	System.out.println("11155555555555555555555555555");
    	for(int m=0;m<nums.length;m++){
    		System.out.print(nums[m]+" ");
    	}
    	System.out.println("6666666666666666666666666");
    */
    		return i-1;
    }
    
    
	
	
	
}
