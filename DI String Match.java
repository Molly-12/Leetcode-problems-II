class Solution {
    public int[] diStringMatch(String s) {
      
      int size=s.length();
      int low=0;
      int high=size;
      int[] res_arr=new int[size+1];
      
      for(int i=0;i<n;i++){
        if(s.charAt(i)=='I'){
          res_arr[i]=low;
          low++;
        }
        else{
          res_arr[i]=high;
          high--;
        }
      }
      res_arr[size]=low;
      return res_arr;
          
    }
}
