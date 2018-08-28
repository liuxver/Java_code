import number_function.BinarySearch;
import number_function.InsertionSort;
import number_function.LinearSearch;

public class TestSort{
	public static void main(String[] args){
		int[] list={1,2,3,8,5,6,7,5,6,1,77,55,62,33,58,7,5856,5,4,5,66};
		InsertionSort.insertionSort(list);
		for(int u:list){
			System.out.print(u+" ");
		}
		int i=BinarySearch.binarySearch(list, 58);
		int j=BinarySearch.binarySearch(list, 7);
		int k=LinearSearch.linearSearch(list,5);
		int l=LinearSearch.linearSearch(list, 888);
		System.out.println();
		System.out.println(i+" "+j+" "+k+" "+l);
		
		int[] list1={1,2,3,8,5,6,7,5,6,1,77,55,62,33,58,7,5856,5,4,5,66};
		int[] list2=new int[20];
		System.arraycopy(list1, 0, list2, 0, 18);
		for(int u:list2){
			System.out.print(u+" ");
		}
		System.out.println();
		java.util.Arrays.sort(list2,2,10);
		for(int u:list2){
			System.out.print(u+" ");
		}
		System.out.println(java.util.Arrays.equals(list1,list2));
		java.util.Arrays.fill(list1, 5);
		java.util.Arrays.fill(list1,2,10,8);
		for(int u:list1){
			System.out.print(u+" ");
		}
	}
}
