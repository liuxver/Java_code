/**
*
*author:liuxv
*student_number:15130120185
*email:liuxver444@gmail.com
*email1:1369058574@qq.com
*/
import java.util.Scanner;

public class pingduoduo3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [][] p=new int[n][2];
        for(int i=0;i<n;i++){
        	p[i][0]=input.nextInt();
        	p[i][1]=input.nextInt();
        	
        }
        int result=0;
        for(int i=0;i<n-2;i++){
        	for(int j=i+1;j<n-1;j++){
        		for(int k=j+1;k<n;k++){
        			double m=Math.sqrt(Math.abs(p[i][0]-p[j][0])*Math.abs(p[i][0]-p[j][0])+Math.abs(p[i][1]-p[j][1])*Math.abs(p[i][1]-p[j][1]));
        			double m1=Math.sqrt(Math.abs(p[i][0]-p[k][0])*Math.abs(p[i][0]-p[k][0])+Math.abs(p[i][1]-p[k][1])*Math.abs(p[i][1]-p[k][1]));
        			double m2=Math.sqrt(Math.abs(p[k][0]-p[j][0])*Math.abs(p[k][0]-p[j][0])+Math.abs(p[k][1]-p[j][1])*Math.abs(p[k][1]-p[j][1]));
        			if(m+m1>m2||m+m2>m1||m1+m2>m){
        				result++;
        			}
        			
        		}
        	}
        }
        System.out.println(result);
        
    }
}