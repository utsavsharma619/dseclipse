package dsDYNAMICPROGRAMMING;

public class TopDown {

	public static void main(String[] args) {
		int[] memoize = new int[15];
 		System.out.println(fib(memoize,4));
	}
	public static int fib(int[] memoize,int n)
	{
		if(n==1)
		{
			return 0;
		}
		if(n==2)
		{
			return 1;
		}
		if(memoize[n]==0)
		{
			memoize[n] = fib(memoize,n-1)+fib(memoize,n-2);
		}
		return memoize[n];
	}
}
