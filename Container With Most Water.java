class Solution {
    public int maxArea(int[] height) {
      int left=0;
      int right=height.length-1;
      int max=0;
      while(left<right){
        int h=right-left;
        int w=Math.min(height[left],height[right]);
        int a=h*w;
        max=Math.max(max,a);
        if(height[left]<height[right]) left++;
        else if(height[left]>height[right]) right--;
        else{
          left++;
          right--;
        }
      }
      return max;
    }
}
