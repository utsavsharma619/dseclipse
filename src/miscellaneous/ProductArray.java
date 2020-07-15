package miscellaneous;

public class ProductArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int[] prod = new int[5];
		for(int i=0;i<arr.length;i++)
		{
			prod[i] = pr(arr,i);
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(prod[i]);;
		}
	}
	public static int pr(int[] arr,int i)
	{
		int mul=1;
		for(int y=0;y<i;y++)
		{
			mul = mul * arr[y];
		}
		for(int y=i+1;y<arr.length;y++)
		{
			mul = mul * arr[y];
		}
		return mul;
	}
}
