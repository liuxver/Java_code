package GenericMatrix;

public class IntegerMatrix extends GenericMatrix<Integer>{
	
	protected Integer add(Integer o1,Integer o2){
		return o1+o2;
	}
	
	protected Integer mutiply(Integer o1,Integer o2){
		return o1*o2;
	}
	
	protected Integer zero(){
		return 0;
	}
	
	
}
