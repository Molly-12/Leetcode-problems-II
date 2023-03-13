class Solution {
    public int characterReplacement(String s, int k) {
      int n=s.length();
      int[] ch= new int[26];
      int start=0;
      int len=0;
      int count=0;
      for(int i=0;i<n;i++){
        ch[s.charAt(i)-'A']++;
        count=Math.max(count,ch[s.charAt(i)-'A']);
        while(i-start-count+1>k){
          ch[s.charAt(start)-'A']--;
          start++;
        }
        len=Math.max(len,i-start+1);
      }
      return len;
    }
}
   
