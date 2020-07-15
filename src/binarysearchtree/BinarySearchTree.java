package binarysearchtree;

class Node
{
	int data;
	Node left=null;
	Node right=null;
}

public class BinarySearchTree {
	static Node root=null;
	public Node createnode(int x)
	{
		Node k = new Node();
		k.data=x;
		k.left=null;
		k.right=null;
		return k;
	}
	public Node insert(Node currNode,int x)
	{
		if(currNode==null)
		{
			return createnode(x);
		}
		if(x<=currNode.data)
		{
			currNode.left = insert(currNode.left,x);
		}
		else if(x>currNode.data)
		{
			currNode.right = insert(currNode.right,x);
		}
		return currNode;
	}
	public void traverse(Node p)
	{
		if(p!=null)
		{
			traverse(p.left);
			System.out.println(p.data);
			traverse(p.right);
		}
	}
}