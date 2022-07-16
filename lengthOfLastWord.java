
public class lengthOfLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="   fly me   to   the moon  ";
		int result=0;
		for(int i=str.length()-1;i>=0;i--)
		{
			if(str.charAt(i)!=' ')
			{
				result++;
				continue;
			}
			if(result>0)
				break;
		}
		System.out.println(result);
	}

}
