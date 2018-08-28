import number_function.BinarySearch;
import number_function.LinearSearch;

public class TestSearch {
	public static void main(String[] args){
		int[] list={1,2,3,8,5,6,7,5,6,1,77,55,62,33,58,7,5856,5,4,5,66};
		int i=BinarySearch.binarySearch(list, 58);
		int j=BinarySearch.binarySearch(list, 7);
		int k=LinearSearch.linearSearch(list,5);
		int l=LinearSearch.linearSearch(list, 888);
		System.out.println(i);
		System.out.println(k);
	}
}
