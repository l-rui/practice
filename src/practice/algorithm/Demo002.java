package practice.algorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo002 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        Map<String, Integer> map = new HashMap<String, Integer>();
        String[] words = line.split(" ");
        for (String word : words) {
            word = word.replace(",", "").replace(".", "").replace(":", "").toLowerCase();
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }
        WordCount[] wordCounts = new WordCount[map.size()];
        int i = 0;
        for (String key : map.keySet()) {
            wordCounts[i] = new WordCount(key, map.get(key));
            i++;
        }
        sort(wordCounts, 0, wordCounts.length - 1);
        for (WordCount wordCount : wordCounts) {
            System.out.println(wordCount.getWord() + " " + wordCount.getCount());
        }
    }

    // 简单的快排
    public static WordCount[] sort(WordCount[] nums, int left, int right) {
        if (left > right) {
            return nums;
        }
        // 设置基准数
        WordCount t = nums[left];
        int i = left;
        int j = right;
        while (i != j) {
            // 从右往左，如果j位的数大于等于基准数，或者j小于等于i，停止循环
            while(nums[j].compareTo(t) >= 0 && i<j) {
                j--;
            }
            // 从左往右，如果j位的数小于等于基准数，或者j小于等于i，停止循环
            while(nums[i].compareTo(t) <= 0 && i<j) {
                i++;
            }
            // 将i和j对应的两个数的位置交换
            if (i < j) {
                WordCount temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        // 基准数归位
        nums[left] = nums[i];
        nums[i] = t;
        // 递归处理左右两个子集
        sort(nums, left, i - 1);
        sort(nums, i + 1, right);

        return nums;
    }


    static class WordCount implements Comparable {

        private String word;

        private int count;

        public String getWord() {
            return word;
        }

        public void setWord(String word) {
            this.word = word;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public WordCount() {
        }

        public WordCount(String word, int count) {
            this.word = word;
            this.count = count;
        }

        @Override
        public int compareTo(Object o) {
            WordCount wd = (WordCount)o;
            if (wd.count > this.count) {
                return 1;
            } else if (wd.count < this.count) {
                return -1;
            } else {
                return this.word.compareTo(wd.getWord());
            }
        }
    }
}
