
public class lengthOfLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Hello World";
		int n=str.length(),result=0;
		while(n>0) {
			if(str.charAt(--n) != ' ')
				result++;
			else if(result>0)
				System.out.println(result);
		}
	}

}
