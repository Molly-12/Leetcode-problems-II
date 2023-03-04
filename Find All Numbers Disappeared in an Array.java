class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
      List<Integer> ans= new ArrayList();
      int i=0;
      while(i<nums.length){
        int correct_index=nums[i]-1;
        if(nums[i]<nums.length && nums[i]!=nums[coreect_index]){
          swap(nums,i,correct_index);
        }
        else{
          i++;
        }
      }
      for(int j=0;j<nums.length;j++){
        if(nums[j]!=j+1){
          ans.add(j+1);
        }
        return ans;
    }
    public void swap(int[] nums,int first, int second){
      int temp=nums[first];
      nums[first]=nums[second];
      nums[second]=nums[first];
    }
}
      

      
        
      
      
   
