package queue;

public class Queue {
	int front=-1;
	int end=-1;
	int[] que = new int[5];
	public void enqueue(int x)
	{
		end++;
		que[end] = x;
	}
	public void dequeue()
	{
		for(int i=0;i<end;i++)
		{
			que[i]=que[i+1];
		}
		end--;
	}
	public void traverse()
	{
		for(int i=0;i<end+1;i++)
		{
			System.out.println(que[i]);
		}
	}
}