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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        StringBuilder rootSb = new StringBuilder();
        StringBuilder subSb = new StringBuilder();
        preOrder(root, rootSb);
        preOrder(subRoot, subSb);
        
        return rootSb.toString().contains(subSb.toString());
    }

    private void preOrder(TreeNode node, StringBuilder sb) {
        if (node == null) {
            sb.append("#,"); 
            return;
        }

        sb.append(node.val).append(",");

        preOrder(node.left, sb);
        preOrder(node.right, sb);
    }
}
