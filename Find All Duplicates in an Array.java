class Solution {
    public List<Integer> findDuplicates(int[] nums) {
      List<Integer> ans= new ArrayList();
      int i=0;
      while(i<nums.length){
        int corr=nums[i]-1;
        if(nums[i]!=nums[corr]){
          swap(nums,i,corr);
        }
        else{
          i++;
        }
      }
      for(int j=0;j<nums.length;j++){
        if(nums[j]!=j+1){
          ans.add(nums[j]);
        }
      }
      return ans;
    }
    public void swap(int[] nums, int f, int s){
      int temp=nums[f];
      nums[f]=nums[s];
      nums[s]=temp;
    }
      
}
      
   
