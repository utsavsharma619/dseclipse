package miscellaneous;

import java.util.HashMap;

public class Sum2Array {
	public static void main(String[] args){
		int[] arr = {10, 15, 3, 7};
		int k=18;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0;i<arr.length;i++)
		{
			if(!map.containsKey(arr[i]))
			{
				map.put(arr[i], k-arr[i]);
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			if(map.get(arr[i])+arr[i]==k)
			{
				System.out.println(map.get(arr[i]));
				System.out.println(arr[i]);
				break;
			}
		}
	}
}