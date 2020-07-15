package miscellaneous;

public class Fibonacci {

	public static void main(String[] args) {
		int sum=0;
		System.out.println(sum);;
	}
	public static int fib(int n)
	{
		if(n<2)
		{
			return 1;
		}
		else
		{
			return fib(n-1)+fib(n-2);
		}
	}
}
