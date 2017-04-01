package practice.algorithm;

/**
 * Created by l-rui on 2017/4/1.
 * Write a function to find the longest common prefix string amongst an array of strings.
 * 编写一个函数来查找字符串数组中最长的公共前缀字符串。
 */
public class LongestCommonPrefix {

    private int minlen(String[] strs) {
        int min = Integer.MAX_VALUE;
        for(int i=0; i<strs.length;i++)
            min = Math.min(min,strs[i].length());
        return min;
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";

        StringBuilder res = new StringBuilder();
        int index = 0;
        int len = minlen(strs);
        while (index < len){
            for (int i=1; i<strs.length;i++){
                if (strs[i].charAt(index) != strs[0].charAt(index))
                    return res.toString();
            }
            res.append(strs[0].charAt(index));
            index++;
        }
        return res.toString();
    }

}
