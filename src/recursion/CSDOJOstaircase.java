package recursion;

public class CSDOJOstaircase {

	public static void main(String[] args) {
		int n=5;
		System.out.println(ans(n));;
	}
	public static int ans(int n)
	{
		if(n==1)
		{
			return 1;
		}
		if(n==2)
		{
			return 2;
		}
		else
		{
			return ans(n-1)+ans(n-2);
		}
	}

}
