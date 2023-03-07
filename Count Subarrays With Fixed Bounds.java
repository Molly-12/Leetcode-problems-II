class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
      long ans=0;
      int j=-1;
      int p_min=-1;
      int p_max=-1;
      for(int i=0;i<nums.length;i++){
        if(nums[i]<minK || nums[i]>maxK){
          j=i;
        }
        if(nums[i]==minK){
          p_min=i;
        }
        if(nums[i]==maxk){
          p_max=i;
        }
        ans+=Math.max(0,Math.min(p_min,p_max)-j);
      }
      return ans;
    }
}
    
