package recursion;

public class Arraysum {

	static int[] arr = {4,2,5,6,1,2,4};
	public static void main(String[] args) {
		System.out.println(sumA(6));
	}
	public static int sumA(int n)
	{
		if(n==0)
		{
			return arr[0];
		}
		else
		{
			return arr[n] + sumA(n-1);
		}
	}
}