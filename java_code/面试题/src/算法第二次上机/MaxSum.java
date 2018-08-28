package 算法第二次上机;
/**
*
*author:liuxv
*student_number:15130120185
*email:liuxver444@gmail.com
*email1:1369058574@qq.com
*/
public class MaxSum {
	static int DPMaxSum(int n,int[] a){
		int sum=a[0];
		int [] b=new int[a.length];
		b[0]=a[0];
		for(int i=1;i<n;++i){
			if(b[i-1]>0){
				b[i]=b[i-1]+a[i];
			}
			else{
				b[i]=a[i];
			}
			
			if(b[i]>sum){
				sum=b[i];
			}
		}
		return sum;
	}
	public static void main(String[] args){
		int[] s={-2,11,-4,13,-5,-2};
		System.out.println(DPMaxSum(s.length,s));
	}
}
