
public class TestVoidMethod {
	public static void main(String[] args){
		System.out.print("the grade of 98 is ");
		printGrade(98);
		
		System.out.print("the grade of 78.5 is ");
		printGrade(78.5);
	}
	
	public static void printGrade(double score){
		if(score>100||score<0)
			return;
		if(score>=90.0){
			System.out.println("A");
		}
		else if(score>=80.0){
			System.out.println("B");
		}else if(score>=70.0){
			System.out.println("C");
		}else if(score>=60.0){
			System.out.println("D");
		}else{
			System.out.println("F");
		}
	}
}
