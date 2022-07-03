import java.util.Arrays;

public class Duplicate2 {
	public static boolean containsDuplicate(int arr[],int k) {
		int diff=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					diff=j-i;
				}
			}
		}
		if(diff<=k)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,2,3,1,2,3};
		int k=2;
		System.out.println(containsDuplicate(arr,k));
	}

}
