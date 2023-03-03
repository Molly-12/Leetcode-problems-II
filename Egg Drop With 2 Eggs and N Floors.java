class Solution {
    public int twoEggDrop(int n) {
      int[][] dp= new int[n+1][3];
      int m=0;
      while(dp[m][2]<n){
        ++m;
      }
      for(int i=1;i<=2;i++){
        dp[m][i]=dp[m-1][i-1]+dp[m-1][k]+1;
      }
      return m;
    }
}
