import java.util.*;
public class IsomorphicString {

    public static boolean isomorphic(String s, String t) {
        if(s == null)  return false;
        if(t == null)  return false;
        if(s.length() != t.length()) return false;
        if(s.length() == 0 && t.length() == 0) return true;
        Map<character, character=""> map = new HashMap<character, character="">();
        for(int i = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i))) {
                if(map.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
            } else {
                map.put(s.charAt(i), t.charAt(i));
