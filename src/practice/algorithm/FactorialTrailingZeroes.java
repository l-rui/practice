package practice.algorithm;

/**
 * Created by l-rui on 2017/3/7.
 * Given an integer n, return the number of trailing zeroes in n!.
 * 给定一个整数n，返回n!结果中末尾有多少个0。
 * 思路：将n!分解为质数相乘，例如：5!=1*2*3*2*2*5；会发现：只有当2*5时，结果末尾才会出现0，所以，只需要找出n的阶乘中有多少对(2,5)，即可知
 * 道结果末尾的0的个数，又因为分解为质数后，2的个数总是多余5，所以，只需要找出5的个数即可。
 */
public class FactorialTrailingZeroes {

    public int trailingZeroes(int n) {
        int res = 0;
        while (n > 0) {
            res += n / 5;
            n /= 5;
        }
        return res;
    }

    public static void main(String[] args) {
        FactorialTrailingZeroes ftz = new FactorialTrailingZeroes();
        int res = ftz.trailingZeroes(15);
        System.out.println(res);
    }

}
