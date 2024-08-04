import java.util.*;
public class IsomorphicString {
    public static boolean main(String []args)
    {
        String s="foo";
        String t="bar";
    if (s.length() != t.length()) {
        return false;
    }
     HashMap<Character, Character> hm = new HashMap<>();

    for (int i = 0; i < s.length(); i++) 
    {
        char charS = s.charAt(i);
        char charT = t.charAt(i);

        if (hm.containsKey(charS)) 
        {
            if (hm.get(charS) != charT) 
            {
                return false;
            }
        } 
        else 
        {
            if (hm.containsValue(charT)) 
            {
                return false; // charT is already mapped to another char in s
            }
            hm.put(charS, charT);
        }
    }

    return true;

    }
}
