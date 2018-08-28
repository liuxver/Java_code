package 骑士旅行问题;
import java.util.*;
public abstract class AbstractGraph<V> implements Graph<V> {
    protected List<V> vertices;
    protected List<List<Integer>> neighbors;//邻接链表
    
    //四个构造函数
    protected AbstractGraph(int[][] edges,V[] vertices){
    	this.vertices=new ArrayList<V>();
    	for(int i=0;i<vertices.length;i++){
    		this.vertices.add(vertices[i]);
    	}
    	createAdjacencyLists(edges,vertices.length);
    }
    
    protected AbstractGraph(List<Edge> edges,List<V> vertices){
    	this.vertices=vertices;
    	createAdjacencyLists(edges,vertices.size());
    }
    
    protected AbstractGraph(List<Edge> edges,int numberOfVertices){
    	vertices=new ArrayList<V>();
    	for(int i=0;i<numberOfVertices;i++){
    		vertices.add((V)(new Integer(i)));//vertices 是 {0,1,2,3}，不是 是根据 V类型做强制转换的 
    	}
    	createAdjacencyLists(edges,numberOfVertices);
    }
    
    protected AbstractGraph(int[][] edges,int numberOfVertices){
        vertices=new ArrayList<V>();
        for(int i=0;i<numberOfVertices;i++){
        	vertices.add((V)(new Integer(i)));
        }
        createAdjacencyLists(edges,numberOfVertices);
    }
    
    
    
    
    
    //两个构造函数使用的函数
    private void createAdjacencyLists(int[][] edges,int numberOfVertices){
    	neighbors=new ArrayList<List<Integer>>();
    	for(int i=0;i<numberOfVertices;i++){
    		neighbors.add(new ArrayList<Integer>());
    	}
    	
    	for(int i=0;i<edges.length;i++){
    		int u=edges[i][0];
    		int v=edges[i][1];
    		neighbors.get(u).add(v);
    	}
    }
    
    public void createAdjacencyLists(List<Edge> edges,int numberOfVertices){
    	neighbors=new ArrayList<List<Integer>>();
    	for(int i=0;i<numberOfVertices;i++){
    		neighbors.add(new ArrayList<Integer>());
    	}
    	
    	for(Edge edge:edges){
    		neighbors.get(edge.u).add(edge.v);
    	}
    }
    
    
    //接口实现
    public int getSize(){
    	return vertices.size();
    }
    
    public List<V> getVertices(){
    	return vertices;
    }
    
    public V getVertex(int index){
    	return vertices.get(index);
    }
    
    
    public int getIndex(V v){
    	return vertices.indexOf(v);
    }
    
    public List<Integer> getNeighbors(int index){
    	return neighbors.get(index);
    }
    
    public int getDegree(int v){
    	return neighbors.get(v).size();
    }
    
    public int[][] getAdjacencyMatrix(){
    	int[][] adjacencyMatrix=new int[getSize()][getSize()];
    	
    	for(int i=0;i<neighbors.size();i++){
    		for(int j=0;j<neighbors.get(i).size();j++){
    			int v=neighbors.get(i).get(j);
    			adjacencyMatrix[i][v]=1;
    		}
    	}
    	return adjacencyMatrix;
    }
    
    public void printAdjacencyMatrix(){
    	int[][] adjacencyMatrix=getAdjacencyMatrix();
    	for(int i=0;i<adjacencyMatrix.length;i++){
    		for(int j=0;j<adjacencyMatrix[0].length;j++){//怀疑这个地方有问题 0  应该改成 i
    			System.out.print(adjacencyMatrix[i][j]+" ");
    		}
    		System.out.println();
    	}
    }
    
    public void printEdges(){
    	for(int u=0;u<neighbors.size();u++){
    		System.out.print("Vertex "+u+" :");
    		for(int j=0;j<neighbors.get(u).size();j++){
    			System.out.print("("+u+","+neighbors.get(u).get(j)+")");
    		}
    		System.out.println();
    	}
    }
    
    
   
    
    public static class Edge{
    	public int u;
    	public int v;
    	
    	public Edge(int u,int v){
    		this.u=u;
    		this.v=v;
    	}
    }
    
    public Tree dfs(int v){
    	List<Integer> searchOrders=new ArrayList<Integer>();
    	int[] parent=new int[vertices.size()];
    	for(int i=0;i<parent.length;i++){
    		parent[i]=-1;
    	}
    	
    	boolean[] isVisited=new boolean[vertices.size()];
    	dfs(v,parent,searchOrders,isVisited);
    	return new Tree(v,parent,searchOrders);
    }
    
    private void dfs(int v,int[] parent,List<Integer> searchOrders,boolean[] isVisited){
    	searchOrders.add(v);
    	isVisited[v]=true;
    	
    	for(int i:neighbors.get(v)){
    		if(!isVisited[i]){
    			parent[i]=v;
    			dfs(i,parent,searchOrders,isVisited);
    		}
    	}
    }
    
    
    public Tree bfs(int v){
    	List<Integer> searchOrders=new ArrayList<Integer>();
    	int[] parent=new int[vertices.size()];
    	for(int i=0;i<parent.length;i++){
    		parent[i]=-1;
    	}
    	
    	java.util.LinkedList<Integer> queue=new java.util.LinkedList<Integer>();
    	boolean[] isVisited=new boolean[vertices.size()];
    	queue.offer(v);
    	isVisited[v]=true;
    	while(!queue.isEmpty()){
    		int u=queue.poll();
    		searchOrders.add(u);
    		for(int w:neighbors.get(u)){
    			if(!isVisited[w]){
    				queue.offer(w);
    				parent[w]=u;
    				isVisited[w]=true;
    			}
    		}
    	}
    	return new Tree(v,parent,searchOrders);
    }
    
