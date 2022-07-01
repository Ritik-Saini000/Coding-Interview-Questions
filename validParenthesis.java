import java.util.Stack;

public class validParenthesis {

	 static boolean isValid(String str) {
		
		Stack<Character> st=new Stack<>();
		boolean ans=true;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='{' || str.charAt(i)=='(' || str.charAt(i)=='[')
				{
				st.push(str.charAt(i));
				}
			else if(str.charAt(i)==')') {
				if(!st.isEmpty() && st.peek()=='(') {
					st.pop();
				}
				else
				{
					ans=false;
					break;
				}
			}
			else if(str.charAt(i)==']') {
				if(!st.isEmpty() && st.peek()=='[') {
					st.pop();
				}
				else
				{
					ans=false;
					break;
				}
			}
			else if(str.charAt(i)=='}') {
				if(!st.isEmpty() && st.peek()=='{') {
					st.pop();
				}
				else
				{
					ans=false;
					break;
				}
			}
		}
		if(!st.isEmpty())
			return false;
		
		return ans;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="{([])}";
		if(isValid(str)) {
			System.out.println("Valid String");
		}
		else
		{
			System.out.println("Invalid String");
		}
	}

}
