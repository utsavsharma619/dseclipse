package miscellaneous;

import java.util.*;

public class Microsoft1 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		int[] a = {1,2,5,4,3,7,8,16,15,14,17};
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]>a[i+1])
			{
				addtolist(list,i+1);
			}
		}
		pr(list);
	}
	public static void addtolist(List<Integer> list,int x)
	{
		list.add(x);
	}
	public static void pr(List<Integer> list)
	{
		System.out.println(list);
	}
}
