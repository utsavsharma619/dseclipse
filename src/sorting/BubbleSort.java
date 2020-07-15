package sorting;

public class BubbleSort {

	public static void main(String[] args) {
		System.out.println("***BUBBLE SORTING***");
		int i,j;
		int[] a = {12,42,5,1,45,555,1111,2,122,4,8,9};
		int n=a.length;
		for(i=0;i<n-1;i++)
		{
			for(j=0;j<n-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}

}
