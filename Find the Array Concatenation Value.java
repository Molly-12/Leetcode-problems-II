class Solution {
    public long findTheArrayConcVal(int[] nums) {
      int p1=0;
      int p2=0;
      long ans=0;
      String s="";
      while(p1<=p2){
        if(p1==p2){
          s=String.valueOf(nums[p1]);
        }
        else{
          s=String.valueOf(nums[p1])+String.valueOf(nums[p2]);
        }
        sum+=Integer.parseInt(s);
        p1++;
        p2--;
      }
      return sum;
    }
}
