package practice.algorithm;

/**
 * Created by lirui on 2017/4/12.
 * Given a sorted array and a target value, return the index if the target is found. If not,
 * return the index where it would be if it were inserted in order.
 * 给定排序的数组和目标值，如果找到目标，返回索引。 如果没有，如果按顺序插入索引就返回索引。
 * 思路：直接二分法查找
 */
public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        int mid;
        int lo = 0;
        int hi = nums.length - 1;

        while (lo <= hi) {
            mid = lo + (hi - lo)/ 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target){
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }

}
