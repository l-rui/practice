package practice.algorithm;

/**
 * Created by l-rui on 2017/4/3.
 * You are climbing a stair case. It takes n steps to reach to the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * 你正在爬楼梯的情况。达到顶部需要几个步骤。
 * 每次你可以爬1或2步。你可以爬多少个不同的方式爬上去？
 */
public class ClimbingStairs {
    public int climbStairs(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        int pre = 2, beforePre = 1;
        int curr = 3;
        for (int i = 3; i <= n; ++i) {
            curr = pre + beforePre;
            beforePre = pre;
            pre = curr;
        }
        return curr;
    }
}
