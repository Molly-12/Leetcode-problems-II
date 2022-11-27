/*
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
    int range_sum;
    public int rangeSumBST(TreeNode root, int low, int high) {
      range_sum=0;
      get_sum(root,low,high);
      return get_sum;
    }
    public void get_sum(TreeNode root,int low,int high){
      if(root!=null){
        if(root.val>=low && root.val <=high){
          range_sum+=root.val;
        }
        if(root.val >low){
          get_sum(root.left,low,high);
        }
        if(root.val<high){
          get_sum(root.right,low,high);
        }
      }
    }
}
