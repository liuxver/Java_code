package sort;
/**
*
*author:liuxv
*student_number:15130120185
*email:liuxver444@gmail.com
*email1:1369058574@qq.com
*/
public class InsertSort {
	public static void main(String[] args){
		int [] nums=new int[]{-3,4,1,2,4,39,3,2,-78};
		insertSort(nums);
		for(int i=0;i<nums.length;i++){
			System.out.print(nums[i]+" ");
		}
		
	}
	static void insertSort(int[] nums){
		for(int j=1;j<nums.length;j++){
			int i=j;
			if(nums[i]<nums[i-1]){
				//int temp=nums[i];
				while(nums[i]<nums[i-1]){
					//System.out.println(nums[i]+" "+i);
					int temp=nums[i];
					nums[i]=nums[i-1];
					nums[i-1]=temp;
					if(i==1)
						break;
					i--;
				}
			}
		}
	}
}
