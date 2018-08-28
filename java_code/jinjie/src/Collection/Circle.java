package Collection;

public class Circle extends GeometricObject{
    private double radius;
	
	public Circle(){
		
	}
	
	public Circle(double radius) throws InvalidRadiusException{
		setRadius(radius);
	}
	
	public Circle(double radius,String color,boolean filled) throws InvalidRadiusException{
		setRadius(radius);
		setColor(color);
		setFilled(filled);
	}
	
	public double getRadius(){
		return radius;
	}
	
	public void setRadius(double radius) throws InvalidRadiusException{
		if(radius>=0)
			this.radius=radius;
		else{
			throw new InvalidRadiusException(radius);
		}
	}
	
	public double getArea(){
		return radius*radius*Math.PI;
	}
	
	public double getDiameter(){
		return 2*radius;
	}
	
	public double getPerimeter(){
		return 2*radius*Math.PI;
	}
	
	public void printCircle(){
		System.out.println("The circle is created "+super.getDateCreated()+" and the radius is "+radius);
	}
}
