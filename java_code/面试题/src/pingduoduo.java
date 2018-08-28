/**
*
*author:liuxv
*student_number:15130120185
*email:liuxver444@gmail.com
*email1:1369058574@qq.com
*/
import java.util.*;

public class pingduoduo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k=input.nextInt();
        int [] data =new int[101];
        for(int i=0;i<n;i++){
        	int a=input.nextInt();
        	int b=input.nextInt();
        	for(int m=a;m<=b;m++){
        		data[m+50]++;
        	}
        	
        }
        int x = 0,y=0;
        boolean flag=false;
        for(int i=-50;i<=50;i++){
        	if(data[i+50]>=k){
        		flag=true;
        		x=i;
        		break;
        	}
        }
        for(int i=50;i>=-50;i--){
        	if(data[i+50]>=k){
        		y=i;
        		break;
        	}
        }
        if(flag){
        	System.out.println(x+" "+y);
        }
        else{
        	System.out.println("error");
        }
        
    }
}