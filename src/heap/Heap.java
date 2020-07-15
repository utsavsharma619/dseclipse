package heap;

public class Heap {
	int[] array;
	int size;
	Heap(int size)
	{
		array = new int[size+1];
		size=0;
	}
	public void insert(int value)
	{
		if(size==0)
		{
			System.out.println("HEAP IS EMPTYY!!");
		}
		array[size+1]=value;
		size++;
		heapDownToTop(size);
	}
	public void heapDownToTop(int size)
	{
		if(size<=1)
		{
			return;
		}
		else
		{
			int parent=size/2;
			if(array[size]<array[parent])
			{
				int temp = array[parent];
				array[parent] = array[size];
				array[size] = temp;
			}
			heapDownToTop(parent);
		}
	}
	public void peek()
	{
		if(size==0)
		{
			System.out.println("EMPTY!!");
		}
		else {
		System.out.println(array[1]);
		}
	}
	public void extractMin()
	{
		int extract = array[1];
		System.out.println(extract + ": is extracted");
		array[1] = array[size];
		size--;
		heapTopToBottom(1);
	}
	public void heapTopToBottom(int i)
	{
		int left=2*i;
		int right=2*i+1;
		if(array[right]<array[left])
		{
			if(array[i]>array[right])
			{
				int tmp = array[i];
				array[i] = array[right];
				array[right] = tmp;
				i=2*i+1;
			}
		}
		if(array[right]>array[left])
		{
			if(array[i]>array[left])
			{
				int tmp = array[i];
				array[i] = array[left];
				array[left] = tmp;
				i=2*i;
			}
		}
		heapTopToBottom(i);
	}
	public void traverse()
	{
		for(int i=1;i<=size;i++)
		{
			System.out.println(array[i]);
		}
	}
}