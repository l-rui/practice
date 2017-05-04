package practice.algorithm;

/**
 * Created by l-rui on 2017/5/4.
 * The count-and-say sequence is the sequence of integers beginning as follows:
 * 1, 11, 21, 1211, 111221, ...
 * 1 is read off as "one 1" or 11.
 * 11 is read off as "two 1s" or 21.
 * 21 is read off as "one 2, then one 1" or 1211.
 * Given an integer n, generate the nth sequence.
 * count-and-say序列是从以下开始的整数序列：
 * 1，11，21，1211，111221，...
 * 1被读取为“一1”或11。
 * 11被读取为“两个1”或21。
 * 21被读取为“一个2，然后一个1”或1211。
 * 给定整数n，生成第n个序列。
 */
public class CountAndSay {

    public String countAndSay(int n) {
        if (n <= 0){
            return null;
        }
        String result = "1";
        int i = 1;
        while (i < n) {
            StringBuilder sb = new StringBuilder();
            int count = 1;
            for (int j = 1; j < result.length(); j++) {
                if (result.charAt(j) == result.charAt(j - 1)) {
                    count++;
                } else {
                    sb.append(count);
                    sb.append(result.charAt(j - 1));
                    count = 1;
                }
            }
            sb.append(count);
            sb.append(result.charAt(result.length() - 1));
            result = sb.toString();
            i++;
        }
        return result;
    }


}
