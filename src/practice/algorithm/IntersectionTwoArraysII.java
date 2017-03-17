package practice.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by l-rui on 2017/3/17.
 * Given two arrays, write a function to compute their intersection.
 * 给定两个数组，写一个函数来计算它们的交集。
 */
public class IntersectionTwoArraysII {

    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list=new ArrayList<>();
        for(int i=0,j=0;i<nums1.length&&j<nums2.length;){
            if(nums1[i]==nums2[j]){
                list.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i]>nums2[j]){
                j++;
            }else{
                i++;
            }
        }
        int[]res=new int[list.size()];
        for(int i=0;i<res.length;i++){
            res[i]=list.get(i);
        }
        return res;
    }

}
