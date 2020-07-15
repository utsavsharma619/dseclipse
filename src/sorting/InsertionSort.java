package sorting;

public class InsertionSort {

	public static void main(String[] args) {
		int i,n=6;
		int[] a = {2,42,12,34,5,1};
		for(i=1;i<n;i++)
		{
			while(i>0 && a[i-1]>a[i])
			{
				int temp= a[i];
				a[i] = a[i-1];
				a[i-1] = temp;
				i--;
			}
		}
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}

}
