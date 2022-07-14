import java.util.HashMap;

public class wordPattern {
	public static boolean wordPattern(String pattern, String str) {
        String[] words=str.split(" ");
        if(words.length != pattern.length()) return false;
        
        HashMap<Character , String> map=new HashMap();
        for(int i=0;i<pattern.length();i++){
            char current_char=pattern.charAt(i);
            if(map.containsKey(current_char)){
                if(!map.get(current_char).equals(words[i])){
                    return false;
                }
            }
            else
            {
                if(map.containsValue(words[i])){
                    return false;
                }
                map.put(current_char, words[i]);
            }
        }
        return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String pattern="abbaa";
		String str="dog cat cat dog dog";
		System.out.println(wordPattern(pattern,str));
	}

}
