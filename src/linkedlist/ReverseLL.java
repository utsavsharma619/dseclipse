package linkedlist;

class Node
{
	int data;
	Node next;
	Node(int x)
	{
		this.data=x;
	}
}
public class ReverseLL {
	static Node root = null;
	public static void main(String[] args) {
		root=new Node(10);
		root.next=new Node(20);
		root.next.next=new Node(30);
		root.next.next.next=new Node(40);
		Node head = root;
		Node p = head;
		Node q = head.next.next;
		Node last = q.next;
		q.next = p.next;
		p.next.next = p;
		p.next = last;
		System.out.println(q.next.next.next.data);
	}
}
