class Solution {
    public int mostFrequentEven(int[] nums) {
      int[] freq=new int[1000001];
      for(int el:nums){
        freq[el]++;
      }
      int max_freq=0;
      int ans=-1;
      for(int i=0;i<freq.length;i++){
        if(i%2==0 && freq[i]>max_freq){
          max_freq=freq[i];
          ans=i;
        }
      }
      return ans;
    }
}
