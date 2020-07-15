package miscellaneous;

//import java.util.ArrayList;
import java.util.HashMap;

public class TwoSum {
	public static void main(String[] args){
		int[] nums = {3,4,8,15};
		int target = 11;
		System.out.println(twosum(nums,target));;
	}
	public static int[] twosum(int[] nums,int target)
	{
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
        	int diff = target - nums[i];
        	if(map.containsKey(diff))
            {
            	return new int[] {map.get(diff),i};
            }
            map.put(nums[i],i);
        }
        return new int[0];
	}
}