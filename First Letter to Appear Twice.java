class Solution {
    public char repeatedCharacter(String s) {
      char c=' ';
      Set<Character> set= new HashSet();
      for(int i=0;i<s.length();i++){
        if(set.contains(s.charAt(i))){
          c=s.charAt(i);
        }
        set.add(s.charAt(i));
      }
      return c;
    }
}
           
        
    
