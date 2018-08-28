package 算法第三次上机;
/**
*
*author:liuxv
*student_number:15130120185
*email:liuxver444@gmail.com
*email1:1369058574@qq.com
*/
public class SingleSourceShortestPaths {
	
	static int[] answer(Edge[] edges){
		int[] result=new int[5];
		for(int i=0;i<result.length;i++){
			result[i]=88888;
		}
		result[0]=0;
		
		for(int i=0;i<5;i++){
			for(int j=0;j<edges.length;j++){
				if(result[edges[j].v]>result[edges[j].u]+edges[j].cost){
					result[edges[j].v]=result[edges[j].u]+edges[j].cost;
				}
				
			}
		}
		
		
		return result;
	}

	public static void main(String[] args){
		
		
		Edge[] edges=new Edge[8];
		edges[0]=new Edge(0,1,-1);
		edges[1]=new Edge(0,2,3);
		edges[2]=new Edge(1,2,3);
		edges[3]=new Edge(1,3,2);
		edges[4]=new Edge(1,4,2);
		edges[5]=new Edge(3,1,1);
		edges[6]=new Edge(3,2,5);
		edges[7]=new Edge(4,3,-3);
		
		int [] result=answer(edges);
		for(int i=0;i<result.length;i++){
			System.out.print(result[i]+" ");
		}
		
	}
}


class Edge{
	int u,v;
	int cost;
	public Edge(int u,int v,int cost){
		this.u=u;
		this.v=v;
		this.cost=cost;
	}
}
