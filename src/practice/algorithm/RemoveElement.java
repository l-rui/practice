package practice.algorithm;

/**
 * Created by l-rui on 2017/4/2.
 * Given an array and a value, remove all instances of that value in place and return the new length.
 * Do not allocate extra space for another array, you must do this in place with constant memory.
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 * 给定数组和值，删除该值的所有实例并返回新长度。
 * 不要为另一个数组分配额外的空间，必须使用常量内存。
 * 元素的顺序可以改变。
 */
public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count++] = nums[i];
            }
        }
        return count;
    }

}
