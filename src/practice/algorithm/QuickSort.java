package practice.algorithm;

/**
 * Created by lirui on 2017/4/11.
 * 快排
 */
public class QuickSort {

    public int[] sort(int[] nums, int left, int right) {
        if (left > right) {
            return nums;
        }
        // 设置基准数
        int t = nums[left];
        int i = left;
        int j = right;
        while (i != j) {
            // 从右往左，如果j位的数大于等于基准数，或者j小于等于i，停止循环
            while(nums[j]>=t && i<j) {
                j--;
            }
            // 从左往右，如果j位的数小于等于基准数，或者j小于等于i，停止循环
            while(nums[i]<=t && i<j) {
                i++;
            }
            // 将i和j对应的两个数的位置交换
            if (i < j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        // 基准数归位
        nums[left] = nums[i];
        nums[i] = t;
        // 递归处理左右两个子集
        sort(nums, left, i - 1);
        sort(nums, i + 1, right);

        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};
        QuickSort qs = new QuickSort();
        qs.sort(nums, 0, nums.length - 1);
        for (int num : nums) {
            System.out.println(num);
        }
    }
}
