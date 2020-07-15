package dsDYNAMICPROGRAMMING;

public class NumberFactor {
	static int[] mem = new int[10];
	public static void main(String[] args) {
		System.out.println(check(5));
	}
	public static int check(int n)
	{
		if(n>=0 && n<3)
		{
			return 1;
		}
		if(n==3)
		{
			return 2;
		}
		if(mem[n]==0) {
		int a = check(n-1);
		int b = check(n-3);
		int c = check(n-4);
		mem[n] = a+b+c;
		}
		return mem[n];
	}

}
