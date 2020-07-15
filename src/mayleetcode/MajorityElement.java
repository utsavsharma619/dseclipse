package mayleetcode;

import java.util.HashMap;
import java.util.Collections;

public class MajorityElement {

	public static void main(String[] args) {
		int[] nums = {2,2,2,1,1,2,1};
		int i;
		HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
		int count=1;
		for(i=0;i<nums.length;i++)
		{
			if(!h.containsKey(nums[i]))
			{
				h.put(nums[i], count);
			}
			else
			{
				h.put(nums[i], h.get(nums[i])+1);
			}
		}
		int maxval = Collections.max(h.values());
		int ans=0;
		for(i=0;i<nums.length;i++)
		{
			if(h.get(nums[i])==maxval)
			{
				ans=nums[i];
				break;
			}
		}
		System.out.println(ans);
	}
}