package recursion;

public class ReverseArray {
	public static void main(String[] args) {
		int[] arr = {2,41,6,8,1};
		rev(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	public static void rev(int[] arr,int l,int r)
	{
		if(l<r)
		{
			int temp = arr[l];
			arr[l] = arr[r];
			arr[r] = temp;
			rev(arr,l+1,r-1);	
		}
	}

}
