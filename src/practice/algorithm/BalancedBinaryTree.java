package practice.algorithm;

/**
 * Created by lirui on 2017/3/27.
 * Given a binary tree, determine if it is height-balanced.
 * 给定一个二叉树，确定它是否高度均衡。
 * 思路：
 * 使用递归，分别判断左右两棵子树是不是平衡二叉树，如果都是并且左右两颗子树的高度相差不超过1，那么这棵树就是平衡二叉树。
 */
public class BalancedBinaryTree {

    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }
        if(root.left==null && root.right==null){
            return true;
        }
        if(Math.abs(depth(root.left)-depth(root.right)) > 1){
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }

    public int depth(TreeNode root){
        if(root==null){
            return 0;
        }
        return 1+Math.max(depth(root.left), depth(root.right));
    }

}
