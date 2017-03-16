package practice.algorithm;

/**
 * Created by l-rui on 2017/3/13.
 * Given a binary array, find the maximum number of consecutive 1s in this array.
 * 给定二进制数组，找到此数组中连续1的最大数目。
 * 思路：
 * 1、给定两个变量count，max，count记录当前连续次数，max记录当前最大连续次数；
 * 2、遍历数组，当当前num值为1时，count++，否则比较count和max，如果count>max则将count赋值给max；
 * 3、最终返回max和count中较大的一个。
 */
public class MaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        for (int num : nums) {
            if (num == 1) {
                count++;
            } else {
                max = max > count ? max : count;
                count = 0;
            }
        }
        return max > count ? max : count;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        MaxConsecutiveOnes mco = new MaxConsecutiveOnes();
        System.out.println(mco.findMaxConsecutiveOnes(nums));
    }

}
