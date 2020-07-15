package recursion;

public class MinJumps {
	static int count = 0;
	public static void main(String[] args) {
		int[] arr = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
		int r =arr.length-1;
		System.out.println(mj(arr,0,r));
	}
	public static int mj(int[] arr ,int l, int r)
	{
		if(l==r)
		{
			return count;
		}
		else
		{
			if(l<r)
			{
				count++;
				return mj(arr,l+arr[l],r);
			}
			else
			{
				
			}
		}
	}
}
