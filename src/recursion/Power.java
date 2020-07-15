package recursion;

public class Power {

	public static void main(String[] args) {
		System.out.println(power(4,4,0));
	}
	public static int power(int a , int b,int i)
	{
		if(i>=b)
		{
			return 1;
		}
		return a*power(a,b,i+1);
	}
}
