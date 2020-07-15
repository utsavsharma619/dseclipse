package binarytree;

import java.util.*;

class Node
{
	int data;
	Node left=null;
	Node right=null;
	Node(int x)
	{
		this.data=x;
	}
}
public class BinaryTree {
	static Node root = null;
	Queue<Node> queue = new LinkedList<>();
	public void insert(int x)
	{
		Node temp = new Node(x);
		if(root==null)
		{
			root=temp;
			queue.add(root);
		}
		else
		{
			while(!queue.isEmpty())
			{
				Node p = queue.peek();
				if(p.left==null)
				{
					p.left=temp;
					break;
				}
				else if(p.right==null)
				{
					p.right=temp;
					break;
				}
				else
				{
					queue.add(p.left);
					queue.add(p.right);
					queue.remove();
				}
			}
		}
	}
	public void traverse()
	{
		Node p = root;
		Queue<Node> queue1 = new LinkedList<>();
		queue1.add(p);
		System.out.println(p.data);
		while(!queue1.isEmpty())
		{
			p = queue1.remove();
			if(p.left!=null)
			{
				System.out.println(p.left.data);
				queue1.add(p.left);
			}
			if(p.right!=null)
			{
				System.out.println(p.right.data);
				queue1.add(p.right);
			}
		}
	}
	public void delete(int x)
	{
		Node a = null,b=null;
		Node p = root;
		Queue<Node> queue2 = new LinkedList<>();
		queue2.add(p);
		while(!queue2.isEmpty())
		{
			p = queue2.remove();
			if(p.left!=null)
			{
				queue2.add(p.left);
			}
			if(p.right!=null)
			{
				queue2.add(p.right);
			}
			if(queue2.size()==1)
			{
				a = queue2.peek();
			}
		}
		p = root;
		queue2.add(p);
		while(!queue2.isEmpty())
		{
			if(queue2.peek().data==x)
			{
				b = queue2.peek();
			}
			p = queue2.remove();
			if(p.left!=null)
			{
				queue2.add(p.left);
			}
			if(p.right!=null)
			{
				queue2.add(p.right);
			}
		}
		b.data=a.data;
	}
	public void deletetree()
	{
		System.out.println("DELETING TREE");
		root=null;
	}
	public void preorder(Node p)
	{
		if(p!=null)
		{
			System.out.println(p.data);
			preorder(p.left);
			preorder(p.right);
		}
	}
	public void inorder(Node p)
	{
		if(p!=null)
		{
			inorder(p.left);
			System.out.println(p.data);
			inorder(p.right);
		}
	}
	public void postorder(Node p)
	{
		if(p!=null)
		{
			postorder(p.left);
			postorder(p.right);
			System.out.println(p.data);

		}
	}
}