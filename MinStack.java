import java.util.Stack;

public class MinStack {
	
	private static Integer x;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> stack=new Stack<>();
		Stack<Integer> min_vals=new Stack<>();
		
		
		if(min_vals.isEmpty() || x<=min_vals.peek()) {
			min_vals.push(x);
		}
		stack.push(x);
		
		if(stack.peek().equals(min_vals.peek())) {
			min_vals.pop();
		}
		stack.pop();
		System.out.println(stack.peek());
		System.out.println(min_vals.peek());
	}

}
