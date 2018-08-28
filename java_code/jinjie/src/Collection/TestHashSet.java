package Collection;
import java.util.*;

public class TestHashSet {
	public static void main(String[] args){
		Set<String> set=new HashSet<String>();
		
		set.add("london");
		set.add("liuxv");
		set.add("xiaomengmeng~");
		set.add("xuaner");
		set.add("yinianshinian");
		
		System.out.println(set);
		
		Iterator<String> iterator=set.iterator();
		
		while(iterator.hasNext()){
			System.out.print(iterator.next().toUpperCase()+" ");
		}
		
	}
}
