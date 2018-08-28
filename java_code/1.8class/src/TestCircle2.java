
public class TestCircle2 {
	public static void main(String[] args){
		System.out.println("before create objects:");
		System.out.println("the number of Circle objects is "+Circle2.numberOfObjects);
		Circle2 c1=new Circle2();
		System.out.println("\n After creating c1:");
		System.out.println("c1:radius ("+c1.radius+") and number of Circle objects ("+c1.numberOfObjects+")");
		
		Circle2 c2=new Circle2();
		c1.radius=9;
		
		System.out.println("After creating c2 and modifying c1 :");
		System.out.println("c1:radius ("+c1.radius+") and number of Circle objects ("+c1.numberOfObjects+")");
		System.out.println("c2:radius ("+c2.radius+") and number of Circle objects ("+c2.numberOfObjects+")");
	}
}
