
public class findPeakElement {
	public static int findPeakElement(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=(start+end)/2;
            if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }
            else{
                end=mid;
            }
        }
        return start;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,2,1,3,5,6,4};
		System.out.println(findPeakElement(arr));
	}

}
