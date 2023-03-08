class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
      PriorityQueue<Integer> pq= new PriorityQueue();
      for(int i:nums){
        pq.add(i);
      }
      while(k>0){
        pq.add(-pq.poll());
        k--;
      }
      int res=0;
      while(!pq.isEmpty()){
        res+=pq.poll();
      }
      return res;
    }
}
