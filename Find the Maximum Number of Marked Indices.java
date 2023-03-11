class Solution {
    public int maxNumOfMarkedIndices(int[] arr) {
      Arrays.sort(arr);
      int n=arr.length;
      int ind=0;
      int mid=(n+1)/2;
      int ans=0;
      while(mid<n){
        if(arr[ind]*2<=arr[mid]){
          ind++;
          ans+=2;
        }
        mid++;
      }
      return ans;
    }
}
