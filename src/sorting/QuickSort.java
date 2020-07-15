package sorting;

public class QuickSort {

	public static void main(String[] args) {
		int[] a = {10,9,8,7,6,5,4,3,2,1};
		quick(a,0,9);
		for(int k=0;k<a.length;k++)
		{
			System.out.println(a[k]);
		}
	}
	public static void quick(int[] a,int l,int r)
	{
		if(l<r)
		{
			int i=l-1,p=r;
			for(int j=l;j<=p;j++)
			{
				if(a[j]<=a[p])
				{
					i++;
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}			
			quick(a,0,i-1);
			quick(a,i+1,r);
		}
	}
}