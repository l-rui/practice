package practice.algorithm;

/**
 * Created by l-rui on 2017/3/19.
 * Find the nth digit of the infinite integer sequence 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ...
 * 找到无限整数序列的第n个数字1，2，3，4，5，6，7，8，9，10，11，...
 * 思路：可以分三步来做：
 * １、找出给定的n落在几位数的范围内
 * ２、找到具体落在哪个数字
 * ３、找出具体在哪一位上
 */
public class NthDigit {

    public int findNthDigit(int n) {
        long m=n;
        long start=1,  len=1,  count=9;

        while(m>len*count){
            m=m-len*count;
            len++;
            count=count*10;
            start=start*10;
        }
        start = start + (m-1)/len;

        return String.valueOf(start).charAt((int)((m-1)%len))-'0';
    }

    public static void main(String[] args) {
        NthDigit nd = new NthDigit();
        System.out.println(nd.findNthDigit(3));
    }

}
