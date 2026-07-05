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
    public int maxPathSum(TreeNode root) {
        int[] sum = new int[1];
        sum[0] = Integer.MIN_VALUE;
        length(root, sum);
        return sum[0];
    }
    private int length(TreeNode node, int[] sum){
      if(node == null)return 0;

      int lh = Math.max(0, length(node.left, sum));
      int rh = Math.max(0, length(node.right, sum));

      sum[0] = Math.max(sum[0],node.val + lh + rh);
      return node.val + Math.max(lh, rh);
       
    }
}
