package recursion;

public class Exponent {

	public static void main(String[] args) {
		System.out.println(expo(3,5));;
	}
	public static int expo(int x,int n)
	{
		if(n==0 || x==1)
		{
			return 1;
		}
		else
		{
			return x*expo(x,n-1);
		}
	}

}
