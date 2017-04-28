package practice.algorithm;

/**
 * Created by l-rui on 2017/4/28.
 * Write an algorithm to determine if a number is "happy".
 * A happy number is a number defined by the following process: Starting with any positive integer,
 * replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay),
 * or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.
 * 编写一个算法来确定一个数字是否“开心”。
 * 幸福的数字是由以下过程定义的数字：从任何正整数开始，将数字替换为数字的平方和，并重复该过程，
 * 直到数字等于1（将保留在哪里），或者循环 一个不包括在内的循环的循环中，这个过程以1结尾的数字是快乐的数字。
 */
public class HappyNumber {

    public boolean isHappy(int n) {
        if(n==0){
            return false;
        }
        if(n==1){
            return true;
        }
        int temp=0;
        boolean flag[]=new boolean[811];
        int remainder = 0;
        while(true){
            while(n!=0){
                remainder = n % 10;
                n = n / 10;
                temp += remainder * remainder;
            }
            if(temp==1){
                return true;
            }
            if(flag[temp]){
                return false;
            }else{
                flag[temp]=true;
            }
            n=temp;
            temp=0;
        }
    }

}
