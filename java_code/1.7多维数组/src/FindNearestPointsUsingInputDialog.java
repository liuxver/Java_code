import java.util.Scanner;

import javax.swing.JOptionPane;
public class FindNearestPointsUsingInputDialog {
    public static void main(String[] args){
    	//String x;
    	int error=1;
    	//try{
    		String numberOfPointsInString=JOptionPane.showInputDialog("enter a number of points:");
    		int numberOfPoints=(int)Double.parseDouble(numberOfPointsInString);
    	
    		if(numberOfPoints<2){
    			System.out.println("data error");
    			//throw x ="data error!";
    			error=0;
    		}
    //	}
    	if(error==0){
    		return;
    	}
    	
    	Scanner input=new Scanner(System.in);
    	
    	
    	double [][] points=new double[numberOfPoints][2];
    	System.out.print("enter "+numberOfPoints+" points:");
    	for(int i=0;i<numberOfPoints;i++){
    		points[i][0]=input.nextDouble();
    		points[i][1]=input.nextDouble();
    	}
    	
    	int p1=0;
    	int p2=1;
    	
    	double shortestDistance=distance(points[p1][0],points[p1][1],points[p2][0],points[p2][1]);
    	
    	for(int i=0;i<points.length;i++){
    		for(int j=i+1;j<points.length;j++){
    			double distance=distance(points[i][0],points[i][1],points[j][0],points[j][1]);
    			//System.out.println(i+" "+j+":"+distance);
    			if(distance<shortestDistance){
    				p1=i;
    				p2=j;
    				shortestDistance=distance;
    			}
    		}
    	}
    	
    	for(int i=0;i<points.length;i++){
    		for(int j=i+1;j<points.length;j++){
    			double distance=distance(points[i][0],points[i][1],points[j][0],points[j][1]);
    			//System.out.println(i+" "+j+":"+distance);
    			if(distance==shortestDistance){
    				System.out.println("the closest two points are "+"("+points[i][0]+", "+points[i][1]+") and ("+points[j][0]+", "+points[j][1]+")");
    	
    			}
    		}
    	}
    	
    	
    }
    public static double distance(double x1,double y1,double x2,double y2){
    	double x=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
    	//System.out.println(x);
		return x;
	}	
}
