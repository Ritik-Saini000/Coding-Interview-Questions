
public class Duplicate3 {
	
	public static boolean containsDuplicate(int arr[],int k,int t) {
		int diff1=0,diff2 = 0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					diff1=Math.abs(arr[i]-arr[j]);
					diff2=Math.abs(i-j);
				}
			}
		}
		if(diff1<=t && diff2<=k)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,5,9,1,5,9};
		int k=2;
		int t=3;
		System.out.println(containsDuplicate(arr,k,t));
	}

}
