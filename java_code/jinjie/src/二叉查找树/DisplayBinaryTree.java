package ���������;

import javax.swing.*;
public class DisplayBinaryTree extends JApplet {
	public DisplayBinaryTree(){
		add(new TreeControl(new BinaryTree<Integer>()));
	}
}
