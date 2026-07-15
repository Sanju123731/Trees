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
        if(root==null) return null;
        if((root==p)||(root==q)) return root;
           
            // left ma answer
            TreeNode leftAns=lowestCommonAncestor(root.left,  p,
              q) ;
    
            //  right ma answer
              TreeNode rightAns=lowestCommonAncestor(root.right,
                p, q) ;
              if(leftAns==null && rightAns==null)
               return null;
                if(leftAns!=null && rightAns==null)
                return leftAns;
               if(leftAns==null && rightAns!=null)
                return rightAns; 
                // if(leftAns!=null && rightAns!=null)
                return root; 

    }
}