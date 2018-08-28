package 加权图;

public class TestWeightedGraph {
    public static void main(String[] args){
    	String[] vertices={"a","s","d","f","g","h","j","k","l","z","x","c"};
    	int[][] edges={
    			{0,1,3},{0,3,5},{0,5,1},
    			{1,0,4},{1,2,8},{1,3,2},
    			{2,1,9},{2,3,6},{2,4,4},{2,10,1},
    			{3,0,2},{3,1,3},{3,2,2},{3,4,7},{3,5,8},
    			{4,2,8},{4,3,2},{4,5,3},{4,7,4},{4,8,5},{4,10,8},
    			{5,0,5},{5,3,7},{5,4,2},{5,6,9},{5,7,6},
    			{6,5,5},{6,7,5},
    			{7,4,4},{7,5,2},{7,6,1},{7,8,1},
    			{8,4,6},{8,7,7},{8,9,3},{8,10,6},{8,11,5},
    			{9,8,3},{9,11,5},
    			{10,2,6},{10,4,7},{10,8,3},{10,11,6},
    			{11,8,6},{11,9,8},{11,10,3},
    	};
    	
    	WeightedGraph<String> graph1=new WeightedGraph<String>(edges,vertices);
    	System.out.println("The number of vertices in graph1: "+graph1.getSize());
    	System.out.println("The vertex with 1 is "+graph1.getVertex(1));
    	System.out.println("The index for g is  :"+graph1.getIndex("g"));
    	System.out.println("The degrees for graph1[0] is : "+graph1.getDegree(0));
    	System.out.println("The edges for graph1 is :");
    	graph1.printWeightedEdges();
    	
    	/*
    	String[] names={"liuxv","xiaomengmeng~","limi","wuyue","ronger"};
    	java.util.ArrayList<AbstractGraph.Edge> edgeList=new java.util.ArrayList<AbstractGraph.Edge>();
    	edgeList.add(new AbstractGraph.Edge(0, 2));
    	edgeList.add(new AbstractGraph.Edge(1, 2));
    	edgeList.add(new AbstractGraph.Edge(2, 4));
    	edgeList.add(new AbstractGraph.Edge(3, 4));
    	
    	Graph<String> graph2=new UnweightedGraph<String>(edgeList,java.util.Arrays.asList(names));//java.util.Arrays.asList()将array换成list
    	System.out.println("The number Of vertices in graph2 : "+graph2.getSize());
    	System.out.println("The edges for graph2: ");
    	graph2.printEdges();
    	System.out.println("\nThe matrix for graph2 :");
    	graph2.printAdjacencyMatrix();
    	
    	for(int i=0;i<5;i++){
    		System.out.println("vertex "+i+" : "+graph2.getVertex(i));
    	}
    	
    	*/
    	
    	
    }
}
