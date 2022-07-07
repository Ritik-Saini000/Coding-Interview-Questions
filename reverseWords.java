
public class reverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="the sky is blue";
		String splitArray[]=str.split(" ");
		for(int i=splitArray.length-1;i>=0;i--) {
			System.out.print(splitArray[i]+" ");
		}
		
	}

}
