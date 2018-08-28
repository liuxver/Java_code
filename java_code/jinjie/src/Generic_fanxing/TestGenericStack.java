package Generic_fanxing;

public class TestGenericStack {
	public static void main(String[] args){
		GenericStack<String> stack1=new GenericStack<String>();
		stack1.push("xiaomengmeng");
		stack1.push("liuxv");
		while(!(stack1.isEmpty())){
			System.out.print(stack1.pop()+" ");
		}
		
	}
	
	
}
