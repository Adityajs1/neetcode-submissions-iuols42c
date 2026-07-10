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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null)return null;
        // put the root's value in a variable called curr
        int curr = root.val;

        //checking the root's value wrt to p and q to clarify which direction to move
        if(curr < p.val &&  curr <  q.val)return lowestCommonAncestor(root.right, p, q);
        if(curr > p.val && curr > q.val)return lowestCommonAncestor(root.left, p, q);

        return root;
    }
}
