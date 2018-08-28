package Í¼;

public class TestGraph {
    public static void main(String[] args){
    	String[] vertices={"a","s","d","f","g","h","j","k","l","z","x","c"};
    	int[][] edges={
    			{0,1},{0,3},{0,5},
    			{1,0},{1,2},{1,3},
    			{2,1},{2,3},{2,4},{2,10},
    			{3,0},{3,1},{3,2},{3,4},{3,5},
    			{4,2},{4,3},{4,5},{4,7},{4,8},{4,10},
    			{5,0},{5,3},{5,4},{5,6},{5,7},
    			{6,5},{6,7},
    			{7,4},{7,5},{7,6},{7,8},
    			{8,4},{8,7},{8,9},{8,10},{8,11},
    			{9,8},{9,11},
    			{10,2},{10,4},{10,8},{10,11},
    			{11,8},{11,9},{11,10},
    	};
    	
    	Graph<String> graph1=new UnweightedGraph<String>(edges,vertices);
    	System.out.println("The number of vertices in graph1: "+graph1.getSize());
    	System.out.println("The vertex with 1 is "+graph1.getVertex(1));
    	System.out.println("The index for g is  :"+graph1.getIndex("g"));
    	System.out.println("The degrees for graph1[0] is : "+graph1.getDegree(0));
    	System.out.println("The edges for graph1 is :");
    	graph1.printEdges();
    	System.out.println("\nThe matrix for graph1 is :");
    	graph1.printAdjacencyMatrix();
    	
    	
    	String[] names={"liuxv","xiaomengmeng~","limi","wuyue","ronger"};
    	java.util.ArrayList<AbstractGraph.Edge> edgeList=new java.util.ArrayList<AbstractGraph.Edge>();
    	edgeList.add(new AbstractGraph.Edge(0, 2));
    	edgeList.add(new AbstractGraph.Edge(1, 2));
    	edgeList.add(new AbstractGraph.Edge(2, 4));
    	edgeList.add(new AbstractGraph.Edge(3, 4));
    	
    	Graph<String> graph2=new UnweightedGraph<String>(edgeList,java.util.Arrays.asList(names));//java.util.Arrays.asList()½«array»»³Élist
    	System.out.println("The number Of vertices in graph2 : "+graph2.getSize());
    	System.out.println("The edges for graph2: ");
    	graph2.printEdges();
    	System.out.println("\nThe matrix for graph2 :");
    	graph2.printAdjacencyMatrix();
    	
    	for(int i=0;i<5;i++){
    		System.out.println("vertex "+i+" : "+graph2.getVertex(i));
    	}
    	
    	
    	
    	
    }
}
