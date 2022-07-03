
public class add_binary {

	public static String  addBinary(String a,String b) {
		int carry=0;
		String result="";
		int i=0;
		int alen=a.length();
		int blen=b.length();
		while(i<alen||i<blen||carry!=0) {
			int x=0;
			if(i<alen && a.charAt(alen-1-i)=='1')
				x=1;
			int y=0;
			if(i<blen && b.charAt(blen-1-i)=='1')
				y=1;
			result=(x+y+carry)%2+result;
			carry=(x+y+carry)/2;
			i++;
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="111",b="1";
		System.out.println(addBinary(a,b));
		
	}

}
