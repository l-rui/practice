package practice.algorithm;

/**
 * Created by l-rui on 2017/3/20.
 * You are a professional robber planning to rob houses along a street.
 * Each house has a certain amount of money stashed,
 * the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and
 * it will automatically contact the police if two adjacent houses were broken into on the same night.
 * 你是一个专业的强盗计划抢一条街的房子。
 * 每个房子都有一定金额的钱，唯一的约束，
 * 阻止你抢劫他们是相邻的房子有安全系统连接，
 * 如果两个相邻的房子被打破在同一个夜晚，它会自动联系警察。
 * 思路：
 * 动态规划
 */
public class HouseRobber {

    public int rob(int[] nums) {
        if(nums==null || nums.length==0) {
            return 0;
        }
        int n = nums.length;
        int [] b = new int[n];
        int [] d = new int[n];
        b[0] = nums[0];
        d[0] = 0;
        for(int i=1; i<n; i++) {
            b[i] = d[i-1] + nums[i];
            d[i] = Math.max(b[i-1], d[i-1]);
        }
        return Math.max(d[n-1], b[n-1]);
    }

    public static void main(String[] args) {
        HouseRobber hr = new HouseRobber();
        int[] nums = {};
        System.out.println(hr.rob(nums));
    }

}
