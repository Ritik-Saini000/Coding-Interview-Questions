import java.util.Scanner;

public class rotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int arr[]=new int [7];
		System.out.println("Enter array");
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		System.out.println("Enter order");
		int order=sc.nextInt();
		
		for(int i=0;i<order;i++)
		{
			for(int j=arr.length-1;j>0;j--)
			{
				int temp=arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=temp;
			}
		}
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}

}
