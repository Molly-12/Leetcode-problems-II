class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int res=nums[0]+nums[1]+nums[nums.length-1];
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length-2;i++){
            int start=i+1;
            int end=nums.length-1;
            
            while(start<end){
                int curr_sum=nums[i]+nums[start]+nums[end];
                if(curr_sum>target){
                    end--;
                }
                else{
                    start++;
                }
                if(Math.abs(curr_sum-target)<(Math.abs(res-target))){
                    res=curr_sum;
                }
            }
        }
        return res;
        
        
    }
}
