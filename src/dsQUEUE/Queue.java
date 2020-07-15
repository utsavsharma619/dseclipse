package dsQUEUE;

public class Queue {
	static int[] queue = new int[10];
	static int top=-1;
	public static void main(String[] args) {
		push(10);
		push(20);
		push(30);
		push(40);
		push(50);
		pop();
		pop();
		push(60);
		push(60);
		pop();
		traverse();
	}
	public static void push(int x) {
		top++;
		queue[top] = x;
	}
	public static void pop() {
		for(int i=0;i<=top-1;i++)
		{
			queue[i] = queue[i+1];
		}
		top--;
	}
	public static void traverse() {
		for(int i=0;i<=top;i++)
		{
			System.out.println(queue[i]);
		}
	}
	
}
