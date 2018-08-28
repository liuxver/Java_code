package Generic_fanxing;

public class WildCardDemo2 {
	public static void main(String[] args){
		GenericStack<Integer> intStack=new GenericStack<Integer>();
		intStack.push(1);
		intStack.push(2);
		intStack.push(5);
		print(intStack);
	}
	
	public static void print(GenericStack<?> stack){
		while(!stack.isEmpty())
			System.out.print(stack.pop()+" ");
	}
	
	
}
