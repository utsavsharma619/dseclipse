package stack;

public class Stack {
	static int top = -1;
	int[] array = new int[5];
	public void push(int x)
	{
		if(top==4)
		{
			System.out.println("STACK OVERFLOW");
		}
		else
		{
		top++;
		array[top]=x;
	
		}
	}
	public void pop()
	{
		if(top==-1)
		{
			System.out.println("STACK IS EMPTY");
		}
		else {
		top--;}
	}
	public void traverse()
	{
		for(int i=top;i>=0;i--)
		{
			System.out.println(array[i]);
		}
	}
}
