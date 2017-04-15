package practice.algorithm;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by l-rui on 2017/4/15.
 * Invert a binary tree.
 * 反转二叉树。
 * 思路：
 * 迭代法的思路是BFS或者DFS，这两种方法都可以实现，实际上也是二叉树的遍历。BFS用Queue实现，DFS的话将代码中的Queue换成Stack。
 */
public class InvertBinaryTree {

    public TreeNode invertTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        if(root!=null) q.offer(root);
        while(!q.isEmpty()){
            TreeNode curr = q.poll();
            TreeNode tmp = curr.right;
            curr.right = curr.left;
            curr.left = tmp;
            if(curr.left!=null) q.offer(curr.left);
            if(curr.right!=null) q.offer(curr.right);
        }
        return root;
    }

}
