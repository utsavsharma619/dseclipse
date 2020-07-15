package mayleetcode;
import java.util.*;

public class SingleElement {

	public static void main(String[] args) {
		int[] nums = {1,1,2,3,3,4,4,8,8};
		HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
		for(int i=0;i<nums.length;i++)
		{
			if(!h.containsKey(nums[i]))
			{
				h.put(nums[i], nums[i]);
			}
			else
			{
				h.put(nums[i], h.get(nums[i])-nums[i]);
			}
		}
		for(int i=0;i<nums.length;i++)
		{
			if(h.get(nums[i])!=0)
			{
				System.out.println(h.get(nums[i]));
			}
		}
	}

}
