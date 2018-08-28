package Collection;
import java.util.*;

public class TestPriorityQueueDemo {
	public static void main(String[] args){
		PriorityQueue<String> queue1=new PriorityQueue<String>();
		queue1.offer("love");
		queue1.offer("ciaomengmeng!");
		queue1.offer("and");
		queue1.offer("yueyue");
		
		System.out.println("Priority Queue using Comparable:");
		while(queue1.size()>0){
			System.out.print(queue1.remove()+" ");
		}
		
		PriorityQueue<String> queue2=new PriorityQueue<String>(4,Collections.reverseOrder());
		queue2.offer("love");
		queue2.offer("ciaomengmeng!");
		queue2.offer("and");
		queue2.offer("yueyue");
		System.out.println("\n Priority queue using Comparator:");
		while(queue2.size()>0){
			System.out.print(queue2.remove()+" ");
		}
		
	}
}
