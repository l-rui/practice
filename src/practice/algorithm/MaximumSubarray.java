package practice.algorithm;

/**
 * Created by lirui on 2017/4/24.
 * Find the contiguous subarray within an array (containing at least one number) which has the largest sum.
 * 在数组中找到连续的子阵列（包含至少一个数字），其数量最大。
 */
public class MaximumSubarray {

    public int maxSubnumsrray(int[] nums) {
        int[] sum = new int[nums.length];

        int max = nums[0];
        sum[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            sum[i] = Math.max(nums[i], sum[i - 1] + nums[i]);
            max = Math.max(max, sum[i]);
        }
        return max;
    }

}
