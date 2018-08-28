/**
*
*author:liuxv
*student_number:15130120185
*email:liuxver444@gmail.com
*email1:1369058574@qq.com
*/
import java.util.Scanner;

public class pingduoduo4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k=input.nextInt();
        int[] data=new int[n];
        int[] result=new int[n-k+1];
        for(int i=0;i<n;i++){
        	data[i]=input.nextInt();
        	if(i>=k-1){
        		int min=data[i-k+1],max=data[i-k+1];
        		for(int j=i-k+1;j<=i;j++){
        			if(data[j]>max){
        				max=data[j];
        			}
        			if(data[j]<min){
        				min=data[j];
        			}
        		}
        		
        		result[i-k+1]=max-min;
        	}
        }
        for(int i=0;i<n-k+1;i++){
        	System.out.print(result[i]+" ");
        }
    }
}