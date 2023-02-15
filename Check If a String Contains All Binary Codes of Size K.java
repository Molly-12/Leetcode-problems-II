class Solution {
    public boolean hasAllCodes(String s, int k) {
      if(s.length()<k) return false;
      Set<String> set=new HashSet();
      for(int i=0,j<k-1;j<s.length();i++,j++){
        String s1=s.substring(i,j+1);
        set.add(s1);
      }
      return (set.size()==Math.pow(2,k));
    }
}
    
