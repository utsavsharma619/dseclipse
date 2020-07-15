package stack;

public class StackMain {

	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(14);
		stack.push(1);
		stack.push(12);
		stack.push(11);
		stack.pop();
		stack.traverse();
	}

}
