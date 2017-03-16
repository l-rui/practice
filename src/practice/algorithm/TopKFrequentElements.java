package practice.algorithm;

import java.util.*;

/**
 * Created by l-rui on 2017/3/8.
 * Given a non-empty array of integers, return the k most frequent elements.
 * 给定一个非空的int数组，返回前k个出现次数最多的元素
 * 思路：
 * 1、定义Element类，代表某个数字出现的次数；
 * 2、遍历给定的数组，并统计每个数字出现的次数，结果保存到HashMap<Integer, Element>中；
 * 3、取出所有的Element并对其排序，最后取出前K个Element的num值并返回。
 */
public class TopKFrequentElements {

    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> res = new ArrayList<>();
        List<Element> elements = new ArrayList<>();
        Map<Integer, Element> temp = new HashMap<>();
        for (int num : nums) {
            if (temp.containsKey(num)) {
                Element e = temp.get(num);
                e.setFrequent(e.getFrequent() + 1);
                temp.put(num, e);
            } else {
                temp.put(num, new Element(num, 1));
            }
        }
        Set<Integer> keys = temp.keySet();
        for (Integer key : keys) {
            elements.add(temp.get(key));
        }
        Collections.sort(elements);
        for (int i = 0; i< k; i++) {
            res.add(elements.get(i).getNum());
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3, 5};
        int k = 2;
        TopKFrequentElements tkfe = new TopKFrequentElements();
        List<Integer> res = tkfe.topKFrequent(nums, k);
        System.out.println(res);
    }


}

class Element implements Comparable<Element>{

    private int num;

    private int frequent;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getFrequent() {
        return frequent;
    }

    public void setFrequent(int frequent) {
        this.frequent = frequent;
    }

    public Element() {

    }

    public Element(int num, int frequent) {

        this.num = num;
        this.frequent = frequent;
    }

    @Override
    public int compareTo(Element o) {
        return (o.getFrequent() - this.frequent);
    }
}