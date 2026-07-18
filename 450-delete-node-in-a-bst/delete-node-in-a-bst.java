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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null){
            return null; }
        // left subtree
        if(root.val>key) {
          root.left=deleteNode(root.left,key); }
        // right subtree
        else if(root.val<key) {
            root.right=deleteNode(root.right,key); }
        else  if(root.val==key) {
            // casse 1 leaf node
            if(root.left==null && root.right==null) return null;
            // case 2 1 child
            if(root.left==null) return root.right;
            if(root.right==null) return root.left;
            // case 3 2 child
            if(root.left!=null && root.right!=null) {
                TreeNode succ=findMin(root.right);
                root.val=succ.val;
                root.right=deleteNode(root.right,succ.val); }} 
                return root;}
    public TreeNode findMin(TreeNode root) {
        while(root.left!=null)
        {
            root=root.left;}
        return root;
    }
}