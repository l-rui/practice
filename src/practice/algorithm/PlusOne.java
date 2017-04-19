package practice.algorithm;

/**
 * Created by lirui on 2017/4/19.
 * Given a non-negative integer represented as a non-empty array of digits, plus one to the integer.
 * 给定一个非负整数，表示为非空数组数，加一个整数。
 */
public class PlusOne {

    public int[] plusOne(int[] digits) {
        if(digits == null || digits.length==0)
            return digits;
        int carry = 1;
        for(int i=digits.length-1;i>=0;i--)
        {
            int digit = (digits[i]+carry)%10;
            carry = (digits[i]+carry)/10;
            digits[i] = digit;
            if(carry==0)
                return digits;
        }
        int [] res = new int[digits.length+1];
        res[0] = 1;
        return res;
    }

}
