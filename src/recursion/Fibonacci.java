//DYNAMIC PROGRAMMINGGGGG


package recursion;

public class Fibonacci {

	public static void main(String[] args) {
		int x=7;
		System.out.println(fib(x));
	}
	public static int fib(int n)
	{
		int[] f = new int[n+2];
		f[0]=0;
		f[1]=1;
		for(int i=2;i<=n;i++)
		{
			f[i] = f[i-1] + f[i-2];			
		}
		return f[n];
	}
}


//RECURSIONNNNNN
/*
package recursion;

public class Fibonacci {

	public static void main(String[] args) {
		int x=6;
		System.out.println(fib(x));
	}
	public static int fib(int n)
	{
		if(n==0)
		{
			return 0;
		}
		else if(n==1)
		{
			return 1;
		}
		else
		{
			return fib(n-1)+fib(n-2);
		}
	}
}
*/