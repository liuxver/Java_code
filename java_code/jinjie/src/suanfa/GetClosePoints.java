package suanfa;
import java.util.*;
public class GetClosePoints {
	private static Point p;

	public static Pair getClosestPair(Point[] points){
		/*if(points.length<2){
			System.out.println("Error");
			System.exit(0);
		}*/
			
		Pair pair=new Pair(points[0],points[1]);
		int x=0;
		int y=0;
		
		double distance=pair.getDistance();
		
		for(int i=0;i<points.length-1;i++){
			for(int j=1;j<points.length;j++){
				Pair pair1=new Pair(points[i],points[j]);
				if(pair1.getDistance()<distance){
					x=i;
					y=j;
				}
				
			}
		}
		
		pair=new Pair(points[x],points[y]);
		return pair;
		
		
	}
	
	public static void  getLR(Point[] points,LinkedList<Point> pL,LinkedList<Point> pR,double distance){
		int m=points.length/2;
		for(Point p:points){
			if((p.x<points[m].x)&&(p.y<points[m].y)&&(points[m].x-p.x<=distance))
				pL.add(p);
			else if(((p.x>points[m].x)||(p.x==points[m].x&&p.y>points[m].y))&&(p.x-points[m].x<=distance)){
				pR.add(p);
			}
		}
		
	}
	
	@SuppressWarnings("null")
	public static Pair find(Point[] points){
		TestPoint.bubbleSort(points);
		int m=points.length/2;
		Point[] points1 = new Point[m];
		Point[] points2=new Point[points.length-m];
		for(int i=0;i<m;i++){
			points1[i]=points[i].clone();
		}
		for(int i=0,j=m;j<points.length;i++,j++){
			points2[i]=points[j].clone();
		}
		//System.arraycopy(points, 0, points1, 0, m);
		//System.arraycopy(points, m, points2, 0, points.length-m);
		
		Pair pair1=getClosestPair(points1);
		Pair pair2=getClosestPair(points2);
		
		double distance=pair1.getDistance()<pair2.getDistance()?pair1.getDistance():pair2.getDistance();
		
		LinkedList<Point> pL=new LinkedList<Point>();
		LinkedList<Point> pR=new LinkedList<Point>();
		
		getLR(points,pL,pR,distance);
		
		Point[] points3=null;
		int i=0;
		for(i=0;i<pL.size();i++){
			points[i]=pL.remove();
		}
		for(int j=0;j<pR.size();j++,i++){
			points[i]=pR.remove();
		}
		
		Pair pair3=getClosestPair(points3);
		
		if(pair3.getDistance()<distance)
			return pair3;
		else{
			return pair1.getDistance()<pair2.getDistance()?pair1:pair2;
		}
		
		
		
		
	}
	
	
	public static void main(String[] args){
		Point[] points=new Point[5];
		points[0]=new Point(1,2);
		points[1]=new Point(1,4);
		points[2]=new Point(1,-1);
		points[3]=new Point(2,2);
		points[4]=new Point(3,2);
		
		Pair p=find(points);
		
		System.out.println("the less is :");
		System.out.println(p.p1.x+"    "+p.p1.y);
		System.out.println(p.p2.x+"    "+p.p2.y);
		
	}
	
	
}
