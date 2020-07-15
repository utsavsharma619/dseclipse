package binarysearchtree;

public class BinarySearchTreeMain {

	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		BinarySearchTree.root = tree.insert(BinarySearchTree.root,60);
		BinarySearchTree.root = tree.insert(BinarySearchTree.root,50);
		BinarySearchTree.root = tree.insert(BinarySearchTree.root,40);
		BinarySearchTree.root = tree.insert(BinarySearchTree.root,30);
		BinarySearchTree.root = tree.insert(BinarySearchTree.root,70);
		BinarySearchTree.root = tree.insert(BinarySearchTree.root,65);
		tree.traverse(BinarySearchTree.root);
	}

}
