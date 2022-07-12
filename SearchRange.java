class Solution {
    public int[] searchRange(int[] arr, int target) {
	        int[] result=new int [2];
	        result[0]=findStartingIndex(arr,target);
	        result[1]=findEndingIndex(arr,target);
	        return result;
	    }
	    public int findStartingIndex(int[] arr,int target){
	        int index=-1;
	        
	        int start=0;
	        int end=arr.length-1;
	        
	        while(start<=end){
	            int mid=(start+end)/2;
	            if(arr[mid]==target)
	                index=mid;
	            if(target<=arr[mid])
	            {
	                end=mid-1;
	            }
	            else
	            {
	                start=mid+1;
	            }
	        }
	        return index;
	    }
	    public int findEndingIndex(int[] arr,int target){
	        int index=-1;
	        
	        int start=0;
	        int end=arr.length-1;
	        
	        while(start<=end){
	            int mid=(start+end)/2;
	            if(arr[mid]==target)
	                index=mid;
	            if(target>=arr[mid]){
	                start=mid+1;
	            }
	            else
	                end=mid-1;
	        }
	        return index;
	    }
}
