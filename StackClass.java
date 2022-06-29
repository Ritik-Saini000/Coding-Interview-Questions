import java.util.Stack;

public class StackClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> s=new Stack<>();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		
		while(!s.isEmpty()) {
			System.out.println(s.peek());
			s.pop();
		}
		
	}

}
