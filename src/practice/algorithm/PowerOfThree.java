package practice.algorithm;

/**
 * Created by l-rui on 2017/4/9.
 * Given an integer, write a function to determine if it is a power of three.
 * 给定一个整数，写一个函数来确定它是否是三的幂。
 */
public class PowerOfThree {
    public boolean isPowerOfThree(int n) {
        double temp = 10e-15;
        if(n==0) return false;
        double res = Math.log(n) / Math.log(3);
        return Math.abs(res-Math.round(res)) < temp;
    }
}
