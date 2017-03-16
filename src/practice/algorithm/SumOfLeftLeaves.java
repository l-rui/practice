package practice.algorithm;

/**
 * Created by l-rui on 2017/3/16.
 * Find the sum of all left leaves in a given binary tree.
 * 找到给定二叉树中所有左叶的总和。
 * 思路：递归遍历，判断该节点是否存在左节点，如果有，则判断其左节点是否是叶子节点，若是则将值累加
 */
public class SumOfLeftLeaves {

    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null) return 0;
        int[] res = {0};
        collect(root, res);
        return res[0];
    }

    private void collect(TreeNode root, int[] res){
        if(root == null) return;
        if(root.left!=null){
            if(root.left.left == null && root.left.right == null){
                res[0] += root.left.val;
            }
        }
        collect(root.left, res);
        collect(root.right, res);
    }

}
