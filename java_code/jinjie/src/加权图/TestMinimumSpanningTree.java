package º”»®Õº;

public class TestMinimumSpanningTree {
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
    	WeightedGraph<String>.MST tree=graph1.getMinimumSpanningTree();
    	System.out.println("Total weight is "+tree.getTotalWeight());
    	tree.printTree();
	}
}
