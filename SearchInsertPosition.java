
public class SearchInsertPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,3,5,7,9};
		int target=6;
		int start=0,mid,end=arr.length-1;
		while(start<=end)
		{
			mid=(start+end)/2;
			if(target==arr[mid]) {
				System.out.println(mid);
				System.exit(0);
			}
				
			else if(target<arr[mid])
				end=mid-1;
			else
				start=mid+1;
		}
		System.out.println(start);
	}

}
