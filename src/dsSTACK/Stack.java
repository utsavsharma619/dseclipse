package dsSTACK;

public class Stack {
	static int[] a = new int[5];
	static int top = -1;
	public static void main(String[] args) {
		push(10);
		push(20);
		push(30);
		push(40);
		pop();
		push(50);
		push(60);
		pop();
		traverse();
	}
	public static void push(int x)
	{
		top++;
		a[top] = x;
	}
	public static void pop()
	{
		top--;
	}
	public static void traverse()
	{
		for(int i=top;i>=0;i--)
		{
			System.out.println(a[i]);
		}
	}

}
