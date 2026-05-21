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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null)return res;
        Queue<TreeNode> q=new LinkedList<>();

        if(root!=null)q.add(root);
        while(!q.isEmpty())
          { 
           int node=q.size();
           List<Integer> current=new ArrayList<>();
           for(int i=0;i<node;i++)
           { root=q.poll();
             current.add(root.val);
             if(root.left!=null)   q.add(root.left);
             if(root.right!=null)    q.add(root.right);
           }
           res.add(current);
          }
          return res;
         
    }  
}