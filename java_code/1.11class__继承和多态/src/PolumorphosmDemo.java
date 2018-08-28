
public class PolumorphosmDemo {
	public static void main(String[] args){
		displayObject(new Circle4(1,"red",false));
		displayObject(new Rectangle1(1,1,"black",true));
	}
	
	public static void displayObject(GeometricObject1 object){
		System.out.println("Greated on "+object.getDateCreated()+" . color is "+object.getColor());
	}
}
