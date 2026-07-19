/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root.val==p.val && root.val==q.val)return root;
       else  if(root.val>p.val && root.val>q.val)
        {
            // left subtree
             TreeNode leftAns=lowestCommonAncestor(root.left,p,q);
             return leftAns;
        }
         else  if(root.val<p.val && root.val<q.val)
        {
            // right subtree
              TreeNode rightAns=lowestCommonAncestor(root.right,p,q);
              return rightAns;
        }
        
        return root;
    }
}