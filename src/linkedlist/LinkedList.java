package linkedlist;

class Node
{
	int data;
	Node next=null;
	Node(int x)
	{
		this.data = x;
	}
}
public class LinkedList {
	static Node root = null;
	public void insert(int x)
	{
		if(root==null)
		{
			Node temp = new Node(x);
			root=temp;
		}
		else
		{
			Node temp = new Node(x);
			Node p;
			p=root;
			while(p.next!=null)
			{
				p=p.next;
			}
			p.next=temp;
		}
	}
	public void insertstart(int x)
	{
		Node temp = new Node(x);
		temp.next=root;
		root=temp;
	}
	public void delete()
	{
		Node p;
		p=root;
		while(p.next!=null)
		{
			p=p.next;
		}
		Node q;
		q=root;
		while(q.next!=p)
		{
			q=q.next;
		}
		q.next=null;
	}
	public void traverse()
	{
		Node p;
		p = root;
		while(p!=null)
		{
			System.out.println(p.data);
			p=p.next;
		}
	}
}