package practice.algorithm;

import java.util.HashMap;
import java.util.Objects;

/**
 * Created by l-rui on 2017/4/23.
 * Given a pattern and a string str, find if str follows the same pattern.
 * 给出一组模式（pattern）和一个字符串（str），查看字符串是否与模式匹配
 */
public class WordPattern {

    public boolean wordPattern(String pattern, String str) {
        if (pattern.isEmpty() || str.isEmpty()) {
            return false;
        }

        String[] s = str.split(" ");
        if (s.length != pattern.length()) {
            return false;
        }

        @SuppressWarnings("rawtypes")
        HashMap<Comparable, Integer> hashMap = new HashMap<Comparable, Integer>();
        for (int i = 0; i < pattern.length(); i++) {
            if (!Objects.equals(hashMap.put(pattern.charAt(i), i), hashMap.put(s[i], i)))
                return false;
        }

        return true;
    }

}
