package practice.algorithm;

/**
 * Created by root on 2017/3/11.
 * Given a positive integer, output its complement number. The complement strategy is to flip the bits of its binary representation.
 * 给定一个正整数，输出它的补码数。补码策略是翻转二进制表示的位。
 * 思路：异或运算符可以满足求补的过程。 如果a和b“互补”，那么a^b=(1....1)  (展开多少位就有多少个1)。注意越界问题。
 */
public class NumberComplement {

    public int findComplement(int num) {
        int count = 0;
        int n = num;
        while (num > 0) {
            count++;
            num = num / 2;
        }
        int t = (int) Math.pow(2, count);
        t = t == Integer.MAX_VALUE ? t : t - 1;
        return t ^ n;
    }
    public static void main(String[] args) {
        NumberComplement nc = new NumberComplement();
        System.out.println(nc.findComplement(2147483645));
        System.out.println(Integer.MAX_VALUE);
    }

}
