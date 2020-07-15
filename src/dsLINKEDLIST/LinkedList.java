package dsLINKEDLIST;

public class LinkedList {
	static Node head = null;
	public static void main(String[] args) {
		insert(10);
		insert(20);
		insert(30);
		insert(40);
		insert(50);
		insert(60);
		insert(70);
		insert(80);
		delete(40);
		traverse();
	}

	public static void insert(int x)
	{
		if(head==null)
		{
			Node temp = new Node(x);
			head = temp;
		}
		else
		{
			Node temp = new Node(x);
			Node p = head;
			while(p.next!=null)
			{
				p=p.next;
			}
			p.next=temp;
		}
		
	}
	
	public static void traverse()
	{
		Node p = head;
		while(p!=null)
		{
			System.out.println(p.data);
			p=p.next;
		}
	}
	
	public static void delete(int x)
	{
		Node p = head;
		while(p.next.data!=x)
		{
			p=p.next;
		}
		p.next = p.next.next;
	}
}
