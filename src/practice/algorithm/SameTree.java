package practice.algorithm;

/**
 * Created by lirui on 2017/4/21.
 * Given two binary trees, write a function to check if they are equal or not.
 * 给定两个二叉树，写一个函数来检查它们是否相等。
 * 思路：递归
 */
public class SameTree {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null&&q == null) return true;
        if (p == null||q == null) return false;
        return (p.val == q.val) && isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }

}
