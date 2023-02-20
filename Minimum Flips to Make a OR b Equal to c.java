class Solution {
    public int minFlips(int a, int b, int c) {
      int ans=0;
      while(c!=0 || b!=0 || a!=0){
        if((c&1)==1){
          if((a&1)==0 && (b&1)==0) ans++;
        }
        else{
          if((a&1)==1 && (b&1)==1) ans+=2;
          else if((a&1)==1 || (b&1)==1) ans++;
        }
        c=c>>1;
        b=b>>1;
        a=a>>1;
      }
      return ans;
    }
}

    
