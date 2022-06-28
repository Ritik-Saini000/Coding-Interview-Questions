import java.util.Scanner;

public class KthSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter array:");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.println("Enter value of k:");
		int k=sc.nextInt();
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			if(i==k-1)
				System.out.println(k+"th smallest element is "+arr[i]);
		}
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}

}
