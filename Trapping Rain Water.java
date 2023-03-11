class Solution {
    public int trap(int[] height) {
      int maxleft=0;
      int maxright=0;
      int i=0;
      int j=height.length-1;
      int water=0;
      while(i<j){
        if(height[i]<=height[j]){
          maxright=Math.max(maxright,height[i]);
          water+=maxright-height[i];
          i++;
        }
        else{
          maxleft=Math.max(maxleft,height[j]);
          water+=maxleft-height[j];
          j--;
        }
      }
      return water;
        
    }
}
