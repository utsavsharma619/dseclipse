package miscellaneous;

import java.util.*;

public class Microsoft {

	public static void main(String[] args) {
		List<Integer> st = new ArrayList<Integer>();
		st.add(1);
		st.add(2);
		st.add(3);
		st.add(4);
		st.add(5);
		st.remove(st.get(0));
		st.remove(st.get(2));
		st.remove(st.get(0));
		System.out.println(st.indexOf(5));
		System.out.println(st);
	}
}
