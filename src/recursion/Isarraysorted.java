package recursion;

public class Isarraysorted {

	public static void main(String[] args) {
		int[] arr = {20,20,78,98,99,97};
		System.out.println(isSorted(arr,0));;
	}
	public static boolean isSorted(int[] arr,int l)
	{
		if(l<arr.length-1)
		{
			if(arr[l]>arr[l+1])
			{
				return false;
			}
			else
			{
				return isSorted(arr, l+1);
			}
		}
		else
		{
			return true;
		}
	}
}
