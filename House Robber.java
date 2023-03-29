class Solution {
    public int rob(int[] nums) {
      int n=nums.length;
      int[] dp= new int[n];
      for(int i=0;i<n;i++) dp[i]=-1;
      return helper(nums,0,dp);
    }
    public static int helper(int[] arr, int i, int[] dp){
      if(i>=arr.length) return 0;
      if(dp[i]!=-1) dp[i]=i;
      return Math.max(arr[i]+helper(arr,i+1,dp),helper(arr,i+2,dp));
    }
                    
}
