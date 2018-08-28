/**
*
*author:liuxv
*student_number:15130120185
*email:liuxver444@gmail.com
*email1:1369058574@qq.com
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        double [][] m=new double[n][4];
        for(int i=0;i<4;i++){
        	for(int j=0;j<n;j++){
        		m[j][i]=input.nextDouble();
        	}
        }
        int num=1;
        for(int i=0;i<n;i++){
        	int temp=1;
        	for(int j=i+1;j<n;j++){
        		if(isOrNot(m[i],m[i+1])){
        			temp++;
        		}
        	}
        	if(temp>num){
        		num=temp;
        	}
        }
        System.out.println(num);
        
        
        
    }
    static boolean isOrNot(double[] a,double[] b){
    	if((a[0]>b[0]&&a[0]<b[2])||((b[0]>a[0])&&(b[0]<a[2]))){
    		return true;
    	}
    	else
    		return false;
    }
}