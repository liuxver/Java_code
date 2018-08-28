
public class TestGeometricObject {
	private static final GeometricObject object1 =new Circle();

	public static void main(String[] args) throws InvalidRadiusException{
		try{
			((Circle) object1).setRadius(-5);
		}
		catch(InvalidRadiusException ex){
			System.out.println(ex.getRadius());
		}
		
		GeometricObject object2=new Rectangle(5,3);
		
		System.out.println("The two objects hava the same area?"+equalArea(object1,object2));
		
		displayGeometricObject(object1);
		displayGeometricObject(object2);
		
	}
	
	
	public static boolean equalArea(GeometricObject object1,GeometricObject object2){
		return object1.getArea()==object2.getArea();
	}
	
	public static void displayGeometricObject(GeometricObject object){
		System.out.println();
		System.out.println("the area is "+object.getArea());
		System.out.println("The perimeteri is "+object.getPerimeter());
	}
	
}
