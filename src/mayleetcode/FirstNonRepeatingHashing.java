package mayleetcode;

import java.util.HashMap;

public class FirstNonRepeatingHashing {

	public static void main(String[] args) {
		String s = "leetcode";
		HashMap<Character,Integer> h = new HashMap<Character,Integer>();
		int i=0;
		for(i=0;i<s.length();i++)
		{
			if(!h.containsKey(s.charAt(i)))
			{
				h.put(s.charAt(i), i);
			}
			else
			{
				h.put(s.charAt(i), -1);
			}
		}
		for(i=0;i<s.length();i++)
		{
			if(i==h.get(s.charAt(i)))
			{
				System.out.println(i);
				break;
			}
		}
	}
}