package 线性表_栈_队列_和优先队列;

public class EvaluateExpression {
    public static void main(String[] args){
    	if(args.length<1){
    		System.out.println("Usage:you enter too few expression");
    	    System.exit(0);	
    	}
    	
    	String expression="";
    	
    	for(int i=0;i<args.length;i++){
    		expression+=args[i];
    	}
    	
    	try{
    		System.out.println(evaluateExpression(expression));
    	}
    	catch(Exception ex){
    		System.out.println("Wrong expression!");
    	}
    	
    	
    }
    
    public static int evaluateExpression(String expression){
    	GenericStack<Integer> operandStack=new GenericStack<Integer>();
    	GenericStack<Character> operatorStack=new GenericStack<Character>();
    	
    	java.util.StringTokenizer tokens=new java.util.StringTokenizer(expression, "()+-*/",true);
    	while(tokens.hasMoreTokens()){
    		String token=tokens.nextToken().trim();
    		//System.out.println(token+"  11111");
    	//	System.out.println(operatorStack.toString());
		//	System.out.println(operandStack.toString());
    		if(token.length()==0)
    			continue;
    		else if(token.charAt(0)=='+'||token.charAt(0)=='-'){
    			while((!operatorStack.isEmpty())&&(operatorStack.peek()=='+'||
    					operatorStack.peek()=='-'||operatorStack.peek()=='*'||operatorStack.peek()=='/')){
    				processAnOperator(operandStack,operatorStack);
    			}
    			
    			operatorStack.push(token.charAt(0));
    			//System.out.println(operatorStack.toString());
    			//System.out.println(operandStack.toString());
    			
    		}
    		else if(token.charAt(0)=='*'||token.charAt(0)=='/'){
    			while((!operatorStack.isEmpty())&&(operatorStack.peek()=='*'||operatorStack.peek()=='/')){
    				processAnOperator(operandStack,operatorStack);
    			}
    			
    			operatorStack.push(token.charAt(0));
    			//System.out.println(operatorStack.toString());
    			//System.out.println(operandStack.toString());
    		}
    		else if(token.trim().charAt(0)=='('){
    			operatorStack.push('(');
    			//System.out.println(operatorStack.toString());
    			//System.out.println(operandStack.toString());
    		}
    		else if(token.trim().charAt(0)==')'){
    			while(operatorStack.peek()!='('){
    				processAnOperator(operandStack,operatorStack);
    			}
    			operatorStack.pop();
    			//System.out.println(operatorStack.toString());
    			//System.out.println(operandStack.toString());
    		}
    		else{
    			operandStack.push(new Integer(token));
    		}
    	}
    	
    	while(!operatorStack.isEmpty()){
    		//System.out.println(operatorStack.toString()+"    111111123456");
			//System.out.println(operandStack.toString()+"     3245678");
    		processAnOperator(operandStack,operatorStack);
    	}
    	
    	return operandStack.pop();
    	
    	
    }
    
    
    public static void processAnOperator(GenericStack<Integer> operandStack,GenericStack<Character> operatorStack){
    	//System.out.println(operatorStack.toString());
		//System.out.println(operandStack.toString());
    	char op=operatorStack.pop();
    	int op1=operandStack.pop();
    	int op2=operandStack.pop();
    	//System.out.println(op);
    	
    	if(op=='+')
    		operandStack.push(op2+op1);
    	else if(op=='-')
    		operandStack.push(op2-op1);
    	else if(op=='*')
    		operandStack.push(op2*op1);
    	else if(op=='/')
    		operandStack.push(op2/op1);
    	
    	//System.out.println(operandStack);
    }
    
    
    
    
}
























