class Solution {
    public int[] searchRange(int[] nums, int target) {
      int[] res=new int[2];
      res[0]=start_index(nums,target);
      res[1]=end_index(nums,target);
      return res;
    }
    public int start_index(int[] nums,int target){
      int index=-1;
      int start=0;
      int end=nums.length-1;
      
      while(start<=end){
        int midpoint=start+(end-start)/2;
        if(nums[midpoint==target){
          index=midpoint;
        }
        if(nums[midpoint]>=target){
          end=midpoint-1;
        }
        else{
          start=midpoint+1;
        }
     }
    return index;
  }
     public int end_index(int[] nums,int target){
      int index=-1;
      int start=0;
      int end=nums.length-1;
      
      while(start<=end){
        int midpoint=start+(end-start)/2;
        if(nums[midpoint==target){
          index=midpoint;
        }
        if(nums[midpoint]<=target){
          start=midpoint+1;
        }
        else{
          end=midpoint-1;
        }
     }
    return index;
  }
}
                
                
                
      
      
    
