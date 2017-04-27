package practice.algorithm;

/**
 * Created by lirui on 2017/4/27.
 * Given two binary strings, return their sum (also a binary string).
 * 给定两个二进制字符串，返回它们的和（也是一个二进制字符串）。
 */
public class AddBinary {

    public String addBinary(String a, String b) {
        int maxLen = Math.max(a.length(), b.length());
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        for (int i = 0; i < maxLen; i++) { //从右边开始逐位取出字符串 a、b 的字符值 tempA 和 tempB，如果长度不足，则用0替代
            int tempA = a.length() > i ? a.charAt(a.length() - i - 1) - '0' : 0;
            int tempB = b.length() > i ? b.charAt(b.length() - i - 1) - '0' : 0;
            sb.insert(0, (tempA + tempB + carry) % 2);  //在最左侧插入相加结果
            carry = tempA + tempB + carry > 1 ? 1 : 0;  //得到进位
        }
        if (carry == 1) sb.insert(0, 1);  //如果最高位有进位，则最高位还要加一位 1
        return sb.toString();
    }

}
