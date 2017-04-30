package practice.algorithm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by l-rui on 2017/4/30.
 * Given two strings s and t, determine if they are isomorphic.
 * Two strings are isomorphic if the characters in s can be replaced to get t.
 * All occurrences of a character must be replaced with another character while preserving the order of characters.
 * No two characters may map to the same character but a character may map to itself.
 * 给定两个字符串s和t，确定它们是否是同构的。
 * 如果s中的字符可以被替换得到t，则两个字符串是同构的。
 * 字符的所有出现必须用另一个字符代替，同时保留字符的顺序。 没有两个字符可能映射到同一个字符，但一个字符可能映射到自己。
 */
public class IsomorphicStrings {

    public boolean isIsomorphic(String s, String t) {
        if(s==null || t==null) return false;
        if(s.length() != t.length()) return false;

        Map<Character, Character> map = new HashMap<Character, Character>();
        Set<Character> set = new HashSet<Character>();

        for(int i=0; i<s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if(map.containsKey(c1)) {
                if(map.get(c1) != c2) return false;
            } else {
                if(set.contains(c2)) return false;
                else {
                    map.put(c1, c2);
                    set.add(c2);
                }
            }
        }
        return true;
    }


}
