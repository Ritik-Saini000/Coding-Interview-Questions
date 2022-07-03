import java.util.Arrays;

public class Min_ele_sorted_rotated_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {4,5,6,7,0,1,2};
		Arrays.sort(arr);
		int n=arr.length;
		for(int i=0;i<n/2;i++)
		{
			int temp=arr[i];
			arr[i]=arr[n-i-1];
			arr[n-i-1]=temp;
		}
		System.out.println("Min="+arr[n-1]);
	}

}
