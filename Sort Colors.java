class Solution {
    public void sortColors(int[] nums) {
      int start=0;
      int end=nums.length-1;
      int temp=0;
      while(temp<=end && start <end){
        if(nums[temp]==0){
          nums[temp]=nums[start];
          nums[start]=0;
          start++;
          temp++;
        }
        else if(nums[temp]==2){
          nums[temp]=nums[end];
          nums[end]=2;
          end--;
        }
        else{
          temp--;
        }
        
    }
}
