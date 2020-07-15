package dsLINKEDLIST;

public class CircularLinkedList {
	static Node head = null;
	public static void main(String[] args) {
		insert(10);
		insert(20);
		insert(30);
		insert(40);
		insert(50);
//		insert(70);
//		insert(80);
		delete(40);
		traverse();
	}

	public static void insert(int x)
	{
		if(head==null)
		{
			Node temp = new Node(x);
			head = temp;
			head.next=head;
		}
		else
		{
			Node temp = new Node(x,head);
			Node p = head;
			while(p.next!=head)
			{
				p=p.next;
			}
			p.next=temp;
		}
		
	}
	
	public static void traverse()
	{
		Node p = head;
		if(p.next==p)
		{
			System.out.println(p.data);
		}
		else
		{
			while(p.next!=head)
			{
				System.out.println(p.data);
				p=p.next;
			}
		}
		System.out.println(p.data);
		System.out.println(p.next.data);
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
