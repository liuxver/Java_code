package Collection;
import java.util.*;
public class TestMap {
	public static void main(String[] args){
		Map<String,Integer> hashMap=new HashMap<String,Integer>();
		hashMap.put("liuxv", 30);
		hashMap.put("xiaomengmeng~", 31);
		hashMap.put("auyue", 29);
		hashMap.put("yueyue", 28);
		
		System.out.println("Display entries in hashMap:");
		System.out.println(hashMap+" \n");
		
		Map<String,Integer> treeMap=new TreeMap<String,Integer>(hashMap);
		System.out.println("Display entries in ascending order of key :");
		System.out.println(treeMap);
		
		//true 表示按照最后访问顺序构建图
		//如果没有  则按照插入顺序
		Map<String,Integer> linkedHashMap=new LinkedHashMap<String,Integer>(16,0.75f,true);
		linkedHashMap.put("liuxv", 30);
		linkedHashMap.put("xiaomengmeng~", 31);
		linkedHashMap.put("auyue", 29);
		linkedHashMap.put("yueyue", 28);
		
		System.out.println(linkedHashMap);
		
		System.out.println("The age for liuxv is "+linkedHashMap.get("liuxv").intValue());
		
		System.out.println("\n Display entries in linkedHashMap:");
		System.out.println(linkedHashMap);
		
		
	}
}
