package recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ReverseStack {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(55);
		List<Integer> ll = new ArrayList<>();
		addd(s,5,ll);
//		Stack<Integer> s = new Stack<Integer>();
//		Stack<Integer> n = new Stack<Integer>();
//		s.add(10);
//		s.add(20);
//		s.add(30);
//		s.add(40);
//		s.add(55);
//		System.out.println(rev(s,n));
//	}
//	public static Stack<Integer> rev(Stack<Integer> s,Stack<Integer> n)
//	{
//		if(!s.empty())
//		{
//			n.add(s.peek());
//			s.pop();
//			return rev(s,n);
//		}
//		else
//		{
//			return n;
//		}
	}
	public static void addd(Stack<Integer> s,int x,List<Integer> ll)
	{
		if(!s.empty())
		{
			ll.add(s.peek());
			s.pop();
		}
	}
}