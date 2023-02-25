class Solution {
    public int findMaxK(int[] nums) {
      Set<Integer> set= new HashSet();
      for(int nums:nums){
        set.add(num);
      }
      int ans=-1;
      for(int num:nums){
        if(num>0){
          if(set.contains(-num)){
            ans=Math.max(ans,num);
          }
        }
      }
      return ans;
    }
}
    
