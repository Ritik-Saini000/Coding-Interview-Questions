
public class RemoveElement {

	public static int removeElement(int arr[],int elem) {
		int i=0,j=0;
		while(j<arr.length) {
			if(arr[j]!=elem) {
				arr[i]=arr[j];
				i++;
			}
			j++;
		}
		return i;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {2,3,2,3,3,5,7,8,5,9};
		int elem=3;
		System.out.println(removeElement(arr,elem));
	}

}
