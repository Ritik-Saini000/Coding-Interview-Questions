
public class CountandSay {

	public static String countAndSay(int n) {
		if(n==1)
			return "1";
		String s=countAndSay(n-1);
		int count=1,i=1,num=s.charAt(0)-'0';
		StringBuilder t=new StringBuilder();
		while(i<s.length()) {
			if(s.charAt(i)-'0'==num)
				count++;
			else {
				t.append(count).append(num);
				num=s.charAt(i)-'0';
				count=1;
			}
			i++;
		}
		t.append(count).append(num);
		return t.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=1;
		System.out.println(countAndSay(n));
	}

}
