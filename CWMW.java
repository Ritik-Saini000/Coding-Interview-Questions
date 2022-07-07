
public class CWMW {

	public static int maxArea(int height[]) {
		if(height==null || height.length<2) {
			return 0;
		}
		int max=0;
		int left=0;
		int right=height.length-1;
		while(left<right) {
			if(height[left]<height[right]){
                max = Math.max(max, height[left]*(right-left));
                left++;
            }else{
                max = Math.max(max, height[right]*(right-left));
                right--;
            }
        }
        return max;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int height[]= {1,8,6,2,5,4,8,3,7};
		System.out.println(maxArea(height));
	}

}
