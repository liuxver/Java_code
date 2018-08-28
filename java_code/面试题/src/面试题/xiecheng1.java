package √Ê ‘Ã‚;
/**
*
*author:liuxv
*student_number:15130120185
*email:liuxver444@gmail.com
*email1:1369058574@qq.com

import java.util.*;
public class xiecheng1 {
    public static void main(String[] args){
    	Scanner input=new Scanner(System.in);
    	int n=input.nextInt();
    	int [] a=new int[n];
    	for(int i=0;i<n;i++){
    		a[i]=input.nextInt();
    	}
    	int i=0,j=0;
    	for(;j<n;j++){
    		if(a[j]!=0){
    			a[i]=a[j];
    			i++;
    		}
    	}
    	for(int m=i;i<n;i++){
    		a[i]=0;
    	}
    	for(int k=0;k<n;k++){
    		System.out.println(a[k]);
    	}
    }
}
*/




import java.util.*;
public class xiecheng1 {
    public static void main(String[] args){
    	Scanner input=new Scanner(System.in);
    	int [] a = null;
    	int [] b=null;
    	//System.out.println(input.nextLine());
    	for(int i=0;input.hasNextLine();i++){
    		//System.out.println(a[i]);
    		//a[i]=input.nextInt();
    		String s=input.nextLine();
    		String[] temp=s.split(" ");
    		for(int k=0;k<temp.length;k++){
    			System.out.println(temp[k]);
    		}
    		int m=temp.length;
    		for(int j=0;j<m;j++){
    			a[i*m+j]=Integer.parseInt(temp[i]);
    		}
    		
    		//b[i]=a[i];
    	}
    	
    	
    	int n=a.length;
    	int m=(int) Math.sqrt(n);
    	for(int i=0;i<m;i++){
    		b[i]=a[i];
    	}
    	for(int i=0;i<m;i++){
    		int c[]=null;
    		for(int j=0;j<m;j++){
    			c[j]=b[m*(m-i-1)+j];
    		}
    		for(int k=0;k<m;k++){
    			a[i*m+k]=c[k];
    		}
    		
    	}
    	for(int i=0;i<m;i++){
    		for(int j=0;j<m;j++){
    			System.out.print(a[i*m+j]+" ");
    		}
    		System.out.println();
    	}
    	
    }
}
