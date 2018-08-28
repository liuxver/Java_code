package Collection;
import java.util.*;
public class TestLinkedHashSet {
	public static void main(String[] args){
		Set<String> set=new LinkedHashSet<String>();
		
		set.add("LoVe");
		set.add("xiaomengmeng~");
		set.add("You");
		set.add("ARE");
		
		System.out.println(set);
		
		for(Object e:set){
			System.out.print(e.toString().toLowerCase()+" ");
		}
	}
}
