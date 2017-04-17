package practice.algorithm;

/**
 * Created by l-rui on 2017/4/17.
 * Given two strings s and t, write a function to determine if t is an anagram of s.
 *
 * 思路：
 * 变形词的本质是两个单词中，每个字母出现的次数相同，所以我们可以用一个哈希表，记录第一个单词中每个字母的个数，再遍历第二个单词，
 * 减去相应的字母出现次数，如果某个字母的计数器不为0了，则说明某个字母出现的次数不一样。这里只用了一个大小为26的数组，
 * 是假设只会出现英文字母。
 */
public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        int[] table = new int[26];
        // 记录字母在第一个单词中出现的次数
        for(int i = 0; i < s.length(); i++){
            table[s.charAt(i)-'a']++;
        }
        // 减去字母在第二个单词中出现的次数
        for(int i = 0; i < t.length(); i++){
            table[t.charAt(i)-'a']--;
        }
        // 如果某个计数器不为0，则返回假
        for(int i = 0; i < 26; i++){
            if(table[i]!=0) return false;
        }
        return true;
    }

}
