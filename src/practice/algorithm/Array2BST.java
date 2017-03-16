package practice.algorithm;

/**
 * Created by l-rui on 2017/3/9.
 * Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
 * 给定一个升序排列的int数组，将其转化为一个平衡的二叉搜索树。
 * 思路：如果数组是空的，返回空。否则，取出中间值，作为定点，左边元素为左子树，右边元素为右子树。构造过程使用递归。
 */
public class Array2BST {

    public TreeNode sortedArrayToBST(int[] nums) {

        if (nums.length == 0) {
            return null;
        }
        build(nums, 0, nums.length - 1);
        return null;
    }

    private TreeNode build(int[] nums, int first, int last) {
        if(first > last) {
            return null;
        }
        int mid = (first + last) / 2;
        TreeNode treeNode = new TreeNode(nums[mid]);
        treeNode.left = build(nums, first, mid -1);
        treeNode.right = build(nums, mid + 1, last);
        return treeNode;
    }

    public static void main(String[] args) {
        Array2BST array2BST = new Array2BST();
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        array2BST.sortedArrayToBST(nums);
    }

}