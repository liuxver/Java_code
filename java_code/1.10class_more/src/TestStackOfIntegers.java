
public class TestStackOfIntegers {
	public static void main(String[] args){
		StackOfIntegers stack=new StackOfIntegers();
		for(int i=0;i<10;i++){
			stack.push((int)(Math.random()*100));
		}
		
		while(!stack.empty()){
			System.out.println(stack.pop()+"    ");
		}
	}
}
