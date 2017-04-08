package practice.algorithm;

/**
 * Created by l-rui on 2017/4/8.
 * Given an array of integers, every element appears twice except for one. Find that single one.
 * 给定整数数组，除了一个元素之外，每个元素都会出现两次。找到那个单一的。
 */
public class SingleNumber {

    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result = result ^ num;
        }
        return result;
    }

}
