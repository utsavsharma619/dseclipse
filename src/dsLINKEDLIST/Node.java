package dsLINKEDLIST;

public class Node
{
	int data;
	Node next=null;
	Node(int x)
	{
		this.data=x;
	}
	Node(int x,Node temp)
	{
		this.data=x;
		this.next=temp;
	}
}
