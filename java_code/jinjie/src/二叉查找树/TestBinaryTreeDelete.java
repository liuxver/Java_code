package ¶þ²æ²éÕÒÊ÷;

public class TestBinaryTreeDelete {
	public static void main(String[] args){
		BinaryTree<String> tree=new BinaryTree<String>();
		tree.insert("liuxv");
		tree.insert("xiaomengmeng");
		tree.insert("limi");
		tree.insert("wuyue");
		tree.insert("abig");
		
		printTree(tree);
		
		System.out.println("After delete liuxv ");
		tree.delete("liuxv");
		printTree(tree);
		
		System.out.println("After delete limi :");
		tree.delete("limi");
		printTree(tree);
		
		
	}
	
	public static void printTree(BinaryTree tree){
		System.out.println("Inorder(Sorted):");
		tree.inorder();
		System.out.println("\nPostorder: ");
		tree.postorder();
		System.out.println("\npreorder: ");
		tree.preorder();
		System.out.println("\n the number of the tree is "+tree.getSize());
		System.out.println();
	}
}
