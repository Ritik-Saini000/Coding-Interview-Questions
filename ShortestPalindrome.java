
public class ShortestPalindrome {
	 public static String shortestPalindrome(String s) {
	        
	        String rev_s=new StringBuilder(s).reverse().toString();
	        String l=s+"#"+rev_s;
	        int[] p=new int[l.length()];
	        
	        for(int i=1;i<l.length();i++)
	        {
	            int j=p[i-1];
	            while(j>0 && l.charAt(i)!=l.charAt(j))
	                j=p[j-1];
	            
	            if(l.charAt(i)==l.charAt(j))
	                p[i]=j+1;
	            
	        }
	        return rev_s.substring(0, s.length() - p[l.length()-1])+s;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="aacecaaa";
		System.out.println(shortestPalindrome(s));
	}

}
