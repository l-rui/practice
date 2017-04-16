package practice.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by l-rui on 2017/4/16.
 * Given an array of integers and an integer k,
 * find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the
 * absolute difference between i and j is at most k.
 * 给定整数数组和整数k，找出数组中是否有两个不同的索引i和j，使得nums [i] = nums [j]，i和j之间的绝对差值最多为k。
 */
public class ContainsDuplicateII {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums.length <= 1) {
            return false;
        }
        Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i]) && i - hashMap.get(nums[i]) <= k) {
                return true;
            }
            hashMap.put(nums[i], i);
        }
        return false;
    }

}
