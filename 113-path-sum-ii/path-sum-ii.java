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
    public void helper(TreeNode root,  List<List<Integer>> ans,List<Integer>currPath ,int targetSum){
    if(root==null) return;
    if(root!=null && root.left==null && root.right==null)
    {
         currPath.add(root.val);
        if(targetSum==root.val)
        {
           List<Integer> a=new ArrayList<>();
           for(int i=0;i<currPath.size();i++)
           {
            a.add(currPath.get(i));
           }
           ans.add(a);

        }
        currPath.remove(currPath.size()-1);
    }
     currPath.add(root.val);
     helper(root.left,ans,currPath,targetSum-root.val);
     helper(root.right,ans,currPath,targetSum-root.val);
     currPath.remove(currPath.size()-1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> currPath=new ArrayList<>();
        helper(root,ans,currPath,targetSum);
        return ans;

    }
}