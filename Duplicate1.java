import java.util.Arrays;

public class Duplicate1 {
	public static boolean containsDuplicate(int arr[]) {
		Arrays.sort(arr);
		int flag=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j])
					flag=1;	
			}
		}
		if(flag==1)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,3,5,9,7,3};
		System.out.println(containsDuplicate(arr));
	}

}
