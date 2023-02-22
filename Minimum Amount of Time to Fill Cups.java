class Solution {
    public int fillCups(int[] amount) {
      int total=0;
      int max=0;
      for(int i: amount){
        total+=i;
        max=Math.max(max,i);
      }
      return Math.max(max,(total+1)/2);
    }
}
