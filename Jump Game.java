class Solution {
    public boolean canJump(int[] nums) {
      int last_Good_index=nums.length-1;
      
      for(int i=last_Good_index;i>=0;i--){
        if(nums[i]+i>=last_Good_index){
          last_Good_index=i;
        }
      }
      return last_Good_index==0;
    }
}
