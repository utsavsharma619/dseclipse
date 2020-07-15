package dsAVL;

class Node
{
	int data;
	Node left=null;
	Node right=null;
	Node(int data)
	{
		this.data=data;
	}
}

public class Avl {

	public static void main(String[] args) {
		Node root = new Node(40);
		root.left = new Node(30);
		root.left.left = new Node(20);
		root.left.left.left = new Node(10);
		root.right = new Node(50);
		RR(root.left,root);
		inorder(root);
	}
	public static void RR(Node disbalanced,Node root)
	{
		Node newroot = disbalanced.left;
		disbalanced.left=disbalanced.left.right;
		newroot.right=disbalanced;
		root.left = newroot;
	}
	public static void inorder(Node root)
	{
		if(root==null)
		{
			return;
		}
		else
		{
			inorder(root.left);
			System.out.println(root.data);
			inorder(root.right);
		}
	}
}
