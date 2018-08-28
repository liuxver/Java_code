package 九宫格;
import java.util.*;

import 图.AbstractGraph;
import 图.UnweightedGraph;
import 图.AbstractGraph.Edge;
import 图.AbstractGraph.Tree;
public class NineTailModel {
    public final static int NUMBER_OF_NODES=512;
    protected AbstractGraph<Integer>.Tree tree;
    
    public NineTailModel(){//为9枚硬币创建一个模型 并获取树
    	List<AbstractGraph.Edge> edges=getEdges();
    	UnweightedGraph<Integer> graph=new UnweightedGraph<Integer>(edges,NUMBER_OF_NODES);
    	tree=graph.bfs(511);
    	System.out.println(graph.getSize());
    	tree.printTree();
    }
    
    private List<AbstractGraph.Edge> getEdges(){//返回Edge对象的线性表
    	List<AbstractGraph.Edge> edges=new ArrayList<AbstractGraph.Edge>();
    	
    	for(int i=0;i<NUMBER_OF_NODES;i++){
    		
    		for(int j=0;j<9;j++){
    			char[] node=getNode(i);
    			if(node[j]=='H'){
    				int v=getFlippedNode(node,j);
    				edges.add(new AbstractGraph.Edge(v, i));
    			}
    		}
    	}
    	
    	return edges;
    }
    
    public static char[] getNode(int index){//返回一个包含9个字符   H T的节点  
    	char[] result=new char[9];
    	
    	for(int i=0;i<9; i++){
    		int digit=index%2;
    		if(digit==0){
    			result[8-i]='H';
    		}
    		else{
    			result[8-i]='T';
    		}
    		index=index/2;
    		
    	}
    	return result;
    }
    
    
    public static int getFlippedNode(char[] node,int position){//翻转指定位置的节点   并且返回被翻转节点的下标
    	int row=position/3;
    	int column=position%3;
    	
    	flipACell(node,row,column);
    	flipACell(node,row-1,column);
    	flipACell(node,row+1,column);
    	flipACell(node,row,column-1);
    	flipACell(node,row,column+1);
    	
    	return getIndex(node);
    	
    	
    }
    
    public static void flipACell(char[] node,int row,int column){//翻转指定行和列的节点
    	if(row>=0&&row<=2&&column>=0&&column<=2){
    		if(node[row*3+column]=='H'){
    			node[row*3+column]='T';
    		}
    		else{
    			node[row*3+column]='H';
    		}
    	}
    }
    
    public static int getIndex(char[] node){//返回一个节点的索引
    	int result=0;
    	
    	for(int i=0;i<9;i++){
    		if(node[i]=='T'){
    			result=result*2+1;
    		}
    		else{
    			result=result*2+0;
    		}
    	}
    	return result;
    }
    
    public List<Integer> getShortestPath(int nodeIndex){
    	return tree.getPath(nodeIndex);
    }
    
    public static void printNode(char[] node){
    	for(int i=0;i<9;i++){
    		if(i%3!=2)
    			System.out.print(node[i]);
    		else
    			System.out.println(node[i]);
    	}
    	System.out.println();
    }
    
    
    
    
    
}







