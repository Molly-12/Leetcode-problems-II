class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
      Set<Integer> set=new HashSet();
      for(int i:banned){
        set.add(i);
      }
      int count=0;
      int curr_sum=0;
      for(int i=1;i<=n;i++){
        if(set.contains(i)){
          continue;
        }
        if(curr_sum+i<=maxSum){
          curr_sum+=i;
          count++;
        }
        else{
          break;
        }
      }
      return count;
    }
}
    
