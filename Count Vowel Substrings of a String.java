class Solution {
    public int countVowelSubstrings(String word) {
      int count=0;
      int n=word.length();
      for(int i=0;i<n;i++){
        Set<Character> set=nw HashSet();
        for(int j=i;j<n;j++){
          if(!is_vowel(word.charAt(j))) break;
          else set.add(word.charAt(j));
          
        }
        if(set.size()==5) count++;
      }
      return count;
    }
    public boolean is_vowel(char x){
      if(x=='a'|| x=='e'|| x=='i'|| x=='o'|| x=='u') return true;
      return false;
    }
}

             
    
