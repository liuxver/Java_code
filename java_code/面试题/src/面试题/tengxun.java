package √Ê ‘Ã‚;

import java.util.Scanner;
public class tengxun {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		for(int i=0;i<n;i++){
			int a1=input.nextInt();
			int b1=input.nextInt();
			int c1=input.nextInt();
			int d1=input.nextInt();
			int a2=input.nextInt();
			int b2=input.nextInt();
			int c2=input.nextInt();
			int d2=input.nextInt();
			double ab=Math.sqrt((a1-b1)*(a1-b1)+(a2-b2)*(a2-b2));
			//System.out.println((c1-b1)*(c1-b1)+(c2-b2)*(c2-b2));
			double bc=Math.sqrt((c1-b1)*(c1-b1)+(c2-b2)*(c2-b2));
			double cd=Math.sqrt((c1-d1)*(c1-d1)+(c2-d2)*(c2-d2));
			double da=Math.sqrt((a1-d1)*(a1-d1)+(a2-d2)*(a2-d2));
			
			double ac=Math.sqrt((a1-c1)*(a1-c1)+(a2-c2)*(a2-c2));
			double bd=Math.sqrt((b1-d1)*(b1-d1)+(b2-d2)*(b2-d2));
			
			//System.out.println(Math.pow(ac, 2));
			//System.out.println(ab+" "+bc+" "+cd+" "+da+" "+ac+" "+bd);
			
			double [] x=new double[]{ab,bc,cd,da,ac,bd};
			for(int j=1;j<x.length;j++){
				for(int p=0;p<x.length-1;p++){
					if(x[p]>x[p+1]){
						double temp=x[p];
						x[p]=x[p+1];
						x[p+1]=temp;
					}
				}
			}
			
			
			if(x[0]==x[1]&&x[1]==x[2]&&x[2]==x[3]){
				if(x[4]==x[5]){//&&x[4]*x[4]==2*x[0]*x[0]){
					System.out.println("yes");
					continue;
				}
			}
			System.out.println("no");
				
			
			
		}
	}

}
