package suanfa;

public class Point implements Comparable,Cloneable {
	int x;
	int y;
	public Point(int x,int y){
		this.x=x;
		this.y=y;
	}
	
	public Point(){
		this.x=0;
		this.y=0;
	}
	
	public int compareTo(Point p) {
		if(p.x<this.x)
			return -1;
		else if(p.x>this.x)
			return 1;
		else{
			if(p.y<this.y)
				return -1;
			else if(p.y>this.y)
				return 1;
			else
				return 0;
		}
		
	}

	//@SuppressWarnings("null")
	public Point clone(){
		Point p=new Point();
		p.x=this.x;
		p.y=this.y;
		
		return p;
	}
	


	


}
