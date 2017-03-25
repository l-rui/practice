package practice.algorithm;

/**
 * Created by l-rui on 2017/3/25.
 * Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
 * 给定一个非负整数num，重复地添加所有其数字，直到结果只有一个数字。时间复杂度为O(1)。
 *
 */
public class AddDigits {

    public int addDigits(int num) {
        return (num-1)%9+1;
    }

}
