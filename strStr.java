import java.util.Scanner;

public class strStr {
	
	static int str_Str(String haystack,String needle) {
		 if(needle.isEmpty()){
	            return 0;
	        }
	        if(haystack.length()<needle.length()){
	            return -1;
	        }
	        
	        for(int i=0;i<haystack.length()-needle.length()+1;i++){
	            if(haystack.charAt(i)==needle.charAt(0)){
	                for(int j=0;j<needle.length();j++){
	                    if(haystack.charAt(i+j)!=needle.charAt(j)){
	                        break;
	                    }
	                    if(j==needle.length()-1){
	                        return i;
	                    }
	                }
	                
	            }
	        }
	        return -1;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		System.out.println("Enter HayStack");
		String haystack=sc.nextLine();
		System.out.println("Enter needle");
		String needle=sc.nextLine();
		
		System.out.println(str_Str(haystack, needle));
		
	}
	

}
