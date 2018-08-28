package Collection;
import java.util.*;

public class TestArrayAndLinkedList {
	public static void main(String[] args){
		List<Integer> arrayList=new ArrayList<Integer>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(1);
		arrayList.add(-2);
		arrayList.add(2);
		System.out.println(arrayList);
		arrayList.add(0,10);
		arrayList.add(3,30);
		arrayList.add((arrayList.size()),50);
		System.out.println(arrayList.size());
		System.out.println(arrayList);
		
		LinkedList<Object> linkedList=new LinkedList<Object>(arrayList);
		linkedList.add(1,"red");
		System.out.println("Linked List:"+linkedList);
		linkedList.removeLast();
		linkedList.addFirst("Green");
		
		System.out.println("Display the list forward :");
		ListIterator<Object> listIterator=linkedList.listIterator();
		while(listIterator.hasNext()){
			System.out.print(listIterator.next()+" ");
		}
		System.out.println();
		
		System.out.println("Display the list backward:");
		//实现反向遍历
		listIterator=linkedList.listIterator(linkedList.size());
		while(listIterator.hasPrevious()){
			System.out.print(listIterator.previous()+" ");
		}
		
	}
}
