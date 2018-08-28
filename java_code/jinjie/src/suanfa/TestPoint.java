package suanfa;
import sort.QuickSort;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestPoint {
	public static void main(String[] args){
		Point[] points=new Point[5];
		points[0]=new Point(1,2);
		points[1]=new Point(1,4);
		points[2]=new Point(1,-1);
		points[3]=new Point(2,2);
		points[4]=new Point(3,2);
		
		//List<Point> points1=new ArrayList<Point>();
		bubbleSort(points);
		
		
		
		
		for(Point p:points)
			System.out.println(p.x+" "+p.y);
	}
	
	public static void bubbleSort(Point[] list){
		boolean needNextPass=true;
		
		for(int i=1;i<list.length&&needNextPass;i++){
			needNextPass=false;
			for(int j=0;j<list.length-i;j++){
				if(list[j].compareTo(list[j+1])<0){
					Point temp=list[j];
					list[j]=list[j+1];
					list[j+1]=temp;
					needNextPass=true;
				}
				
			}
		}
	}
}
