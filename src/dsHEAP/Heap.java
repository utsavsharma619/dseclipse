package dsHEAP;

public class Heap {
	static int[] a = new int[11];
	static int i=1;
	public static void main(String[] args) {
		insert(3);
		insert(5);
		insert(8);
		insert(17);
		insert(19);
		insert(36);
		insert(40);
		insert(25);
		insert(100);
		insert(1);
		traverse();
		size();
	}
	public static void insert(int x)
	{
		if(x>a[i/2] && i>1)
		{
			a[i] = x;
			i++;
		}
		else
		{
			a[i] = x;
			heapify(i);
			i++;
		}
	}
	public static void size()
	{
		System.out.print("SIZE : ");
		System.out.println(i-1);
	}
	public static void traverse()
	{
		for(int k=1;k<=i-1;k++)
		{
			System.out.println(a[k]);
		}
	}
//	HEAPIFYYYYYY
	public static void heapify(int l)
	{
		if(a[l]<a[l/2])
		{
			int temp = a[l];
			a[l] = a[l/2];
			a[l/2] = temp;
			heapify(l/2);
		}
	}
}