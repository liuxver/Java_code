package suanfa;

public class Pair {
	Point p1=new Point();
	Point p2=new Point();
	
	public Pair(Point p1,Point p2){
		this.p1=p1;
		this.p2=p2;
	}
	
	public double getDistance(){
		return Math.sqrt(Math.abs(p1.x-p2.x)*Math.abs(p1.x-p2.x)+Math.abs(p1.y-p2.y)*Math.abs(p1.y-p2.y));
	}
	
	
	
}
