package practice.algorithm;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by root on 2017/3/15.
 * Given two arrays, write a function to compute their intersection.
 * 给定两个数组，写一个函数来计算它们的交集。
 * 思路：
 * 1、将第一个数组放入set_nums1中；
 * 2、遍历第二个数组，判断当前元素是否包含在set_nums1中，若在，则set_nums2增加当前元素；
 * 3、遍历set_nums2并将元素添加到一个数组中并返回；
 */
public class IntersectionTwoArrays {

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set_nums1 = new HashSet<>();
        for(int i: nums1){
            set_nums1.add(i);
        }
        HashSet<Integer> set_nums2 = new HashSet<>();
        for(int i: nums2){
            if(set_nums1.contains(i)){
                set_nums2.add(i);
            }
        }
        int[] result = new int[set_nums2.size()];
        int i=0;
        for(int n: set_nums2){
            result[i++] = n;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1, 3};
        int[] nums2 = {2, 2, 3};
        IntersectionTwoArrays ita = new IntersectionTwoArrays();
        System.out.println(Arrays.toString(ita.intersection(nums1, nums2)));
    }
}
