package 图;

public interface Graph<V> {
	
    public int getSize();//返回顶点的个数 
    public java.util.List<V> getVertices();//返回图中的顶点
    public V getVertex(int index);//返回指定下标的对象
    public int getIndex(V v);//返回指定顶点的下标
    public java.util.List<Integer> getNeighbors(int index);//返回指定下标顶点的邻居
    public int getDegree(int v);//返回指定顶点下标的度
    public int[][] getAdjacencyMatrix();//返回邻接矩阵
    public void printAdjacencyMatrix();//打印邻接矩阵
    public void printEdges();//打印边
    public AbstractGraph<V>.Tree dfs(int v);//获得一个深度优先搜索树
    public AbstractGraph<V>.Tree bfs(int v);//获得一个广度优先搜索树
    
    //public java.util.List<Integer> getHamiltonianPath(V vertex);
    public java.util.List<Integer> getHamiltonianPath(int v);
    
    
}
