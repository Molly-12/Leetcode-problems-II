class Solution {
    public int maximumUniqueSubarray(int[] nums) {
      int i=0;
      int j=0;
      int ans=0;
      int sum=0;
      int n= nums.length;
      Set<Integer> set= new HashSet();
      while(i<n && j<n){
        set.add(arr[j]);
        sum+=arr[j];
        ans=Math.max(ans,sum);
        i++;
      }
      else{
        sum-=arr[i];
        set.remove(arr[i]);
        i++;
      }
      return ans;
    }
}
