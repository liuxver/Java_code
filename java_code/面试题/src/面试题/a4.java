package ������;


public class a4 {
	public static void main(String[] args){
		System.out.println(nthUglyNumber(9));
	}
	
	/**
     * @param n: An integer
     * @return: the nth prime number as description.
     */
   // @SuppressWarnings("null")
	public static int nthUglyNumber(int n) {
        // write your code here
    	//int result=1;
    	int[] r=new int[n];
    	r[0]=1;
    	//java.util.ArrayList<Integer> result=new java.util.ArrayList<>();
    	int a1,a2,a3;
    	a1=0;
    	a2=0;
    	a3=0;
    	for(int i=1;i<n;i++){
    		
    		
    		//System.out.println(a1+" "+a2+" "+a3);
    		r[i]=Math.min(Math.min(r[a1]*2, r[a2]*3),r[a3]*5);
    		
    		//System.out.println(r[i]);
    		
    		
    		
    		/*�ҳ�������2,3,5���ĸ����Ӽ������ugly[i]����Ȼ���п����ж�����ӣ�
    		 * ����ugly[num_2]*2 == ugly[num_3]*3ʱ����Ҫ��num_2++������Ҫʹnum_3++��
    		 * ������ﲻ��ʹ��if-else��Ҫȫ��ʹ��if�����жϡ� 
			*/
    		if(r[i]/r[a1]==2){
    			a1++;
    		}
    		if(r[i]/r[a2]==3){
    			a2++;
    		}
    		if(r[i]/r[a3]==5){
    			a3++;
    		}
    		
    		
    	}
    	
    	
    	return r[n-1];
    }

}
