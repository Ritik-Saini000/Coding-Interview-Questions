
public class IntegerBreak {

	static int integerBreak(int n) {
		if(n==2) return 1;
		if(n==3) return 2;
		int product=1;
		while(n>4) {
			product*=3;
			n-=3;
		}
		return product*n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(integerBreak(10));
	}

}
