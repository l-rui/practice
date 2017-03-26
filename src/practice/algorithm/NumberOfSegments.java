package practice.algorithm;

/**
 * Created by l-rui on 2017/3/26.
 * Count the number of segments in a string, where a segment is defined to be a contiguous sequence of non-space characters.
 * 计算字符串中的段数，其中段被定义为非空格字符的连续序列。
 * 思路：
 * 遍历字符串，当当前字符不为' '且前一个字符为' '时，计数器+1，注意一些边界值。
 */
public class NumberOfSegments {

    public int countSegments(String s) {
        int count = 0;
        if (null == s || s.length() == 0) {
            return count;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ' && (i == 0 || s.charAt(i - 1) == ' ')) {
                count++;
            }
        }
        return count;
    }

}
