package mayleetcode;

import java.util.HashMap;

public class JewelsAndStones {

	public static void main(String[] args) {
		String J = "aA";
		String S = "aAAbbbb";
		int count=0;
		HashMap<Character, Integer> h = new HashMap<>();
		for(int i=0;i<J.length();i++)
		{
			h.put(J.charAt(i), count);
		}
		for(int i=0;i<S.length();i++)
		{
			if(h.containsKey(S.charAt(i)))
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
