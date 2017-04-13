package practice.algorithm;

/**
 * Created by lirui on 2017/4/13.
 * Determine whether an integer is a palindrome. Do this without extra space.
 * 确定一个整数是否是回文。 做这个没有额外的空间。
 * 思路：
 * 从两头依次取数字比较，向中间推进。
 */
public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int len = 1;
        while (x / len >= 10) {
            len *= 10;
        }
        while (x != 0) {
            int left = x / len;
            int right = x % 10;
            if (left != right) {
                return false;
            }
            x = (x % len) / 10;
            len /= 100;
        }
        return true;
    }

}
