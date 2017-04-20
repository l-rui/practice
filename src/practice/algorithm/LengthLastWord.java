package practice.algorithm;

/**
 * Created by lirui on 2017/4/20.
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ',
 * return the length of last word in the string.If the last word does not exist, return 0.
 * 给定一个字符串s由大小写字母和空字符“'组成，返回字符串中最后一个字的长度。如果最后一个字不存在，则返回0。
 */
public class LengthLastWord {

    public int lengthOfLastWord(String s) {
        if(s.trim().equals("")|| s.length() == 0){
            return 0;
        }
        String[] ss = s.trim().split(" ");
        int len = ss.length;
        return ss[len - 1].length();
    }

}
