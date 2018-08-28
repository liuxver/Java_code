package √Ê ‘Ã‚;
/**
*
*author:liuxv
*student_number:15130120185
*email:liuxver444@gmail.com
*email1:1369058574@qq.com
*/
import java.util.Scanner;

public class wangyi3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int n=input.nextInt();
        int [][] work=new int[m][2];
        for(int i=0;i<m;i++){
        	work[i][0]=input.nextInt();
        	work[i][1]=input.nextInt();
        	
        }
        int [] ai=new int[n];
        for(int i=0;i<n;i++){
        	ai[i]=input.nextInt();
        }
        
        int [] money=new int[n];
        for(int i=0;i<n;i++){
        	int temp=0;
        	for(int j=0;j<m;j++){
        		if(ai[i]>=work[j][0]){
        			if(work[j][1]>temp){
        				temp=work[j][1];
        			}
        		}
        	}
        	//money[i]=temp;
        	System.out.println(temp);
        }
    }
}












