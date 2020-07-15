package dsBINARYSEARCHTREE;

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

public class BinarySearchTree {

	public static void main(String[] args) {
		Node root = new Node(100);
		root.left = new Node(80);
		root.left.left = new Node(70);
		root.left.left.left = new Node(50);
		root.left.left.left.left = new Node(40);
		root.left.left.left.right = new Node(60);
		root.left.right = new Node(90);
		root.right = new Node(200);
		root.right.left = new Node(150);
		root.right.right = new Node(300);
		root.right.right.left = new Node(250);
		root.right.right.right = new Node(400);
//		search(root,50,0);
//		insert(root,140);
		delete(root,400);
		inorder(root);
//		preorder(root);
//		postorder(root);
	}
	public static void search(Node root,int x,int count)
	{
		if(x==root.data)
		{
			System.out.println("FOUND " + count);
		}
		else if(root.left==null && root.right==null)
		{
			System.out.println("NOT FOUND");
		}
		else if(x<root.data)
		{
			search(root.left,x,count+1);
		}
		else if(x>root.data)
		{
			search(root.right,x,count+1);
		}
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
	public static void preorder(Node root)
	{
		if(root==null)
		{
			return;
		}
		else
		{
			System.out.println(root.data);
			preorder(root.left);
			preorder(root.right);
		}
	}
	public static void postorder(Node root)
	{
		if(root==null)
		{
			return;
		}
		else
		{
			postorder(root.left);
			postorder(root.right);
			System.out.println(root.data);
		}
	}
	public static void insert(Node root,int x)
	{
		if(root==null)
		{
			root = new Node(x);
		}
		else
		{
			if(x<root.data && root.left!=null)
			{
				insert(root.left, x);
			}
			else if(x>root.data && root.right!=null)
			{
				insert(root.right, x);
			}
			else if(x<root.data && root.left==null)
			{
				root.left = new Node(x);
			}
			else if(x>root.data && root.right==null)
			{
				root.right = new Node(x);
			}
			else
			{
				if(root.left==null)
				{
					root.left=new Node(x);
				}
				else
				{
					root.right=new Node(x);
				}
			}
		}
	}
	public static void delete(Node root,int x)
	{
		if(x<root.data)
		{
			if(root.left.data==x)
			{
				root.left=null;
				return;
			}
			delete(root.left,x);
		}
		else if(x>root.data)
		{
			if(root.right.data==x)
			{
				root.right=null;
				return;
			}
			delete(root.right,x);
		}
	}
}