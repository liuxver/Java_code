
public class ReverseNumbers {
	public static void main(String[] args){
		int[] list1={1,2,3,4,5};
		int[] list2=reverse(list1);
		//System.out.println(list1);
		//System.out.println(list2);
		for(int i=0;i<list1.length;i++){
			System.out.print(list1[i]+" ");
		}
		System.out.println();
		for(int i=0;i<list2.length;i++){
			System.out.print(list2[i]+" ");
		}
 	}
	public static int[] reverse(int[] list){
		int[] result=new int[list.length];
		for(int i=0,j=result.length-1;i<list.length;i++,j--){
			result[j]=list[i];
		}
		return result;
	}
}
