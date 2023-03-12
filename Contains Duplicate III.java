class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
      int i=0;
      int j=1;
      while(j<nums.length){
        int currdiff=Math.abs(nums[i]-nums[j]);
        int inddiff=Math.abs(i-j);
      
        if(currdiff<=valueDiff && inddiff<=indexDiff){
          return true;
        }
        else if(inddiff==indexDiff || j==nums.length-1){
          j=i++;
        }
        j++;
      }
      return false;
    }
}
      
  
    
