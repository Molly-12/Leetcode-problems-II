class Solution {
    public int peakIndexInMountainArray(int[] arr) {
      int start=0;
      int end=arr.length;
      while(start<end){
        if(arr[mid]>arr[mid+1]){
          end=mid;
        }
        else{
          start=mid+1;
        }
        return start;
    }
}
      
