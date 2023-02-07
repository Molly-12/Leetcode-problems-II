class Solution {
    public int divisorSubstrings(int num, int k) {
      int ans=0;
      String str=Integer.toString(num);
      for(int i=0;i+k<str.length();i++){
        String temp=str.substring(i,i+k);
        int n=Integer.toParseInt(temp);
        if(n>0 && num%n==0){
          ans++;
        }
      }
      return ans;
    }
}
    
