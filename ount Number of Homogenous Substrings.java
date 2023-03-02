class Solution {
    public int countHomogenous(String s) {
      int mod=1000000007;
      long total=0;
      int count=0;
      char c=s.charAt(0);
      for(int i=0;i<s.length();i++){
        if(s.charAt(i)==c){
          count++;
          total+=count;
        }
        else{
          c=s.charAt(i);
          count=1;
          total+=count;
        }
      }
      return (int)(total%mod);
    }
}
      
        
    
