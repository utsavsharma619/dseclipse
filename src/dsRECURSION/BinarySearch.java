package dsRECURSION;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,77,8,9,10};
		int n = 77;
		System.out.println(binary(arr,0,9,n));;
	}
	public static int binary(int[] arr,int left,int right,int n)
	{
		int mid=(left+right)/2;
		if(arr[mid]==n)
		{
			return mid;
		}
		else if(arr[mid]<n)
		{
			return binary(arr,mid,9,n);
		}
		else
		{
			return binary(arr,0,mid,n);
		}
	}

}
