package sort;
import java.lang.Comparable;
public class HeapSort {
	public static <E extends Comparable> void heapSort(E[] list){
		//System.out.println("1111111111111");
		Heap<E> heap=new Heap<E>();
		
		for(int i=0;i<list.length;i++)
			heap.add(list[i]);
		
		for(int i=list.length-1;i>=0;i--)
			list[i]=heap.remove();
	}
	
	public static void main(String[] args){
		Integer[] list={2,6,4,2,85,2,4,-2,-8,0,1,5,23,53,2,0};
		HeapSort.<Integer>heapSort(list);
		for(int i=0;i<list.length;i++)
			System.out.print(list[i]+" ");
	}
	
	
	
}
