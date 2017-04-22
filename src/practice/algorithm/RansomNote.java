package practice.algorithm;

/**
 * Created by l-rui on 2017/4/22.
 * Given an arbitrary ransom note string and another string containing letters from all the magazines,
 * write a function that will return true if the ransom note can be constructed from the magazines ;
 * otherwise, it will return false.
 * 给定一个任意的赎金票据字符串和另一个字符串，包含所有杂志的字母，写一个函数，
 * 如果可以从杂志中构建赎金票据，则返回true; 否则会返回false。
 */
public class RansomNote {

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] cnt = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            cnt[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if(--cnt[ransomNote.charAt(i)-'a'] < 0) {
                return false;
            }
        }
        return true;
    }

}
