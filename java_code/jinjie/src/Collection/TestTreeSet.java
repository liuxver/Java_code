package Collection;
import java.util.*;

public class TestTreeSet {
	public static void main(String[] args){
		Set<String> set=new HashSet<String>();
		set.add("LoVe");
		set.add("xiaomengmeng~");
		set.add("You");
		set.add("ARE");
		System.out.println("The hashSet is :"+set);
		
		TreeSet<String> treeSet=new TreeSet<String>(set);
		System.out.println("Sort tree set :"+treeSet);
		
		System.out.println("first():"+treeSet.first());
		System.out.println("last():"+treeSet.last());
		System.out.println("headSet():"+treeSet.headSet("You"));
		System.out.println("tailSet():"+treeSet.tailSet("xikaomengmeng~"));
		
		
		System.out.println("lower(\"P\"):"+treeSet.lower("P"));
		System.out.println("higher(\"P\"):"+treeSet.higher("P"));
		System.out.println("floor(\"P\"):"+treeSet.floor("P"));
		System.out.println("ceiling(\"P\"):"+treeSet.ceiling("P"));
		System.out.println("pollFirst():"+treeSet.pollFirst());
		System.out.println("pollLast():"+treeSet.pollLast());
		System.out.println("New Tree is :"+treeSet);
		
		
	}
}
