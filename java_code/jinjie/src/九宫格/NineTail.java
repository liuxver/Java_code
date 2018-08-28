package ¾Å¹¬¸ñ;
import java.util.Scanner;
public class NineTail {
    public static void main(String[] args){
    	System.out.println("Enter a String :");
    	Scanner input=new Scanner(System.in);
    	String s=input.nextLine();
    	
    	char[] initinalNode=s.toCharArray();
    	
    	NineTailModel model=new NineTailModel();
    	System.out.println(NineTailModel.getIndex(initinalNode));
    	java.util.List<Integer> path=model.getShortestPath(NineTailModel.getIndex(initinalNode));
    	
    	System.out.println("The step :"+path.size());
        for(int i=0;i<path.size();i++){
        	NineTailModel.printNode(NineTailModel.getNode(path.get(i).intValue()));
        }
    }
}
