

public class Circle1 {
    public double radius;
	public Circle1(){
		radius=1.0;
	}
	
	public Circle1(double newRadius){
		radius=newRadius;
	}
	
	public double getArea(){
		return radius*radius*Math.PI;
	}
}