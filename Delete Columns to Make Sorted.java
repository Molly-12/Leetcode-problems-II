class Solution {
    public int minDeletionSize(String[] strs) {
      int res=0;
      
      for(int i=0;i<strs[0].length;i++){
        for(int j=0;j<strs.length-1;j++){
          if(strs[i].charAt(j)>strs[i+1].charAt(j)){
            res++;
            break;
          }
        }
      }
      return res;
    }
}
