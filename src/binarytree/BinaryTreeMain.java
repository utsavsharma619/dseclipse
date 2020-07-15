package binarytree;

public class BinaryTreeMain {

	public static void main(String[] args) {
		BinaryTree tree =  new BinaryTree();
		tree.insert(10);
		tree.insert(20);
		tree.insert(30);
		tree.insert(40);
		tree.insert(50);
		tree.insert(60);
		tree.traverse();
		tree.delete(10);
		tree.traverse();
		tree.preorder(BinaryTree.root);
		tree.inorder(BinaryTree.root);
		tree.postorder(BinaryTree.root);
	}

}
