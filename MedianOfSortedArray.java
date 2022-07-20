import java.util.Arrays;

public class MedianOfSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,3};
		int b[]= {2};
		
		double c[]=new double[a.length+b.length];
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
	    double e=0,o=0;
	    int flag=0;
	    int len=c.length;
	    double mid=len/2;
	    for(int i=0;i<len;i++)
	    {
	    	if(len%2==0)
		    {
	    		flag=1;
		    	e=((c[(int) (mid-1)])+(c[(int) mid]))/2;	
		    }
	    	else
	    	{
	    		o=c[(int) mid];
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
