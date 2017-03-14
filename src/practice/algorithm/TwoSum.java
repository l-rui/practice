package practice.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lirui on 2017/3/14.
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * 给定一个整数数组，返回两个数字的索引，使得它们加起来成为一个特定的目标。
 * 思路：
 * 1、循环nums，每次都判断nums中当前值是否在map中，不在则添加，key为数值，value为索引，若存在则直接取到当前索引保存为n；
 * 2、查看map中是否存在（target-当前数值）这个数，若存在，则返回n和当前i。
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer n = map.get(nums[i]);
            if (null == n) {
                map.put(nums[i], i);
            }
            n = map.get(target - nums[i]);
            if (n != null && n < i) {
                res[0] = n;
                res[1] = i;
                return res;
            }
        }
        return res;
    }

}
