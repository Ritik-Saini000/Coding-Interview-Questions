import java.util.Scanner;

public class ThreeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int arr[]=new int[10];
		System.out.println("Enter array:");
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		System.out.println("Enter sum");
		int sum=sc.nextInt();
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				for(int k=i+2;k<arr.length;k++)
				{
					if(arr[i]+arr[j]+arr[k]==sum) {
						count++;
						System.out.print(arr[i]+" "+arr[j]+" "+arr[k]+"\n");
					}
				}
			}
		}
		System.out.println("\nFrequency="+count);
	}

}
