class Solution {
    public String modifyString(String s) {
      if(s==null || s.length()==0) return "";
      char[] c=s.toCharArray();
      for(int i=0;i<c;i++){
        if(c[i]=='?'){
          for(char j='a';j<='z';j++){
            c[i]=j;
            if(i>0 && c[i-1]=j) continue;
            if(i<s.length-1 && c[i+1]==j) continue;
            break;
          }
        }
      }
      return new String(c);
    }
}
