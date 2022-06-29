import java.util.Arrays;

public class MedianOfSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,3,4,7,10,12};
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
	    int e=0,o=0,flag=0;
	    int len=c.length;
	    int mid=len/2;
	    for(int i=0;i<len;i++)
	    {
	    	if(len%2==0)
		    {
	    		flag=1;
		    	e=((c[mid-1])+(c[mid]+1))/2;	
		    }
	    	else
	    	{
	    		o=c[mid];
	    	}
	    }
	    for(int i=0;i<len;i++) {
	    	System.out.print(c[i]+" ");
	    }
	    	
	    if(flag==1)
	    	System.out.println("\nMedian even terms="+e);
	    else
	    	System.out.println("\nMedian odd terms="+o);
	    
	}

}
