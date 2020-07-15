package miscellaneous;

public class RecursiveStaircase {

	public static void main(String[] args) {
		int N = 4;
		System.out.println(steps(N));;
	}
	public static int steps(int n)
	{
		if(n==1)
		{
			return 1;
		}
		if(n==2)
		{
			return 2;
		}
		int a = steps(n-1)+steps(n-2);
		return a;
	}

}
