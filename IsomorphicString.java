
public class IsomorphicString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="foo";
		String t="bar";
		int flag=0;
		if(s==null || t==null || s.length()!=t.length()) 
		{
			flag=1;
			System.out.println("not Isomorphic");
			System.exit(0);
		}
		
		char ar1[]=new char[256];
		char ar2[]=new char[256];
		
		
		for(int i=0;i<s.length();i++)
		{
			char sChar=s.charAt(i);
			char tChar=t.charAt(i);
			if(ar1[sChar]==0 && ar2[tChar]==0) {
				ar1[sChar]=tChar;
				ar2[tChar]=sChar;
			}
			else if(ar1[sChar]!=tChar) {
				flag=1;
			}
		}
		
		
		if(flag==1)
			System.out.println("not Isomorphic");
		else
			System.out.println("Isomorphic");
	}

}
