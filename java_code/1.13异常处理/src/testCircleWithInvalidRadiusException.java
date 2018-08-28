
public class testCircleWithInvalidRadiusException {
	public static void main(String[] args) throws InvalidRadiusException{
		try{
			Circle c1=new Circle(5);
			c1.setRadius(-5);
		}
		catch(InvalidRadiusException ex){
			System.out.println("the invalid radius is "+ex.getRadius());
		}
		
		//System.out.println("Number of objects created: "+CircleWithException.getNumberOfObjects());
	}
}
