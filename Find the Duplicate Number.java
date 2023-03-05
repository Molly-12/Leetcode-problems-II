class Solution{
    public int findDuplicate(int[] nums){
      int i=0;
      while(i<nums.length){
        if(nums[i]!=i+1){
          int corr=nums[i]-1;
          if(nums[i]!=corr){
            swap(nums,i,corr);
          }
          else{
            return nums[i];
          }
        }
        else{
          i++;
        }
      }
      return -1;
    }
    public void swap(int[] arr, int f,int s){
      int temp=arr[f];
      arr[f]=arr[s];
      arr[s]=temp;
    }
}
