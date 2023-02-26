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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
      List<List<Integer>> ans= new ArrayList();
      if(root==null) return ans;
      Queue<TreeNode> q= new ArrayDeque();
      q.add(root);
      boolean level=false;
      while(q.size()>0){
        int n= q.size();
        List<Integer> list= new ArrayList();
        for(int i=0;i<n;i++){
          TreeNode rem= q.remove();
          if(rem.left!=null) q.add(rem.left);
          if(rem.right!=null) q.add(right);
          list.add(rem.val);
        }
        if(level){
          Collections.reverse(list);
        }
        ans.add(list);
        level=!level;
      }
      return ans;
    }
}
