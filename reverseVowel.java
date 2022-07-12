
public class reverseVowel {
	 
	private static boolean isVowel(char c){
	        if(c=='a' || c=='A' ||c=='e' || c=='E' ||c=='i' || c=='I' ||c=='o' || c=='O' ||c=='u' || c=='U')
	            return true;
	        return false;
	    }
	    public static String reverseVowels(String str) {
	        int start=0;
	        int end=str.length()-1;
	        
	        char charArr[]=str.toCharArray();
	        while(start<end){
	            if(!isVowel(charArr[start])){
	                start++;
	                continue;
	            }
	            if(!isVowel(charArr[end])){
	                end--;
	                continue;
	            }
	            
	            char c=charArr[start];
	            charArr[start]=charArr[end];
	            charArr[end]=c;
	            start++;
	            end--;
	        }
	        return String.valueOf(charArr);
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="hello";
		System.out.println(reverseVowels(str));
	}

}
