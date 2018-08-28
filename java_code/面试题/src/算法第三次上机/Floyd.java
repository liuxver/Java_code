package 算法第三次上机;
/**
*
*author:liuxv
*student_number:15130120185
*email:liuxver444@gmail.com
*email1:1369058574@qq.com
*/
public class Floyd {

	public static void main(String[] args){
		int[][] graph=new int[5][5];
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				graph[i][j]=88888;
			}
		}

		graph[0][1]=-1;
		graph[0][2]=3;
		graph[1][2]=3;
		graph[1][3]=2;
		graph[1][4]=2;
		graph[3][1]=1;
		graph[3][2]=5;
		graph[4][3]=-3;
		graph[0][0]=0;
		graph[1][1]=0;
		graph[2][2]=0;
		graph[3][3]=0;
		graph[4][4]=0;
		
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				for(int k=0;k<5;k++){
					if(graph[j][k]>graph[j][i]+graph[i][k]){
						graph[j][k]=graph[j][i]+graph[i][k];
					}
				}
			}
		}
		
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				System.out.print(graph[i][j]>8888?"#":graph[i][j]);
				System.out.print("    ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
	}
}
