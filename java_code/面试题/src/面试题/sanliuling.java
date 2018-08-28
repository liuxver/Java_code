package √Ê ‘Ã‚;
/**
*
*author:liuxv
*student_number:15130120185
*email:liuxver444@gmail.com
*email1:1369058574@qq.com

import java.util.*;
public class sanliuling {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		for(int i=0;i<n;i++){
			int m=input.nextInt();
			int sum=0;
			int [][] data=new int[m][4];
			for(int j=0;j<m;j++){
				data[j][0]=input.nextInt();
				data[j][1]=input.nextInt();
				data[j][2]=input.nextInt();
				data[j][3]=input.nextInt();
				sum=sum+(Math.abs((data[j][2]-data[j][0]+1))*Math.abs((data[j][3]-data[j][1]+1)));
				
				
			}
			System.out.println(sum);
			
			
			
			
		}
	}
}
*/

import java.util.*;
public class sanliuling {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		for(int i=0;i<n;i++){
			int a=input.nextInt();
			int b=input.nextInt();
			int c=input.nextInt();
			int sum=0;
			int min=a;
			if(a>b){
				min=b;
			}
			if(a>c){
				min=c;
			}
			
			if(min==b){
				sum+=b;
				a=a-b;
				c=c-b;
				int m=(a+c)/3;
				if(m>a){
					sum+=a;
					System.out.println(sum);
					continue;
				}
				if(m>c){
					sum+=c;
					System.out.println(sum);
					continue;
				}
				sum+=m;
				System.out.println(sum);
				continue;
			}
			
			if(min==c){
				sum+=c;
				a=a-c;
				b=b-c;
				int m=(a+b)/3;
				if(m>a){
					sum+=a;
					System.out.println(sum);
					continue;
				}
				if(m>b){
					sum+=b;
					System.out.println(sum);
					continue;
				}
				sum+=m;
				System.out.println(sum);
				continue;
			}
			
			if(min==a){
				sum+=a;
				c=c-a;
				b=b-a;
				int m=(c+b)/3;
				if(m>c){
					sum+=c;
					System.out.println(sum);
					continue;
				}
				if(m>b){
					sum+=b;
					System.out.println(sum);
					continue;
				}
				sum+=m;
				System.out.println(sum);
				continue;
			}
			
			
			
			
		}
	}
}




