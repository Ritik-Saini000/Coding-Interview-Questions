import java.util.Arrays;

public class MajorityElement {

	public static int majorityElement(int arr[]) {
		if(arr.length==1) {
			return arr[0];
		}
		
		Arrays.sort(arr);
		return arr[arr.length/2];
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {2,2,1,1,1,2,2};
		System.out.println(majorityElement(arr));
	}

}
