import java.util.Arrays;

public class Search_ele_sorted_rotated_array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {4,5,6,7,0,1,2};
		Arrays.sort(arr);
		int n=arr.length;
		int num=4,flag=0,pos=0;
		for(int i=0;i<n/2;i++)
		{
			int temp=arr[i];
			arr[i]=arr[n-i-1];
			arr[n-i-1]=temp;
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
			if(num==arr[i])
			{
				flag=1;
				pos=i;
			}
		}
		if(flag==1) {
			System.out.println("\n"+num+" found at pos "+pos);
		}
		else {
			System.out.println("not found");
		}
	}

}
