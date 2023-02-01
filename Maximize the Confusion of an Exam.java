class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
      char[] s=answerKey.toCharArray();
      return Math.max(slidingWindow(s,k,'T'),slidingWindow(s,k,'F'));
    }
    public int slidingWindow(char[] s,int k,char target){
      int ans=0;
      int count=0;
      int i=0;
      int j=0;
      int n=s.length;
      while(j<n){
        if(s[j]==target){
          count++;
        }
        if(count>n){
          if(s[i]==target){
            count--;
          }
          i++;
          
        }
        ans=Math.max(ans,j-i+1);
          j++;
        
      }
      return ans;
    }
}

      