    public List<Integer> getHamiltonianPath(V vertex){//为指定的顶点对象V寻找哈密尔顿路径
    	return getHamiltonianPath(getIndex(vertex));//getindex 返回对象的指定下标
    }
  
 
    
    public List<Integer> getHamiltonianPath(int v){//为指定顶点下标寻找哈密尔顿路径
    	System.out.println(getSize());
    	int[] next=new int[getSize()];
    	for(int i=0;i<next.length;i++){
    		next[i]=-1;
    	}
    	
    	boolean[] isVisited=new boolean[getSize()];
    	List<Integer> result=null;
    	System.out.println("11111111111111111");
    	for(int i=0;i<getSize();i++){
    		System.out.println(i);
    		//每个节点的临界线性表按照度数的顺序进行重排，所以度数小的顶点优先访问
    		//System.out.println(x);
    		reorderNeighborsBasedOnDegree(neighbors.get(i));
    		
    	}
    	System.out.println("11111111111111111");
    	if(getHamiltonianPath(v,next,isVisited)){
    		result=new ArrayList<Integer>();
    		int vertex=v;
    		while(vertex!=-1){
    			result.add(vertex);
    			vertex=next[vertex];
    		}
    	}
    	
    	
    	
    	System.out.println(result);
    	return result;
    }
    
    private void reorderNeighborsBasedOnDegree(List<Integer> list){//每个节点的临界线性表按照度数的顺序进行重排，所以度数小的顶点优先访问
    	for(int i=list.size()-1;i>=1;i--){
            int currentMaxDegree=getDegree(list.get(0));
            int currentMaxIndex=0;
            for(int j=1;j<=i;j++){
            	if(currentMaxDegree<getDegree(list.get(j))){
            		currentMaxDegree=getDegree(list.get(j));
            		currentMaxIndex=j;
            	}
            }
            
            if(currentMaxIndex!=i){
            	int temp=list.get(currentMaxIndex);
            	list.set(currentMaxIndex, list.get(i));
            	list.set(i, temp);
            }
    	}
    }
    	
    private boolean getHamiltonianPath(int v,int[] next,boolean[] isVisited){//寻找由顶点v开始的哈密尔顿路径  递归调用
    	isVisited[v]=true;
    	if(allVisited(isVisited)){
    		return true;
    	}
    	
    	for(int i=0;i<neighbors.get(v).size();i++){
    		int u=neighbors.get(v).get(i);
    		if((!isVisited[u])&&getHamiltonianPath(u,next,isVisited)){
    			next[v]=u;
    			return true;
    		}
    	}
    	
    	isVisited[v]=false;
    	return false;
    	
    }
    
    private boolean allVisited(boolean[] isVisited){
    	boolean result=true;
    	for(int i=0;i<getSize();i++){
    		result=result&&isVisited[i];
    	}
    	
    	return result;
    }
    
    
    
    
    
    
    public class Tree{
    	private int root;
    	private int[] parent;//顶点的父节点
    	private List<Integer> searchOrders;//遍历定点的顺序
    	
    	public Tree(int rppt,int[] parent,List<Integer> searchOrders){
    		this.root=root;
    		this.parent=parent;
    		this.searchOrders=searchOrders;
    		
    	}
    	
    	public Tree(int root,int[] parent){
    		this.root=root;
    		this.parent=parent;
    		
    	}
    	
    /*	public BinaryTree<Integer> toBinaryTree(){
    		BinaryTree<Integer> t=new BinaryTree<Integer>();
    		for(int i=0;i<searchOrders.size();i++){
    			t.insert(searchOrders.get(i));
    		}
    		return t;
    	}
    	*/
    	public int getRoot(){
    		return root;
    	}
    	
    	
    	public int getParent(int v){//返回指定下标的父节点
    		return parent[v];
    	}
    	
    	public List<Integer> getSearchOrders(){//返回被搜索顶点的顺序
    		return searchOrders;
    	}
    	
    	public int getNumberOfVerticesFound(){//返回被搜索顶点的个数
    		return searchOrders.size();
    	}
    	
    	public List<V> getPath(int index){//返回从根节点到指定顶点下标节点的路径
    		ArrayList<V> path=new ArrayList<V>();
    		
    		do{
    			path.add(vertices.get(index));
    			index=parent[index];
    		}
    		while(index!=-1);
    		
    		return path;
    	}
    	
    	public void printPath(int index){//打印从根节点到指定节点的路径
    		List<V> path=getPath(index);
    		System.out.print("A path from "+vertices.get(root)+" to "+vertices.get(index)+" : ");
    		for(int i=path.size()-1;i>=0;i--){
    			System.out.print(path.get(i)+" ");
    		}
    	}
    	
    	public void printTree(){//打印从根节点到所有边的树
    		System.out.println("Root is "+vertices.get(root));
    		System.out.print("Edges: ");
    		for(int i=0;i<parent.length;i++){
    			if(parent[i]!=-1){
    				System.out.print("("+vertices.get(parent[i])+" , "+vertices.get(i)+" ) ");
    			}
    		}
    		System.out.println();
    		
    	}
    	
    	
    }
    
    
}
