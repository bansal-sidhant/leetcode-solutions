/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = computeLeftDepth(root);
        int right = computeRightDepth(root);
        if(left == right) {
            return (1 << (left + 1)) - 1;
        } else {
            return 1 + countNodes(root.left) + countNodes(root.right);
        }
       

    }

    public int computeLeftDepth(TreeNode node) {
        int length = 0;
        while(node.left != null) {
            length++;
            node = node.left;

        }
        return length;
    }

    public int computeRightDepth(TreeNode node) {
        int length = 0;
        while(node.right != null) {
            length++;
            node = node.right;

        }
        return length;
    }

}
