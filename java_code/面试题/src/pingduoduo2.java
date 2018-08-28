/**
*
*author:liuxv
*student_number:15130120185
*email:liuxver444@gmail.com
*email1:1369058574@qq.com
*/
import java.util.Scanner;
public class pingduoduo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s=input.nextLine();
        String[] time=s.split(":");
        int a =Integer.parseInt(time[0])-12;
        int b=Integer.parseInt(time[1]);
       // System.out.println(a+" " +b);
        //double c=30/60.0;
        
       // System.out.println(c);
        double m=30.0*(a+(b/60.0));
        double n=6.0*b;
       // System.out.println(m+" "+n);
        if(m<n){
            double temp=m;
        	m=n;
        	n=temp;
        }
       // System.out.println(a-b);
        double result=((m-n)>180)?(360-(m-n)):(m-n);//System.out.println(result);
        if((result*100)%100==0){
        	System.out.println((int)result);
        }
        else{
        	//System.out.println(result);
        	int temp=(int) (result*100);
        	//System.out.println(temp);
        	if(temp%10>=5){
        		temp=temp/10;
        		temp=temp+1;
        	}else{
        		temp=temp/10;
        		//System.out.println(temp);
        	}
        	double x=temp/10;
        	//System.out.println(x);
        	System.out.println((double)(temp/10.0));
        }
    }
}