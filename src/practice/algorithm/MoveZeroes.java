package practice.algorithm;

import java.util.Arrays;

/**
 * Created by l-rui on 2017/3/18.
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * 给定一个数组nums，写一个函数将所有的0移动到它的结尾，同时保持非零元素的相对顺序。
 * 思路：
 * 1、将非0数字依次向前移动；
 * 2、将后面空出的部分全部补0
 */
public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        int cur = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[cur] = nums[i];
                cur++;
            }
        }

        for (int i = cur; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        MoveZeroes mz = new MoveZeroes();
        int[] nums = {0, 1, 0, 3, 12};
        mz.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

}
