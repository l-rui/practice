package practice.algorithm;

/**
 * Created by lirui on 2017/3/24.
 * There are N children standing in a line. Each child is assigned a rating value.
 * You are giving candies to these children subjected to the following requirements:
 * 1、Each child must have at least one candy.
 * 2、Children with a higher rating get more candies than their neighbors.
 * What is the minimum candies you must give?
 * 有N个孩子站在一排。 每个孩子被分配一个评分值。
 * 你给这些孩子糖果满足以下要求：
 * 1、每个孩子至少分到一个苹果
 * 2、评分较高的孩子比他们的邻居获得更多的糖果。
 * 那么最少需要给出多少个糖果？
 * 思路：
 * 如果一个孩子比另一个孩子的分高，我们只多给1块糖。
 * 我们可以先从左往右遍历，确保每个孩子根他左边的孩子相比，如果分高，则糖要多1个，
 * 如果分比左边低，就只给一颗。然后我们再从右往左遍历，确保每个孩子跟他右边的孩子相比，
 * 如果分高则糖至少多1个（这里至少多1个的意思是，我们要取当前孩子手里糖的数量，和其右边孩子糖的数量加1，两者的较大值）。
 */
public class Candy {

    public int candy(int[] ratings) {
        if (null == ratings) return 0;
        if (ratings.length <= 1) return ratings.length;

        int[] candies = new int[ratings.length];
        int sum = 0;

        // 从前往后遍历，保证后一个评分高的孩子比当前孩子多一个糖果
        for (int i = 0; i < ratings.length - 1; i++) {
            // 第一个孩子给一个糖果
            if (i == 0) candies[i] = 1;
            // 如果后一个孩子评分高，则给后一个孩子糖果数+1，否则只给一个糖果
            if (ratings[i] < ratings[i + 1]) {
                candies[i + 1] = candies[i] + 1;
            } else {
                candies[i + 1] = 1;
            }
        }

        // 从后往前遍历，保证前一个评分高的孩子比当前孩子多一个糖果
        for (int i = ratings.length - 1; i >= 1; i--) {
            // 如果前一个孩子评分高，则确保前一个孩子比（当前孩子糖果数+1）多；
            if (ratings[i] < ratings[i - 1]) {
                candies[i - 1] = candies[i] + 1 > candies[i - 1] ? candies[i] + 1 : candies[i - 1];
            }
            // 顺便求和
            sum += candies[i];
            if (i == 1) sum += candies[i - 1];
        }
        return sum;
    }

}
