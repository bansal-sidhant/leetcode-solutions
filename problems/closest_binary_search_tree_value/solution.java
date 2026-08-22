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
    public int closestValue(TreeNode root, double target) {
      TreeNode current = root;
      int closest = (int) root.val;

        while(current != null) {
            double currentDiff = Math.abs(current.val- target);
            double closestDiff = Math.abs(closest - target);

            if(currentDiff < closestDiff) {
                closest = current.val;
            } else if(currentDiff == closestDiff && current.val < closest) {
                closest = current.val;
            }

            if(current.val < target) {
                current = current.right;
            } else if(current.val >  target) {
                current = current.left;
            } else {
                break;
            }
        }
       // System.out.println(result);
        return closest;
    }
}