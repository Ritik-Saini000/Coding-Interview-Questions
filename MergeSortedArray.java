import java.util.Arrays;

public class MergeSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,3,4,7,10,12,20};
		int b[]= {2,3,6,15,16};
	    int c[]=new int[a.length+b.length];
	    int count=0;
	    
	    for(int i=0;i<a.length;i++)
	    {
	    	c[i]=a[i];
	    	count++;
	    }
	    for(int j=0;j<b.length;j++)
	    {
	    	c[count++]=b[j];
	    }
	    Arrays.sort(c);
	    for(int i=0;i<c.length;i++)
	    	System.out.print(c[i]+" ");
	}

}
