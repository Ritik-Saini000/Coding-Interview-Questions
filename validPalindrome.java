
public class validPalindrome {

	public static boolean isPalindrome(String str) {
		if(str==null)
			return false;
		int left=0;
		int right=str.length()-1;
		
		while(left<right) {
			if(!isAlphanumeric(str.charAt(left)))
				left++;
			else if(!isAlphanumeric(str.charAt(right)))
				right--;
			else if(lowerCase(str.charAt(left)) != lowerCase(str.charAt(right)))
				return false;
			else {
				left++;
				right--;
			}
		}
		return true;
	}
	
	private static boolean isAlphanumeric(char c) {
		return ('a'<=c && c<='z') || ('A'<=c && c<='Z') || ('0'<=c && c<='9');
	}
	private static char lowerCase(char c) {
		if('a'<=c && c<='z' || ('0'<=c && c<='9'))
			return c;
		return (char)((int)c+32);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Red rum, sir, is murder";
		System.out.println(isPalindrome(str));
	}

}
