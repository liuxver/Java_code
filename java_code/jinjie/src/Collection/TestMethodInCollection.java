package Collection;
import java.util.*;
public class TestMethodInCollection {
	public static void main(String[] args){
		Set<String> set=new HashSet<String>();
		set.add("london");
		set.add("liuxv");
		set.add("xiaomengmeng~");
		set.add("xuaner");
		set.add("yinianshinian");
		
		System.out.println("\n set1 is "+set);
		System.out.println(set.size()+" elements in set.");
		
		set.remove("london");
		System.out.println("\n set1 is "+set);
		System.out.println(set.size()+" elements in set.");
		
		Set<String> set2=new HashSet<String>();
		set2.add("love");
		set2.add("liuxv");
		set.add("xuaner");
		
		System.out.println("\n set2 is "+set2);
		System.out.println(set2.size()+" elements in set2");
		
		System.out.println("\n Is liuxv in set2?"+set2.contains("liuxv"));
		
		
		set.addAll(set2);
		System.out.println("\n After adding set2 to set,set is "+set);
		
		set.removeAll(set2);
		System.out.println("After remove set2 from set,set is "+set);
		
		set.retainAll(set2);
		System.out.println("After removing common elements in set2 from set,set is"+set);
		
	}
}
