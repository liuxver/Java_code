package 算法第二次上机;
/**
*
*author:liuxv
*student_number:15130120185
*email:liuxver444@gmail.com
*email1:1369058574@qq.com
*/
public class LCS {
	
	static void LCS_length(char [] x,char[] y){
		int m=x.length;
		int n=y.length;
		int [][] c=new int[m+1][n+1];
		char [][] d=new char[m+1][n+1];
		
		for(int i=0;i<=m;i++){
			c[i][0]=0;
		}
		for(int i=0;i<=n;i++){
			c[0][i]=0;
		}
		
		for(int i=1;i<=m;i++){
			for(int j=1;j<=n;j++){
				if(x[i-1]==y[j-1]){
					c[i][j]=c[i-1][j-1]+1;
					d[i][j]='↖';
				}
				else if(c[i-1][j]>=c[i][j-1]){
					c[i][j]=c[i-1][j];
					d[i][j]='↑';
				}
				else{
					c[i][j]=c[i][j-1];
					d[i][j]='←';
				}
			}
		}
		
		/*for(int i=0;i<=m;i++){
			for(int j=0;j<=n;j++){
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<=m;i++){
			for(int j=0;j<=n;j++){
				System.out.print(d[i][j]+" ");
			}
			System.out.println();
		}*/
		System.out.print("\nthe best answer:");
		print_LCS(d,x,m,n);
	}
	
	static void print_LCS(char[][] d,char[] x,int i,int j){
		if(i==0||j==0){
			return;
		}
		if(d[i][j]=='↖'){
			//System.out.println(i);
			print_LCS(d,x,i-1,j-1);
			System.out.print(x[i-1]);
		}
		else if(d[i][j]=='↑'){
			//System.out.println("1111111111111111111122222222"+i);
			print_LCS(d,x,i-1,j);
		}
		else{
			//System.out.println("4444444444444444444"+i);
			print_LCS(d,x,i,j-1);
		}
	}
	
	public static void main(String[] args){
		String s="xzyzzyx";
		String s1="zxyyzxz";
		//String s="ABCBDAB";
		//String s1="BDCABA";
		String s2="MAEEEVAKLEKHLMLLRQEYVKLQKKLAETEKRCALLAAQANKESSSESFISRLLAIVAD";
		String s3="MAEEEVAKLEKHLMLLRQEYVKLQKKLAETEKRCTLLAAQANKENSNESFISRLLAIVAG";
		char [] x=s.toCharArray();
		char [] y=s1.toCharArray();
		//System.out.println(x.length);
		//System.out.println(y.length);
		char [] z=s2.toCharArray();
		char [] w=s3.toCharArray();
		LCS_length(x,y);
		LCS_length(z,w);
		
		
	}
	
}
