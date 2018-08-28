package ͼ;

public interface Graph<V> {
	
    public int getSize();//���ض���ĸ��� 
    public java.util.List<V> getVertices();//����ͼ�еĶ���
    public V getVertex(int index);//����ָ���±�Ķ���
    public int getIndex(V v);//����ָ��������±�
    public java.util.List<Integer> getNeighbors(int index);//����ָ���±궥����ھ�
    public int getDegree(int v);//����ָ�������±�Ķ�
    public int[][] getAdjacencyMatrix();//�����ڽӾ���
    public void printAdjacencyMatrix();//��ӡ�ڽӾ���
    public void printEdges();//��ӡ��
    public AbstractGraph<V>.Tree dfs(int v);//���һ���������������
    public AbstractGraph<V>.Tree bfs(int v);//���һ���������������
    
    //public java.util.List<Integer> getHamiltonianPath(V vertex);
    public java.util.List<Integer> getHamiltonianPath(int v);
    
    
}
