package practice.algorithm;

/**
 * Created by lirui on 2017/5/3.
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
 * 给定一个包含从0，1，2，..，n中取出的n个不同数字的数组，找到数组中缺少的数组。
 */
public class MissingNumber {

    public int missingNumber(int[] nums) {
        int[] nums2 = new int[nums.length + 1];
        for (int i = 0; i < nums2.length; i++) {
            nums2[i] = i;
        }
        for (int i = 0; i < nums.length; i++) {
            nums2[nums[i]] = -1;
        }
        for (int i = 0; i < nums2.length; i++) {
            if (nums2[i] != -1) {
                return i;
            }
        }
        return -1;
    }

}
