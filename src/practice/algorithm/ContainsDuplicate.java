package practice.algorithm;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by l-rui on 2017/4/4.
 * Given an array of integers, find if the array contains any duplicates.
 * Your function should return true if any value appears at least twice in the array,
 * and it should return false if every element is distinct.
 * 给定整数数组，查找数组是否包含任何重复项。
 * 如果数组中的任何值至少出现两次，则函数应返回true，如果每个元素都不同，则返回false。
 */
public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        if (nums != null && nums.length > 1) {
            Set<Integer> set = new HashSet<>(nums.length);
            for(int i : nums) {
                if (set.contains(i)) {
                    return true;
                }
                else {
                    set.add(i);
                }
            }
        }
        return false;
    }

}
