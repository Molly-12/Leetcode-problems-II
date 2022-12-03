class Solution {
    public List<List<Integer>> permute(int[] nums) {
      List<List<Integer>> res=new ArrayList();
      backtrack(res,nums,0);
      return res;
    }
    public void backtrack(List<List<Integer>> res,int[] nums,int start){
      if(start==nums.length){
        res.add(toList(nums));
      }
      else{
        for(int i=start;i<nums.length;i++){
          swap(i,start,nums);
          backtrack(i,nums,start+1);
          swap(i,start,nums);
        }
      }
    }
    public List<Integer> toList(int[] nums){
      List<Integer> ans=new ArrayList();
      for(int i:nums){
        ans.add(i);
      }
      return ans;
    }
    public void swap(int i,int j,int[] nums){
      int temp=nums[i];
      nums[i]=nums[j];
      nums[j]=temp;
    }
}
          
