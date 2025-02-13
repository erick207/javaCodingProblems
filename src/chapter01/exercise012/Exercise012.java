package chapter01.exercise012;

import java.util.HashMap;
import java.util.Map;

public class Exercise012 {
    public static void main(String[] args) {
        var s1 = "abbcdd";
        var s2 = "qwwerr";
        var s3 = "abcxyz";

        System.out.println(isIsomorphic(s1, s2));
        System.out.println(isIsomorphic(s1, s3));
    }

    private static boolean isIsomorphic(String s1, String s2) {
        if(s1.length() != s2.length() ||
           s1 == null ||
           s2 == null) return false;
        
        Map<Character, Character> map = new HashMap<>();

        for(int i = 0; i < s1.length(); i++) {
            if(map.get(s1.charAt(i))==null) {
                map.put(s1.charAt(i), s2.charAt(i));
            } else {
                if(map.get(s1.charAt(i)) == s2.charAt(i)) {
                    continue;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
