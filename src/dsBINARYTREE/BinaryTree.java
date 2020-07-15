package dsBINARYTREE;

import java.util.LinkedList;
import java.util.Queue;

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

public class BinaryTree {

	public static void main(String[] args) {
		Node root = new Node(10);
		root.left=new Node(20);
		root.right=new Node(30);
		root.left.left=new Node(40);
		root.left.right=new Node(50);
		root.right.left=new Node(60);
		insert(root,70);
		insert(root,80);
		insert(root,90);
		insert(root,100);
//		inorder(root);
//		delete(root,60);
//		delete(root,50);
		delete(root,60);
		level(root);
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
	public static void insert(Node root,int x)
	{
		Node temp = new Node(x);
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty())
		{
			System.out.println(queue.peek().data + " is removed");
			Node k = queue.remove();
			if(k.left==null)
			{
				k.left=temp;
				break;
			}
			if(k.right==null)
			{
				k.right=temp;
				break;
			}
			queue.add(k.left);
			queue.add(k.right);
		}
	}
	public static void level(Node root)
	{
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty())
		{
			System.out.println(queue.peek().data);
			Node k = queue.remove();
			if(k.left!=null)
			{
				queue.add(k.left);
			}
			if(k.right!=null)
			{
				queue.add(k.right);
			}
		}
	}
	public static void delete(Node root,int x)
	{
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty())
		{
			Node k = queue.remove();
			if(k.left!=null)
			{
				queue.add(k.left);
				if(k.left.data==x)
				{
					k.left=null;
					break;
				}
			}
			if(k.right!=null)
			{
				queue.add(k.right);
				if(k.right.data==x)
				{
					k.right=null;
					break;
				}
			}
		}
	}
}