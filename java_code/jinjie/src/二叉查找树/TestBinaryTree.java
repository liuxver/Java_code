package ¶þ²æ²éÕÒÊ÷;

public class TestBinaryTree {
	public static void main(String[] args){
		BinaryTree<String> tree=new BinaryTree<String>();
		tree.insert("liuxv");
		tree.insert("xiaomengmeng");
		tree.insert("limi");
		tree.insert("wuyue");
		tree.insert("abig");
		System.out.println("Inorder(Sorted):");
		tree.inorder();
		System.out.println("\nPostorder: ");
		tree.postorder();
		System.out.println("\npreorder: ");
		tree.preorder();
		
		System.out.println("\n limi in the tree?"+tree.search("limi"));
		System.out.println("\n wangzhanxuan in the tree?"+tree.search("wangxuan"));
		
		System.out.println("\n A path from root to limi : ");
		java.util.ArrayList<BinaryTree.TreeNode<String>> path=tree.path("limi");
		for(int i=0;path!=null&&i<path.size();i++){
			System.out.print(path.get(i).element+" ");
		}
		
		Integer[] num={2,4,3,1,8,6,7};
		BinaryTree<Integer> intTree=new BinaryTree<Integer>(num);
		System.out.println("\n Inorder (sorted):");
		intTree.inorder();
		
	}
}
